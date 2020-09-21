package com.xinzhiyun.universitysciencesys.controller.teacher;

import com.xinzhiyun.universitysciencesys.pojo.college.College;
import com.xinzhiyun.universitysciencesys.pojo.teacher.Teacher;
import com.xinzhiyun.universitysciencesys.service.college.CollegeService;
import com.xinzhiyun.universitysciencesys.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.util.*;

/**
 * @program: UniversityScienceSys
 * @description: 教师队伍控制层
 * @author: Mr.Wang
 * @create: 2020-08-19 10:04
 **/
@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private CollegeService collegeService;

    /**
    * @Description: 到达教授页面
    * @Date: 2020/8/19
    */
    @RequestMapping(value="/toProfessor.do")
    public String toProfessor() {
        return "redirect:findProfessorListAll.do";
    }

    /**
     * @Description: 到达副教授页面
     * @Date: 2020/8/19
     */
    @RequestMapping(value="/toViceProfessor.do")
    public String toViceProfessor() {
        return "redirect:findViceProfessorListAll.do";
    }

    /**
     * @Description: 分页查找教授
     * @Date: 2020/8/19
     */
    @RequestMapping(value="/findProfessorListAll.do")
    public String findProfessorListAll(Model model,@RequestParam(value="pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5") Integer pageSize) {
        String job = "教授";
        //先从页面取值
        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("job",job);
        List<Teacher> list=teacherService.findTeacherListAll(map);
        //返回结果
        Map<String,Object> result = new HashMap<>();
        //总记录数
        int number = teacherService.findTeacherNum(job);
        //总页数
        int pageCount = number%pageSize==0?number/pageSize:number/pageSize+1;
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("number",number);
        model.addAttribute("pageCount",pageCount);
        model.addAttribute("data",list);
        return "views/teacher/professor";
    }

    /**
     * @Description: 分页查找副教授
     * @Date: 2020/8/19
     */
    @RequestMapping(value="/findViceProfessorListAll.do")
    public String findViceProfessorListAll(Model model,@RequestParam(value="pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5") Integer pageSize) {
        String job = "副教授";
        //先从页面取值
        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("job",job);
        List<Teacher> list=teacherService.findTeacherListAll(map);
        //总记录数
        int number = teacherService.findTeacherNum(job);
        //总页数
        int pageCount = number%pageSize==0?number/pageSize:number/pageSize+1;
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("number",number);
        model.addAttribute("pageCount",pageCount);
        model.addAttribute("data",list);
        return "views/teacher/viceProfessor";
    }

    /**
     * @Description: 查看教授信息
     * @Date: 2020/8/19
     */
    @RequestMapping("findTeacherInfoById.do")
    public String findTeacherInfoById(Model model,Integer teacher_id) {
        Teacher teacher=teacherService.findTeacherById(teacher_id);
        model.addAttribute("teacher",teacher);
        return "views/teacher/teacherInfo";
    }

    /**
     * @Description: 根据编号查找教授
     * @Date: 2020/8/19
     */
    @RequestMapping("findTeacherById.do")
    public String findTeacherById(Model model,Integer teacher_id) {
        Teacher teacher=teacherService.findTeacherById(teacher_id);
        model.addAttribute("teacher",teacher);
        return "views/teacher/editTeacher";
    }

    /**
     * @Description: 根据编号修改教授
     * @Date: 2020/8/19
     */
    @RequestMapping("updateTeacherById.do")
    public String updateTeacherById(Model model,Teacher teacher,@RequestParam("filePhoto") MultipartFile filePhoto) {
        if(!filePhoto.isEmpty()){
            String originalName = filePhoto.getOriginalFilename();
            String path ="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/teacher/";
            String filePath=path+originalName;
            File file = new File(filePath);
            try {
                filePhoto.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+originalName;
                teacher.setPhoto("../"+originalName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Integer flag = teacherService.updateTeacherById(teacher);
        String job = teacher.getJob();
        if("教授".equals(job)){
            return "redirect:findProfessorListAll.do";
        }else if("副教授".equals(job)){
            return "redirect:findViceProfessorListAll.do";
        }else{
            model.addAttribute("error","修改失败！");
            return "error";
        }

    }

    /**
     * @Description: 跳转到添加教授
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddTeacher.do")
    public String toAddTeacher() {
        System.out.println("跳转到此页面");
        return "views/teacher/addTeacher";
    }

    /**
     * @Description: 添加教授
     * @Date: 2020/8/19
     */
    @RequestMapping("addTeacher.do")
    public String addTeacher(Teacher teacher,Model model,@RequestParam("filePhoto") MultipartFile filePhoto) throws ParseException {
        if(!filePhoto.isEmpty()){
            String originalName = filePhoto.getOriginalFilename();
            String path ="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/teacher/";
            String filePath=path+originalName;
            File file = new File(filePath);
            try {
                filePhoto.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+originalName;
                teacher.setPhoto("../"+originalName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String job = teacher.getJob();
        String hiredate = teacher.getHiredate();
        teacherService.addTeacher(teacher);
        if("教授".equals(job)){
            return "redirect:findProfessorListAll.do";
        }
        else if("副教授".equals(job)){
            return "redirect:findViceProfessorListAll.do";
        }else{
            model.addAttribute("error","教师添加失败！");
            return "error";
        }
    }


    /**
     * @Description: 根据编号删除教授
     * @Date: 2020/8/19
     */
    @RequestMapping("deleteProfessorById.do")
    public String deleteProfessorById(@RequestParam("teacher_id")Integer teacher_id) {
        Integer flag = teacherService.deleteTeacherById(teacher_id);
        return  "redirect:findProfessorListAll.do";
    }

    /**
     * @Description: 根据编号删除副教授
     * @Date: 2020/8/19
     */
    @RequestMapping("deleteViceProfessorById.do")
    public String deleteViceProfessorById(@RequestParam("teacher_id")Integer teacher_id) {
        Integer flag = teacherService.deleteTeacherById(teacher_id);
        return  "redirect:findViceProfessorListAll.do";
    }

    /**页面*/

    /**师资概况页面*/
    @RequestMapping(value="/findTeaStatus2.do")
    public String findTeaStatus2(Model model,@RequestParam("type") String type) {
        College teacher = collegeService.findCollegeByType(type);
        model.addAttribute("teacher",teacher);
        return "pages/teacher/status";
    }

    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findProfessorAll2.do")
    public String findProfessorAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "9")Integer pageSize,@RequestParam("job")String job) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("job",job);
        List<Teacher> list= teacherService.findTeacherListAll(map);
        int number = teacherService.findTeacherNum(job);
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
        if("教授".equals(job)){
            return "pages/teacher/professor_list";
        }else if("副教授".equals(job)){
            return "pages/teacher/viceprofessor_list";
        }else{
            model.addAttribute("error","教师未找到");
            return "error";
        }
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findProfessorById2.do")
    public String findProfessorById2(Model model,@RequestParam("educate_id") Integer educate_id) {
        Teacher teacher = teacherService.findTeacherById(educate_id);
        model.addAttribute("teacher",teacher);
        String job = teacher.getJob();
        if("教授".equals(job)){
            return "pages/teacher/professor_info";
        }else if("副教授".equals(job)){
            return "pages/teacher/viceprofessor_info";
        }else{
            model.addAttribute("error","抱歉，该并不属于教授或副教授");
            return "error";
        }
    }



}
