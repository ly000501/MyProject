package com.xinzhiyun.universitysciencesys.dao.teacher;

import com.xinzhiyun.universitysciencesys.pojo.teacher.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author ：xxx
 * @description：师资队伍dao层
 * @date ：2020/8/19 09:41
 */

@Repository
public interface TeacherDao {

    /**使用分页查找所有教师信息*/
    @Select("select teacher_id,teacher_name,teacher_brief,hiredate,job,photo,background,experience,research,teachcourse,social,paper,textbook,task,award from teacher where job=#{job} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Teacher> findTeacherListAll(Map<String,Object> map);

    /**查找所有教授或副教授总数*/
    @Select("select count(teacher_id) from teacher where job=#{job}")
    int findTeacherNum(@Param("job") String job);


    /**根据教师编号查找查找教师信息*/
    @Select("select teacher_id,teacher_name,teacher_brief,hiredate,job,photo,background,experience,research,teachcourse,social,paper,textbook,task,award from teacher where teacher_id = #{teacher_id}")
    Teacher findTeacherById(@Param("teacher_id")Integer teacher_id);

    /**根据教师编号修改教师*/
    @Update("update teacher set teacher_name = #{teacher_name},teacher_brief=#{teacher_brief},hiredate=#{hiredate},job=#{job},photo=#{photo},background=#{background},experience=#{experience},research=#{research},teachcourse=#{teachcourse},social=#{social},paper=#{paper},textbook=#{textbook},task=#{task},award=#{award} where teacher_id =#{teacher_id}")
    Integer updateTeacherById(Teacher teacher);


    /**增加教师*/
    @Insert("insert into teacher (teacher_name,teacher_brief,hiredate,job,photo,background,experience,research,teachcourse,social,paper,textbook,task,award) values(#{teacher_name},#{teacher_brief},#{hiredate},#{job},#{photo},#{background},#{experience},#{research},#{teachcourse},#{social},#{paper},#{textbook},#{task},#{award})")
    Integer addTeacher(Teacher teacher);

    /**根据编号删除新闻*/
    @Delete("delete from teacher  where teacher_id = #{teacher_id}")
    Integer deleteTeacherById(@Param(value="teacher_id")Integer teacher_id);

}
