package com.xinzhiyun.universitysciencesys.dao.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 科研信息dao层
 * @author: Mr.Wang
 * @create: 2020-08-25 11:23
 **/
@Repository
public interface SciInfoDao {
    /**使用分页查找所有科研信息*/
    @Select("select science_id,science_title,person,date,content from science_info limit ${(pageNum-1)*pageSize},${pageSize}")
    List<SciInfo> findSciInfoAll(Map<String, Object> map);

    /**查找所有科研信息总数*/
    @Select("select count(science_id) from science_info")
    int findSciInfoNum();

    /**根据科研信息编号查找查找科研信息*/
    @Select("select science_id,science_title,person,date,content from science_info where science_id = #{science_id}")
    SciInfo findSciInfoById(@Param("science_id") Integer science_id);

    /**根据科研信息编号修改科研信息*/
    @Update("update science_info set science_title = #{science_title},person=#{person},date=#{date},content=#{content} where science_id =#{science_id}")
    Integer updateSciInfoById(SciInfo sciInfo);

    /**增加科研信息*/
    @Insert("insert into science_info (science_title,person,date,content) values(#{science_title},#{person},#{date},#{content})")
    Integer addSciInfo(SciInfo sciInfo);

    /**根据编号删除科研信息*/
    @Delete(" delete from science_info where science_id = #{science_id}")
    Integer deleteSciInfoById(@Param(value = "science_id") Integer science_id);
}
