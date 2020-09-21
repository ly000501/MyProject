package com.xinzhiyun.universitysciencesys.controller.student;

import com.xinzhiyun.universitysciencesys.pojo.student.Student;
import com.xinzhiyun.universitysciencesys.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 学生工作控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 15:34
 **/
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**使用分页查找所有学生工作*/
    @RequestMapping(value="/findStudentAll.do")
    public String findStudentAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<Student> list= studentService.findStudentAll(map);
        int number = studentService.findStudentNum();
        int pageCount = number%pageSize==0?number/pageSize:number/pageSize+1;
        model.addAttribute("data",list);
        //第几页
        model.addAttribute("pageNum",pageNum);
        //每页多少记录
        model.addAttribute("pageSize",pageSize);
        //总页数
        model.addAttribute("pageCount",pageCount);
        // 总记录数
        model.addAttribute("number",number);
        return "views/student/student_list";
    }

    /**根据学生工作编号查找查找学生工作*/
    @RequestMapping(value="/findStudentById.do")
    public String findStudentById(Model model,@RequestParam("student_id") Integer student_id) {
        Student student = studentService.findStudentById(student_id);
        model.addAttribute("student",student);
        return "views/student/student_info";
    }

    /**修改学生工作前查找*/
    @RequestMapping(value="/toUpdateStudentById.do")
    public String toUpdateStudentById(Model model,@RequestParam("student_id")Integer student_id) {
        Student student = studentService.findStudentById(student_id);
        model.addAttribute("student",student);
        return "views/student/student_edit";
    }

    /**根据学生工作编号修改学生工作*/
    @RequestMapping(value="/updateStudentById.do")
    public String updateStudentById(Student student,@RequestParam("filePicture") MultipartFile filePicture) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/student/";
        if(!filePicture.isEmpty()){
            orginName= filePicture.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                filePicture.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                student.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        studentService.updateStudentById(student);
        return "redirect:findStudentAll.do";
    }

    /**跳转到添加学生工作*/
    @RequestMapping("toAddStudent.do")
    public String toAddStudent() {
        return "views/student/student_add";
    }

    /**增加学生工作*/
    @RequestMapping(value="/addStudent.do")
    public String addStudent(Student student,@RequestParam("filePicture") MultipartFile filePicture) {
        if(!filePicture.isEmpty()){
            String orginName = filePicture.getOriginalFilename();
            String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/student/";
            File file = new File(path+orginName);
            try {
                filePicture.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                student.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        studentService.addStudent(student);
        return "redirect:findStudentAll.do";
    }

    /**根据编号删除学生工作*/
    @RequestMapping(value="/deleteStudentById.do")
    public String deleteStudentById(@RequestParam("student_id") Integer student_id) {
        studentService.deleteStudentById(student_id);
        return "redirect:findStudentAll.do";
    }


    /**页面层*/
    /**使用分页查找所有学生工作*/
    @RequestMapping(value="/findStudentByType.do")
    public String findStudentByType(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize,@RequestParam("type")String type) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<Student> list= studentService.findStudentByType(map);
        int number = studentService.findStudentNumByType(type);
        int pageCount = number%pageSize==0?number/pageSize:number/pageSize+1;
        model.addAttribute("data",list);
        //第几页
        model.addAttribute("pageNum",pageNum);
        //每页多少记录
        model.addAttribute("pageSize",pageSize);
        //总页数
        model.addAttribute("pageCount",pageCount);
        // 总记录数
        model.addAttribute("number",number);
        model.addAttribute("type",type);
        return "pages/student/student_list";
    }

    /**根据学生工作编号查找查找学生工作*/
    @RequestMapping(value="/findStudentById2.do")
    public String findStudentById2(Model model,@RequestParam("student_id") Integer student_id) {
        Student student = studentService.findStudentById(student_id);
        model.addAttribute("student",student);
        return "pages/student/student_info";
    }

}
