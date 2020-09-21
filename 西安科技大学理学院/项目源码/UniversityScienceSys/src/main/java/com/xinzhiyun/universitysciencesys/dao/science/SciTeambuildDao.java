package com.xinzhiyun.universitysciencesys.dao.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciTeambuild;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 团队建设dao层
 * @author: Mr.Wang
 * @create: 2020-08-25 11:23
 **/
@Repository
public interface SciTeambuildDao {
    /**使用分页查找所有团队建设*/
    @Select("select science_id,science_title,person,date,content from science_teambuild limit ${(pageNum-1)*pageSize},${pageSize}")
    List<SciTeambuild> findSciTeambuildAll(Map<String, Object> map);

    /**查找所有团队建设总数*/
    @Select("select count(science_id) from science_teambuild")
    int findSciTeambuildNum();

    /**根据团队建设编号查找查找团队建设*/
    @Select("select science_id,science_title,person,date,content from science_teambuild where science_id = #{science_id}")
    SciTeambuild findSciTeambuildById(@Param("science_id") Integer science_id);

    /**根据团队建设编号修改团队建设*/
    @Update("update science_teambuild set science_title = #{science_title},person=#{person},date=#{date},content=#{content} where science_id =#{science_id}")
    Integer updateSciTeambuildById(SciTeambuild sciTeambuild);

    /**增加团队建设*/
    @Insert("insert into science_teambuild (science_title,person,date,content) values(#{science_title},#{person},#{date},#{content})")
    Integer addSciTeambuild(SciTeambuild sciTeambuild);

    /**根据编号删除团队建设*/
    @Delete(" delete from science_teambuild where science_id = #{science_id}")
    Integer deleteSciTeambuildById(@Param(value = "science_id") Integer science_id);
}
