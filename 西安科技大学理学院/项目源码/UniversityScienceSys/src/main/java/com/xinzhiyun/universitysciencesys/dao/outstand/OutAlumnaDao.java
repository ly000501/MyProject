package com.xinzhiyun.universitysciencesys.dao.outstand;

import com.xinzhiyun.universitysciencesys.pojo.outstand.OutAlumna;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 杰出校友Dao层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-25 16:41
 **/
@Repository
public interface OutAlumnaDao {
    /**使用分页查找所有杰出校友*/
    @Select("select outstand_id,outstand_name,hiredate,job,photo,brief from outstand_alumna limit ${(pageNum-1)*pageSize},${pageSize}")
    List<OutAlumna> findOutAlumnaAll(Map<String,Object> map);

    /**查找所有杰出校友总数*/
    @Select("select count(outstand_id) from outstand_alumna")
    int findOutAlumnaNum();

    /**根据杰出校友编号查找查找杰出校友*/
    @Select("select outstand_id,outstand_name,hiredate,job,photo,brief from outstand_alumna where outstand_id = #{outstand_id}")
    OutAlumna findOutAlumnaById(@Param("outstand_id")Integer outstand_id);

    /**根据杰出校友编号修改杰出校友*/
    @Update("update outstand_alumna set outstand_name = #{outstand_name},hiredate=#{hiredate},job=#{job},photo=#{photo},brief=#{brief} where outstand_id =#{outstand_id}")
    Integer updateOutAlumnaById(OutAlumna outAlumna);

    /**增加杰出校友*/
    @Insert("insert into outstand_alumna (outstand_name,hiredate,job,photo,brief) values(#{outstand_name},#{hiredate},#{job},#{photo},#{brief})")
    Integer addOutAlumna(OutAlumna outAlumna);

    /**根据编号删除杰出校友*/
    @Delete(" delete from outstand_alumna where outstand_id = #{outstand_id}")
    Integer deleteOutAlumnaById(@Param(value="outstand_id")Integer outstand_id);
}
