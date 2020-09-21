package com.xinzhiyun.universitysciencesys.dao.student;

import com.xinzhiyun.universitysciencesys.pojo.student.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 学生工作Dao层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 16:36
 **/
@Repository
public interface StudentDao {
    /**使用分页查找学生工作*/
    @Select("select student_id,student_title,date,person,content,picture,type from student order by type limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Student> findStudentAll(Map<String, Object> map);

    /**查找所有学生工作总数*/
    @Select(" select count(student_id) from student ")
    int findStudentNum();

    /**根据学生工作编号查找查找学生工作*/
    @Select("select student_id,student_title,date,person,content,picture,type from student where student_id = #{student_id}")
    Student findStudentById(@Param("student_id") Integer student_id);

    /**根据学生工作类型查找查找学生工作*/
    @Select("select student_id,student_title,date,person,content,picture,type from student where type = #{type} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Student> findStudentByType(Map<String, Object> map);

    /**查找所有学生工作总数*/
    @Select(" select count(student_id) from student where type=#{type}")
    int findStudentNumByType(@Param("type") String type);

    /**根据学生工作编号修改学生工作*/
    @Update("update student set student_title = #{student_title},date=#{date},person=#{person},picture=#{picture},content=#{content},type=#{type} where student_id =#{student_id}")
    Integer updateStudentById(Student student);

    /**增加学生工作*/
    @Insert("insert into student (student_title,date,person,picture,content,type) values(#{student_title},#{date},#{person},#{picture},#{content},#{type})")
    Integer addStudent(Student student);

    /**根据编号删除学生工作*/
    @Delete(" delete from student where student_id = #{student_id}")
    Integer deleteStudentById(@Param(value = "student_id") Integer student_id);
}
