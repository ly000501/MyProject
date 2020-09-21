package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Student
 * @description: 学生控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-08 09:35
 **/
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**学生登录*/
    @CrossOrigin
    @RequestMapping(value="/loginStu.do",produces ="application/json;charset=utf-8")
    @ResponseBody
    public Integer loginStu(@RequestParam("name") String name,@RequestParam("password") String password) {
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper.eq("name",name);
        Student stu1 = studentService.getOne(wrapper);
        if(stu1!=null){
            wrapper.eq("password",password);
            Student stu2 = studentService.getOne(wrapper);
            if(stu2!=null){
                return 1;
            }else{
                return -1;
            }
        }else{
            return 0;
        }
    }

    /**查询所有学生*/
    @CrossOrigin
    @RequestMapping("/findStuAll.do")
    @ResponseBody
    public Object findStuAll() {
        List<Student> list = studentService.list();
        return list;
    }

    /**分页查询所有学生*/
    @CrossOrigin
    @RequestMapping("/listStuPage.do")
    @ResponseBody
    public Object listStuPage(int page,int limit,String name) {
        System.out.println("page:"+page);
        Map<String,Object> result = new HashMap<>();
        /**包装查询条件*/
        QueryWrapper<Student> query = new QueryWrapper<>();
        if(name!=null){
            query.like(true,"name",name);
        }
        result.put("count",studentService.count());
        result.put("data",studentService.page(new Page<>(page,limit),query).getRecords());
        result.put("page",page);
        return result;
    }

    /**根据条件查询学生所有学生*/
    @CrossOrigin
    @RequestMapping("/findStuById.do")
    @ResponseBody
    public Object findStuById(@RequestParam("id") Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        List<Student> list = studentService.listByMap(map);
        return list;
    }


    /**添加学生*/
    @CrossOrigin
    @RequestMapping("/saveStu.do")
    @ResponseBody
    public boolean saveStu(Student student){
        studentService.save(student);
        return true;
    }

    /**删除学生*/
    @CrossOrigin
    @RequestMapping("/deleteStu.do")
    @ResponseBody
    public boolean deleteStu(@RequestParam("id") Integer id){
        studentService.removeById(id);
        return true;
    }

    /**修改学生*/
    @CrossOrigin
    @RequestMapping("/updateStu.do")
    @ResponseBody
    public boolean updateStu(Student student){
        studentService.updateById(student);
        return true;
    }

}
