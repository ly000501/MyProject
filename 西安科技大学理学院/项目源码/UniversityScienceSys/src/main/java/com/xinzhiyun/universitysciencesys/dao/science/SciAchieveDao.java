package com.xinzhiyun.universitysciencesys.dao.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciAchieve;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 研究成果dao层
 * @author: Mr.Wang
 * @create: 2020-08-25 11:23
 **/
@Repository
public interface SciAchieveDao {
    /**使用分页查找所有研究成果*/
    @Select("select science_id,science_title,person,date,content from science_achieve limit ${(pageNum-1)*pageSize},${pageSize}")
    List<SciAchieve> findSciAchieveAll(Map<String, Object> map);

    /**查找所有研究成果总数*/
    @Select("select count(science_id) from science_achieve")
    int findSciAchieveNum();

    /**根据研究成果编号查找查找研究成果*/
    @Select("select science_id,science_title,person,date,content from science_achieve where science_id = #{science_id}")
    SciAchieve findSciAchieveById(@Param("science_id") Integer science_id);

    /**根据研究成果编号修改研究成果*/
    @Update("update science_achieve set science_title = #{science_title},person=#{person},date=#{date},content=#{content} where science_id =#{science_id}")
    Integer updateSciAchieveById(SciAchieve sciAchieve);

    /**增加研究成果*/
    @Insert("insert into science_achieve (science_title,person,date,content) values(#{science_title},#{person},#{date},#{content})")
    Integer addSciAchieve(SciAchieve sciAchieve);

    /**根据编号删除研究成果*/
    @Delete(" delete from science_achieve where science_id = #{science_id}")
    Integer deleteSciAchieveById(@Param(value = "science_id") Integer science_id);
}
