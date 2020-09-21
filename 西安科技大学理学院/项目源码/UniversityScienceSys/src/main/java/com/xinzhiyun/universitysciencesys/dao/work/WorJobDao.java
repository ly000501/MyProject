package com.xinzhiyun.universitysciencesys.dao.work;

import com.xinzhiyun.universitysciencesys.pojo.work.WorJob;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 就业信息dao层
 * @author: Mr.Ling
 * @create: 2020-08-25 17:09
 **/
@Repository
public interface WorJobDao {
    /**使用分页查找所有就业信息*/
    @Select("select work_id,work_title,person,date,content from work_job limit ${(pageNum-1)*pageSize},${pageSize}")
    List<WorJob> findWorJobAll(Map<String, Object> map);

    /**查找所有就业信息总数*/
    @Select("select count(work_id) from work_job")
    int findWorJobNum();

    /**根据就业信息编号查找查找就业信息*/
    @Select("select work_id,work_title,person,date,content from work_job where work_id = #{work_id}")
    WorJob findWorJobById(@Param("work_id") Integer work_id);

    /**根据就业信息编号修改就业信息*/
    @Update("update work_job set work_title = #{work_title},person=#{person},date=#{date},content=#{content} where work_id =#{work_id}")
    Integer updateWorJobById(WorJob WorJob);

    /**增加就业信息*/
    @Insert("insert into work_job (work_title,person,date,content) values(#{work_title},#{person},#{date},#{content})")
    Integer addWorJob(WorJob WorJob);

    /**根据编号删除就业信息*/
    @Delete(" delete from work_job where work_id = #{work_id}")
    Integer deleteWorJobById(@Param(value = "work_id") Integer work_id);
}
