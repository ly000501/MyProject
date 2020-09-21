package com.xinzhiyun.universitysciencesys.controller.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.service.educate.EduInfoService;
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
 * @description: 教务信息控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/educate")
public class EduInfoController {
    @Autowired
    private EduInfoService eduInfoService;

    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findEduInfoAll.do")
    public String findEduInfoAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduInfo> list= eduInfoService.findEduInfoAll(map);
        int number = eduInfoService.findEduInfoNum();
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
        return "views/educate/info/edu_info_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findEduInfoById.do")
    public String findEduInfoById(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduInfo eduInfo = eduInfoService.findEduInfoById(educate_id);
        model.addAttribute("eduInfo",eduInfo);
        return "views/educate/info/edu_info_info";
    }

    /**修改教务信息前查找*/
    @RequestMapping(value="/toUpdateEduInfoById.do")
    public String toUpdateEduInfoById(Model model,@RequestParam("educate_id")Integer educate_id) {
        EduInfo eduInfo = eduInfoService.findEduInfoById(educate_id);
        model.addAttribute("eduInfo",eduInfo);
        return "views/educate/info/edu_info_edit";
    }

    /**根据教务信息编号修改教务信息*/
    @RequestMapping(value="/updateEduInfoById.do")
    public String updateEduInfoById(EduInfo eduInfo) {
        eduInfoService.updateEduInfoById(eduInfo);
        return "redirect:findEduInfoAll.do";
    }

    /**跳转到添加教务信息*/
    @RequestMapping("toAddEduInfo.do")
    public String toAddEduInfo() {
        return "views/educate/info/edu_info_add";
    }

    /**增加教务信息*/
    @RequestMapping(value="/addEduInfo.do")
    public String addEduInfo(EduInfo eduInfo) {
        eduInfoService.addEduInfo(eduInfo);
        return "redirect:findEduInfoAll.do";
    }

    /**根据编号删除教务信息*/
    @RequestMapping(value="/deleteEduInfoById.do")
    public String deleteEduInfoById(@RequestParam("educate_id") Integer educate_id) {
        eduInfoService.deleteEduInfoById(educate_id);
        return "redirect:findEduInfoAll.do";
    }


    /**页面层*/
    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findEduInfoAll2.do")
    public String findEduInfoAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduInfo> list= eduInfoService.findEduInfoAll(map);
        int number = eduInfoService.findEduInfoNum();
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
        return "pages/educate/edu_info_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findEduInfoById2.do")
    public String findEduInfoById2(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduInfo eduInfo = eduInfoService.findEduInfoById(educate_id);
        model.addAttribute("eduInfo",eduInfo);
        return "pages/educate/edu_info_info";
    }


}
