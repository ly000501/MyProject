package com.xinzhiyun.universitysciencesys.service.teacher;

import com.xinzhiyun.universitysciencesys.pojo.teacher.Teacher;

import java.util.List;
import java.util.Map;

/**
 * 教师业务层
 */
public interface TeacherService {
    /**使用分页查找所有教师信息*/
    List<Teacher> findTeacherListAll(Map<String,Object> map);

    /**查找所有教授总数*/
    int findTeacherNum(String job);

    /**根据教师编号查找查找教师信息*/
    Teacher findTeacherById(Integer teacher_id);

    /**根据教师编号修改教师*/
    Integer updateTeacherById(Teacher teacher);

    /**增加教师*/
    Integer addTeacher(Teacher teacher);

    /**根据编号删除新闻*/
    Integer deleteTeacherById(Integer teacher_id);



}
