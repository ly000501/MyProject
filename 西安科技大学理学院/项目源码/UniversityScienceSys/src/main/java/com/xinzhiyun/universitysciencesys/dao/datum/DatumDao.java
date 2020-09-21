package com.xinzhiyun.universitysciencesys.dao.datum;

import com.xinzhiyun.universitysciencesys.pojo.datum.Datum;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 资料下载dao层
 * @author: Mr.Ling
 * @create: 2020-08-27 17:54
 **/
@Repository
public interface DatumDao {
    /**使用分页查找所有资料下载*/
    @Select("select datum_id,datum_title,date,file_name,file,number,type from datum order by type limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Datum> findDatumAll(Map<String, Object> map);

    /**查找所有资料下载总数*/
    @Select("select count(datum_id) from datum")
    int findDatumNum();

    /**根据资料下载编号查找查找资料下载*/
    @Select("select datum_id,datum_title,date,file_name,file,number,type from datum where datum_id = #{datum_id}")
    Datum findDatumById(@Param("datum_id") Integer datum_id);

    /**根据资料下载标题或文件名查找查找资料下载*/
    @Select("select datum_id,datum_title,date,file_name,file,number,type from datum where file_name = #{file_name}")
    Datum findDatumByFileName(@Param("file_name") String file_name);

    /**根据资料类型查找资料下载*/
    @Select("select datum_id,datum_title,date,file_name,file,number,type from datum where type = #{type} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Datum> findDatumByType(Map<String, Object> map);

    /**根据资料下载编号修改资料下载*/
    @Update("update datum set datum_title = #{datum_title},date=#{date},file_name=#{file_name},file=#{file},type=#{type},number=#{number} where datum_id =#{datum_id}")
    Integer updateDatumById(Datum datum);

    /**增加资料下载*/
    @Insert("insert into datum (datum_title,date,file_name,file,type) values(#{datum_title},#{date},#{file_name},#{file},#{type})")
    Integer addDatum(Datum datum);

    /**根据编号删除资料下载*/
    @Delete(" delete from Datum where datum_id = #{datum_id}")
    Integer deleteDatumById(@Param(value = "datum_id") Integer datum_id);
}
