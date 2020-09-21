package com.xinzhiyun.universitysciencesys.service.impl.teacher;

import com.xinzhiyun.universitysciencesys.dao.teacher.TeacherDao;
import com.xinzhiyun.universitysciencesys.pojo.teacher.Teacher;
import com.xinzhiyun.universitysciencesys.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教师业务层实体类
 * @author: Mr.Wang
 * @create: 2020-08-19 10:03
 **/
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public List<Teacher> findTeacherListAll(Map<String,Object> map) {
        return teacherDao.findTeacherListAll(map);
    }

    @Override
    public int findTeacherNum(String job) {
        return teacherDao.findTeacherNum(job);
    }

    @Override
    public Teacher findTeacherById(Integer teacher_id) {
        return teacherDao.findTeacherById(teacher_id);
    }

    @Override
    public Integer updateTeacherById(Teacher teacher) {
        return teacherDao.updateTeacherById(teacher);
    }

    @Override
    public Integer addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    @Override
    public Integer deleteTeacherById(Integer teacher_id) {
        return teacherDao.deleteTeacherById(teacher_id);
    }
}
