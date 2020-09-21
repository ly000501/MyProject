package com.xinzhiyun.universitysciencesys.controller.student;

import com.xinzhiyun.universitysciencesys.pojo.student.StuUnion;
import com.xinzhiyun.universitysciencesys.service.student.StuUnionService;
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
 * @description: 团委、学生会控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-04 11:18
 **/
@Controller
@RequestMapping("/student")
public class StuUnionController {
    @Autowired
    private StuUnionService stuUnionService;

    /**使用分页查找所有团委、学生会*/
    @RequestMapping(value="/findStuUnionAll.do")
    public String findStuUnionAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<StuUnion> list= stuUnionService.findStuUnionAll(map);
        int number = stuUnionService.findStuUnionNum();
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
        return "views/student/stuUnion_list";
    }

    /**根据团委、学生会编号查找查找团委、学生会*/
    @RequestMapping(value="/findStuUnionById.do")
    public String findStuUnionById(Model model,@RequestParam("union_id") Integer union_id) {
        StuUnion stuUnion = stuUnionService.findStuUnionById(union_id);
        model.addAttribute("stuUnion",stuUnion);
        return "views/student/stuUnion_info";
    }

    /**修改团委、学生会前查找*/
    @RequestMapping(value="/toUpdateStuUnionById.do")
    public String toUpdateStuUnionById(Model model,@RequestParam("union_id")Integer union_id) {
        StuUnion stuUnion = stuUnionService.findStuUnionById(union_id);
        model.addAttribute("stuUnion",stuUnion);
        return "views/student/stuUnion_edit";
    }

    /**根据团委、学生会编号修改团委、学生会*/
    @RequestMapping(value="/updateStuUnionById.do")
    public String updateStuUnionById(StuUnion stuUnion,@RequestParam("filePicture") MultipartFile filePicture) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/student/union/";
        if(!filePicture.isEmpty()){
            orginName= filePicture.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                filePicture.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                stuUnion.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        stuUnionService.updateStuUnionById(stuUnion);
        return "redirect:findStuUnionAll.do";
    }

    /**跳转到添加团委、学生会*/
    @RequestMapping("toAddStuUnion.do")
    public String toAddStuUnion() {
        return "views/student/stuUnion_add";
    }

    /**增加团委、学生会*/
    @RequestMapping(value="/addStuUnion.do")
    public String addStuUnion(StuUnion stuUnion,@RequestParam("filePicture") MultipartFile filePicture) {
        if(!filePicture.isEmpty()){
            String orginName = filePicture.getOriginalFilename();
            String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/student/union/";
            File file = new File(path+orginName);
            try {
                filePicture.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                stuUnion.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        stuUnionService.addStuUnion(stuUnion);
        return "redirect:findStuUnionAll.do";
    }

    /**根据编号删除团委、学生会*/
    @RequestMapping(value="/deleteStuUnionById.do")
    public String deleteStuUnionById(@RequestParam("union_id") Integer union_id) {
        stuUnionService.deleteStuUnionById(union_id);
        return "redirect:findStuUnionAll.do";
    }


    /**页面层*/
    /**使用分页查找所有团委、学生会*/
    @RequestMapping(value="/findStuUnionByType.do")
    public String findStuUnionByType(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize,@RequestParam("type")String type) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<StuUnion> list= stuUnionService.findStuUnionByType(map);
        int number = stuUnionService.findStuUnionNumByType(type);
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
        return "pages/student/student_union_list";
    }

    /**根据团委、学生会编号查找查找团委、学生会*/
    @RequestMapping(value="/findStuUnionById2.do")
    public String findStuUnionById2(Model model,@RequestParam("union_id") Integer union_id) {
        StuUnion stuUnion = stuUnionService.findStuUnionById(union_id);
        model.addAttribute("stuUnion",stuUnion);
        return "pages/student/student_union_info";
    }

}
