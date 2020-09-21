package com.xinzhiyun.universitysciencesys.controller.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduManage;
import com.xinzhiyun.universitysciencesys.service.educate.EduManageService;
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
 * @description: 管理制度控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/educate")
public class EduManageController {
    @Autowired
    private EduManageService eduManageService;

    /**使用分页查找所有管理制度*/
    @RequestMapping(value="/findEduManageAll.do")
    public String findEduManageAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduManage> list= eduManageService.findEduManageAll(map);
        int number = eduManageService.findEduManageNum();
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
        return "views/educate/manage/edu_manage_list";
    }

    /**根据管理制度编号查找查找管理制度*/
    @RequestMapping(value="/findEduManageById.do")
    public String findEduManageById(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduManage eduManage = eduManageService.findEduManageById(educate_id);
        model.addAttribute("eduManage",eduManage);
        return "views/educate/manage/edu_manage_info";
    }

    /**修改管理制度前查找*/
    @RequestMapping(value="/toUpdateEduManageById.do")
    public String toUpdateEduManageById(Model model,@RequestParam("educate_id")Integer educate_id) {
        EduManage eduManage = eduManageService.findEduManageById(educate_id);
        model.addAttribute("eduManage",eduManage);
        return "views/educate/manage/edu_manage_edit";
    }

    /**根据管理制度编号修改管理制度*/
    @RequestMapping(value="/updateEduManageById.do")
    public String updateEduManageById(EduManage eduManage) {
        eduManageService.updateEduManageById(eduManage);
        return "redirect:findEduManageAll.do";
    }

    /**
     * @Description: 跳转到添加管理制度
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddEduManage.do")
    public String toAddEduManage() {
        return "views/educate/manage/edu_manage_add";
    }

    /**增加管理制度*/
    @RequestMapping(value="/addEduManage.do")
    public String addEduManage(EduManage eduManage) {
        eduManageService.addEduManage(eduManage);
        return "redirect:findEduManageAll.do";
    }

    /**根据编号删除管理制度*/
    @RequestMapping(value="/deleteEduManageById.do")
    public String deleteEduManageById(@RequestParam("educate_id") Integer educate_id) {
        eduManageService.deleteEduManageById(educate_id);
        return "redirect:findEduManageAll.do";
    }

    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findEduManageAll2.do")
    public String findEduManageAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduManage> list= eduManageService.findEduManageAll(map);
        int number = eduManageService.findEduManageNum();
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
        return "pages/educate/edu_manage_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findEduManageById2.do")
    public String findEduManageById2(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduManage eduManage = eduManageService.findEduManageById(educate_id);
        model.addAttribute("eduManage",eduManage);
        return "pages/educate/edu_manage_info";
    }


}
