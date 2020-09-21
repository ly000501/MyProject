package com.xinzhiyun.universitysciencesys.dao.work;

import com.xinzhiyun.universitysciencesys.pojo.work.WorInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 招生信息dao层
 * @author: Mr.Ling
 * @create: 2020-08-25 17:36
 **/
@Repository
public interface WorInfoDao {
    /**使用分页查找所有招生信息*/
    @Select("select work_id,work_title,date,content from work_info limit ${(pageNum-1)*pageSize},${pageSize}")
    List<WorInfo> findWorInfoAll(Map<String, Object> map);

    /**查找所有招生信息总数*/
    @Select("select count(work_id) from work_info")
    int findWorInfoNum();

    /**根据招生信息编号查找查找招生信息*/
    @Select("select work_id,work_title,date,content from work_info where work_id = #{work_id}")
    WorInfo findWorInfoById(@Param("work_id") Integer work_id);

    /**根据招生信息编号修改招生信息*/
    @Update("update work_info set work_title = #{work_title},date=#{date},content=#{content} where work_id =#{work_id}")
    Integer updateWorInfoById(WorInfo WorInfo);

    /**增加招生信息*/
    @Insert("insert into work_info (work_title,date,content) values(#{work_title},#{date},#{content})")
    Integer addWorInfo(WorInfo WorInfo);

    /**根据编号删除招生信息*/
    @Delete(" delete from work_info where work_id = #{work_id}")
    Integer deleteWorInfoById(@Param(value = "work_id") Integer work_id);
}
