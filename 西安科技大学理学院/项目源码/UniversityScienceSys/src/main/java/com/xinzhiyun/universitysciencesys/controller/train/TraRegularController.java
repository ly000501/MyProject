package com.xinzhiyun.universitysciencesys.controller.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import com.xinzhiyun.universitysciencesys.service.train.TraRegularService;
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
 * @description: 本科生培养控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 10:38
 **/
@Controller
@RequestMapping("/train")
public class TraRegularController {
    @Autowired
    private TraRegularService traRegularService;

    /**使用分页查找本科生培养*/
    @RequestMapping(value="/findTraRegularAll.do")
    public String findTraRegularAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "6")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<TraBriefPlan> list= traRegularService.findTraRegularAll(map);
        int number = traRegularService.findTraRegularNum();
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
        return "views/train/regular/tra_regular_list";
    }

    /**根据编号查找本科生培养*/
    @RequestMapping(value="/findTraRegularById.do")
    public String findTraRegularById(Model model,@RequestParam("train_id") Integer train_id) {
        TraBriefPlan traRegular = traRegularService.findTraRegularById(train_id);
        model.addAttribute("traRegular",traRegular);
        return "views/train/regular/tra_regular_info";
    }



    /**根据编号删除本科生培养*/
    @RequestMapping(value="/deleteTraRegularById.do")
    public String deleteTraRegularById(@RequestParam("train_id") Integer train_id) {
        traRegularService.deleteTraRegularById(train_id);
        return "redirect:findTraRegularAll.do";
    }

    /**跳转到添加本科生培养*/
    @RequestMapping("toAddTraRegular.do")
    public String toAddTraRegular() {
        return "views/train/regular/tra_regular_add";
    }

    /**增加本科生培养*/
    @RequestMapping(value="/addTraRegular.do")
    public String addTraRegular(TraBriefPlan traBriefPlan,Model model) {
        traRegularService.addTraRegular(traBriefPlan);
        return "redirect:findTraRegularAll.do";
    }

    /**修改本科生培养前查找*/
    @RequestMapping(value="/toUpdateTraRegularById.do")
    public String toUpdateTraRegularById(Model model,@RequestParam("train_id")Integer train_id) {
        TraBriefPlan traRegular = traRegularService.findTraRegularById(train_id);
        model.addAttribute("traRegular",traRegular);
        return "views/train/regular/tra_regular_edit";
    }

    /**根据本科生培养编号修改本科生培养*/
    @RequestMapping(value="/updateTraRegularById.do")
    public String updateTraRegularById(TraBriefPlan traBriefPlan,Model model) {
        traRegularService.updateTraRegularById(traBriefPlan);
        return "redirect:findTraRegularAll.do";
    }



    /**页面层*/
    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findTraRegularByType.do")
    public String findTraRegularByType(Model model, @RequestParam("type")String type) {
        List<TraBriefPlan> list= traRegularService.findTraRegularByType(type);
        model.addAttribute("data",list);
        model.addAttribute("type",type);
        return "pages/train/regular/tra_reg_brief_list";
    }

    /**根据编号查找本科生培养*/
    @RequestMapping(value="/findTraRegularById2.do")
    public String findTraRegularById2(Model model,@RequestParam(value="train_id") Integer train_id) {
        TraBriefPlan traRegular = traRegularService.findTraRegularById(train_id);
        String type = traRegular.getType();
        model.addAttribute("traRegular",traRegular);
        model.addAttribute("type",type);
            return "pages/train/regular/tra_reg_brief_info";
        }
    }


