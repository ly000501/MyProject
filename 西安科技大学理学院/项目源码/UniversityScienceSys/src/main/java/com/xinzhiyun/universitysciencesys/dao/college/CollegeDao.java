package com.xinzhiyun.universitysciencesys.dao.college;

import com.xinzhiyun.universitysciencesys.pojo.college.College;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学院概况dao层
 */
@Repository
public interface CollegeDao {

    /**查找学院概况*/
    @Select("select college_id,college_title,date,person,content,type from college")
    List<College> findCollegeAll();

    /**查找学院概况*/
    @Select("select college_id,college_title,date,person,content,type from college where type=#{type}")
    College findCollegeByType(String type);

    /**根据编号查找学院概况*/
    @Select("select college_id,college_title,date,person,content,type from college where college_id=#{college_id}")
    College findCollegeById(Integer college_id);

    /**修改学院概况*/
    @Update("update college set college_title=#{college_title},date=#{date},person=#{person}, content=#{content},type =#{type} where college_id=#{college_id}")
    void updateCollege(College college);

    /**删除机构设置*/
    @Delete("delete from college where college_id = #{college_id}")
    void deleteCollege(@Param(value = "college_id") Integer college_id);

    /**添加机构设置*/
    @Insert("insert into college (college_title,date,person,content,type) values(#{college_title},#{date},#{person},#{content},#{type})")
    void addCollege(College college);

}
