package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.StudentDao;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @program: Student
 * @description: 业务层实现类
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-08 09:44
 **/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}
