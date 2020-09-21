package com.xinzhiyun.universitysciencesys.controller.science;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;
import com.xinzhiyun.universitysciencesys.service.science.SciInfoService;
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
 * @description: 科研信息控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/science")
public class AciInfoController {
    @Autowired
    private SciInfoService sciInfoService;

    /**使用分页查找所有科研信息*/
    @RequestMapping(value="/findSciInfoAll.do")
    public String findSciInfoAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<SciInfo> list= sciInfoService.findSciInfoAll(map);
        int number = sciInfoService.findSciInfoNum();
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
        return "views/science/info/sci_info_list";
    }

    /**根据科研信息编号查找查找科研信息*/
    @RequestMapping(value="/findSciInfoById.do")
    public String findSciInfoById(Model model,@RequestParam("science_id") Integer science_id) {
        SciInfo sciInfo = sciInfoService.findSciInfoById(science_id);
        model.addAttribute("sciInfo",sciInfo);
        return "views/science/info/sci_info_info";
    }

    /**修改科研信息前查找*/
    @RequestMapping(value="/toUpdateSciInfoById.do")
    public String toUpdateSciInfoById(Model model,@RequestParam("science_id")Integer science_id) {
        SciInfo sciInfo = sciInfoService.findSciInfoById(science_id);
        model.addAttribute("sciInfo",sciInfo);
        return "views/science/info/sci_info_edit";
    }

    /**根据科研信息编号修改科研信息*/
    @RequestMapping(value="/updateSciInfoById.do")
    public String updateSciInfoById(SciInfo sciInfo) {
        sciInfoService.updateSciInfoById(sciInfo);
        return "redirect:findSciInfoAll.do";
    }

    /**
     * @Description: 跳转到添加科研信息
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddSciInfo.do")
    public String toAddSciInfo() {
        return "views/science/info/sci_info_add";
    }

    /**增加科研信息*/
    @RequestMapping(value="/addSciInfo.do")
    public String addSciInfo(SciInfo sciInfo) {
        sciInfoService.addSciInfo(sciInfo);
        return "redirect:findSciInfoAll.do";
    }

    /**根据编号删除科研信息*/
    @RequestMapping(value="/deleteSciInfoById.do")
    public String deleteSciInfoById(@RequestParam("science_id") Integer science_id) {
        sciInfoService.deleteSciInfoById(science_id);
        return "redirect:findSciInfoAll.do";
    }

    /**页面*/
    /**使用分页查找所有科研信息*/
    @RequestMapping(value="/findSciInfoAll2.do")
    public String findSciInfoAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<SciInfo> list= sciInfoService.findSciInfoAll(map);
        int number = sciInfoService.findSciInfoNum();
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
        return "pages/science/sci_info_list";
    }

    /**根据教务信息编号查找查找科研信息*/
    @RequestMapping(value="/findSciInfoById2.do")
    public String findSciInfoById2(Model model,@RequestParam("science_id") Integer science_id) {
        SciInfo sciInfo = sciInfoService.findSciInfoById(science_id);
        model.addAttribute("sciInfo",sciInfo);
        return "pages/science/sci_info_info";
    }


}
