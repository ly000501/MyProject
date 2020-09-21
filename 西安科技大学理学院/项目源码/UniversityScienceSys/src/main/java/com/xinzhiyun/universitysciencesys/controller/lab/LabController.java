package com.xinzhiyun.universitysciencesys.controller.lab;

import com.xinzhiyun.universitysciencesys.pojo.lab.Lab;
import com.xinzhiyun.universitysciencesys.service.lab.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 实验室建设控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 14:15
 **/
@Controller
@RequestMapping("/lab")
public class LabController {
    @Autowired
    private LabService labService;

    /**使用分页查找所有实验室建设*/
    @RequestMapping(value="/findLabAll.do")
    public String findLabAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<Lab> list= labService.findLabAll(map);
        int number = labService.findLabNum();
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
        return "views/lab/lab_list";
    }

    /**根据实验室建设编号查找查找实验室建设*/
    @RequestMapping(value="/findLabById.do")
    public String findLabById(Model model,@RequestParam("lab_id") Integer lab_id) {
        Lab lab = labService.findLabById(lab_id);
        model.addAttribute("lab",lab);
        return "views/lab/lab_info";
    }

    /**修改实验室建设前查找*/
    @RequestMapping(value="/toUpdateLabById.do")
    public String toUpdateLabById(Model model,@RequestParam("lab_id")Integer lab_id) {
        Lab lab = labService.findLabById(lab_id);
        model.addAttribute("lab",lab);
        return "views/lab/lab_edit";
    }

    /**根据实验室建设编号修改实验室建设*/
    @RequestMapping(value="/updateLabById.do")
    public String updateLabById(Lab lab) {
        labService.updateLabById(lab);
        return "redirect:findLabAll.do";
    }

    /**跳转到添加实验室建设*/
    @RequestMapping("toAddLab.do")
    public String toAddLab() {
        return "views/lab/lab_add";
    }

    /**增加实验室建设*/
    @RequestMapping(value="/addLab.do")
    public String addLab(Lab lab) {
        labService.addLab(lab);
        return "redirect:findLabAll.do";
    }

    /**根据编号删除实验室建设*/
    @RequestMapping(value="/deleteLabById.do")
    public String deleteLabById(@RequestParam("lab_id") Integer lab_id) {
        labService.deleteLabById(lab_id);
        return "redirect:findLabAll.do";
    }


    /**页面*/
    /**使用分页查找所有实验室建设*/
    @RequestMapping(value="/findLabAll2.do")
    public String findLabAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize,@RequestParam("lab_name")String lab_name) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("lab_name",lab_name);
        List<Lab> list= labService.findLabByType(map);
        int number = labService.findLabNum();
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
        model.addAttribute("lab_name",lab_name);
        return "pages/lab/lab_list";
    }

    /**根据编号查找查找实验室建设*/
    @RequestMapping(value="/findLabById2.do")
    public String findLabById2(Model model,@RequestParam("lab_id") Integer lab_id) {
        Lab lab = labService.findLabById(lab_id);
        String lab_name = lab.getLab_name();
        model.addAttribute("lab",lab);
        return "pages/lab/lab_info";
    }


}
