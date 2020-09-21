package com.xinzhiyun.universitysciencesys.dao.student;

import com.xinzhiyun.universitysciencesys.pojo.student.StuUnion;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 团委、学生会Dao层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-04 11:10
 **/
@Repository
public interface StuUnionDao {
    /**使用分页查找团委、学生会*/
    @Select("select union_id,union_title,date,person,content,picture,type from student_union order by type limit ${(pageNum-1)*pageSize},${pageSize}")
    List<StuUnion> findStuUnionAll(Map<String, Object> map);

    /**查找所有团委、学生会总数*/
    @Select(" select count(union_id) from student_union ")
    int findStuUnionNum();

    /**根据团委、学生会编号查找查找团委、学生会*/
    @Select("select union_id,union_title,date,person,content,picture,type from student_union where union_id = #{union_id}")
    StuUnion findStuUnionById(@Param("union_id") Integer union_id);

    /**根据团委、学生会类型查找查找团委、学生会*/
    @Select("select union_id,union_title,date,person,content,picture,type from student_union where type = #{type} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<StuUnion> findStuUnionByType(Map<String, Object> map);

    /**查找所有团委、学生会总数*/
    @Select(" select count(union_id) from student_union where type=#{type}")
    int findStuUnionNumByType(@Param("type") String type);

    /**根据团委、学生会编号修改团委、学生会*/
    @Update("update student_union set union_title = #{union_title},date=#{date},person=#{person},picture=#{picture},content=#{content},type=#{type} where union_id =#{union_id}")
    Integer updateStuUnionById(StuUnion StuUnion);

    /**增加团委、学生会*/
    @Insert("insert into student_union (union_title,date,person,picture,content,type) values(#{union_title},#{date},#{person},#{picture},#{content},#{type})")
    Integer addStuUnion(StuUnion StuUnion);

    /**根据编号删除团委、学生会*/
    @Delete(" delete from student_union where union_id = #{union_id}")
    Integer deleteStuUnionById(@Param(value = "union_id") Integer union_id);
}
