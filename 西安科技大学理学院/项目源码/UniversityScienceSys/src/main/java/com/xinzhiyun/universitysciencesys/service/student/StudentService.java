package com.xinzhiyun.universitysciencesys.service.student;

import com.xinzhiyun.universitysciencesys.pojo.student.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 学生工作接口
 */
public interface StudentService {

    /**使用分页查找所有学生工作*/
    List<Student> findStudentAll(Map<String, Object> map);

    /**查找所有学生工作总数*/
    int findStudentNum();

    /**根据学生工作编号查找查找学生工作*/
    Student findStudentById(Integer student_id);

    /**根据学生工作类型查找查找学生工作*/
    List<Student> findStudentByType(Map<String,Object>map);

    int findStudentNumByType(String type);

    /**根据学生工作编号修改学生工作*/
    Integer updateStudentById(Student student);

    /**增加学生工作*/
    Integer addStudent(Student student);

    /**根据编号删除学生工作*/
    Integer deleteStudentById(Integer student_id);
}
