package com.xinzhiyun.universitysciencesys.controller.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import com.xinzhiyun.universitysciencesys.service.train.TraGraduateService;
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
 * @description: 研究生培养控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 10:38
 **/
@Controller
@RequestMapping("/train")
public class TraGraduateController {
    @Autowired
    private TraGraduateService traGraduateService;

    /**使用分页查找本科生研究生培养*/
    @RequestMapping(value="/findTraGraduateAll.do")
    public String findTraGraduateAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "6")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<TraBriefPlan> list= traGraduateService.findTraGraduateAll(map);
        int number = traGraduateService.findTraGraduateNum();
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
        return "views/train/graduate/tra_graduate_list";
    }

    /**根据编号查找本科生研究生培养*/
    @RequestMapping(value="/findTraGraduateById.do")
    public String findTraGraduateById(Model model,@RequestParam("train_id") Integer train_id) {
        TraBriefPlan traGraduate = traGraduateService.findTraGraduateById(train_id);
        model.addAttribute("traGraduate",traGraduate);
        return "views/train/graduate/tra_graduate_info";
    }



    /**根据编号删除本科生研究生培养*/
    @RequestMapping(value="/deleteTraGraduateById.do")
    public String deleteTraGraduateById(@RequestParam("train_id") Integer train_id) {
        traGraduateService.deleteTraGraduateById(train_id);
        return "redirect:findTraGraduateAll.do";
    }

    /**跳转到添加研究生培养*/
    @RequestMapping("toAddTraGraduate.do")
    public String toAddTraGraduate() {
        return "views/train/graduate/tra_graduate_add";
    }

    /**增加研究生培养*/
    @RequestMapping(value="/addTraGraduate.do")
    public String addTraGraduate(TraBriefPlan traBriefPlan,Model model) {
        traGraduateService.addTraGraduate(traBriefPlan);
        return "redirect:findTraGraduateAll.do";
    }

    /**修改研究生培养前查找*/
    @RequestMapping(value="/toUpdateTraGraduateById.do")
    public String toUpdateTraGraduateById(Model model,@RequestParam("train_id")Integer train_id) {
        TraBriefPlan traGraduate = traGraduateService.findTraGraduateById(train_id);
        model.addAttribute("traGraduate",traGraduate);
        return "views/train/graduate/tra_graduate_edit";
    }

    /**根据研究生培养编号修改研究生培养*/
    @RequestMapping(value="/updateTraGraduateById.do")
    public String updateTraGraduateById(TraBriefPlan traBriefPlan,Model model) {
        traGraduateService.updateTraGraduateById(traBriefPlan);
        return "redirect:findTraGraduateAll.do";
    }

    /**页面*/
    /**根据研究生培养编号修改研究生培养*/
    @RequestMapping(value="/findTraGraduateByType.do")
    public String findTraGraduateByType(Model model,@RequestParam("type")String type) {
        List<TraBriefPlan> list = traGraduateService.findTraGraduateByType(type);
        model.addAttribute("data",list);
        model.addAttribute("type",type);
        return "pages/train/graduate/tra_gra_brief_list";
    }

    /**根据编号查找研究生培养*/
    @RequestMapping(value="/findTraGraduateById2.do")
    public String findTraGraduateById2(Model model,@RequestParam(value="train_id",defaultValue = "1001") Integer train_id) {
        TraBriefPlan traGraduate = traGraduateService.findTraGraduateById(train_id);
        String type = traGraduate.getType();
        model.addAttribute("traGraduate",traGraduate);
        model.addAttribute("type",type);
        return "pages/train/graduate/tra_gra_brief_info";

    }



}
