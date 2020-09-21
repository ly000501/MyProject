package com.xinzhiyun.universitysciencesys.service.impl.student;

import com.xinzhiyun.universitysciencesys.dao.student.StudentDao;
import com.xinzhiyun.universitysciencesys.pojo.student.Student;
import com.xinzhiyun.universitysciencesys.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 学生工作业务层
 * @author: Mr.Li
 * @create: 2020-08-27 16:43
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> findStudentAll(Map<String, Object> map) {
        return studentDao.findStudentAll(map);
    }

    @Override
    public int findStudentNum() {
        return studentDao.findStudentNum();
    }

    @Override
    public Student findStudentById(Integer student_id) {
        return studentDao.findStudentById(student_id);
    }

    @Override
    public List<Student> findStudentByType(Map<String,Object> map) {
        return studentDao.findStudentByType(map);
    }

    @Override
    public int findStudentNumByType(String type) {
        return studentDao.findStudentNumByType(type);
    }

    @Override
    public Integer updateStudentById(Student student) {
        return studentDao.updateStudentById(student);
    }

    @Override
    public Integer addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Integer deleteStudentById(Integer student_id) {
        return studentDao.deleteStudentById(student_id);
    }
}
