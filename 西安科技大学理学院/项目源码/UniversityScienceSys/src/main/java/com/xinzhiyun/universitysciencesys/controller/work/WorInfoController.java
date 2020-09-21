package com.xinzhiyun.universitysciencesys.controller.work;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.pojo.work.WorInfo;
import com.xinzhiyun.universitysciencesys.service.work.WorInfoService;
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
 * @description: 招生信息控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-25 14:05
 **/
@Controller
@RequestMapping("/work")
public class WorInfoController {
    @Autowired
    private WorInfoService worInfoService;

    /**使用分页查找所有招生信息*/
    @RequestMapping(value="/findWorInfoAll.do")
    public String findWorInfoAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<WorInfo> list= worInfoService.findWorInfoAll(map);
        int number = worInfoService.findWorInfoNum();
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
        return "views/work/info/wor_info_list";
    }

    /**根据招生信息编号查找查找招生信息*/
    @RequestMapping(value="/findWorInfoById.do")
    public String findWorInfoById(Model model,@RequestParam("work_id") Integer work_id) {
        WorInfo worInfo = worInfoService.findWorInfoById(work_id);
        model.addAttribute("worInfo",worInfo);
        return "views/work/info/wor_info_info";
    }

    /**修改招生信息前查找*/
    @RequestMapping(value="/toUpdateWorInfoById.do")
    public String toUpdateWorInfoById(Model model,@RequestParam("work_id")Integer work_id) {
        WorInfo worInfo = worInfoService.findWorInfoById(work_id);
        model.addAttribute("worInfo",worInfo);
        return "views/work/info/wor_info_edit";
    }

    /**根据招生信息编号修改招生信息*/
    @RequestMapping(value="/updateWorInfoById.do")
    public String updateWorInfoById(WorInfo worInfo) {
        worInfoService.updateWorInfoById(worInfo);
        return "redirect:findWorInfoAll.do";
    }

    /**跳转到添加招生信息*/
    @RequestMapping("toAddWorInfo.do")
    public String toAddWorInfo() {
        return "views/work/info/wor_info_add";
    }

    /**增加招生信息*/
    @RequestMapping(value="/addWorInfo.do")
    public String addWorInfo(WorInfo worInfo) {
        worInfoService.addWorInfo(worInfo);
        return "redirect:findWorInfoAll.do";
    }

    /**根据编号删除招生信息*/
    @RequestMapping(value="/deleteWorInfoById.do")
    public String deleteWorInfoById(@RequestParam("work_id") Integer work_id) {
        worInfoService.deleteWorInfoById(work_id);
        return "redirect:findWorInfoAll.do";
    }

    /**页面层*/
    /**使用分页查找所有招生信息*/
    @RequestMapping(value="/findWorInfoAll2.do")
    public String findWorInfoAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<WorInfo> list= worInfoService.findWorInfoAll(map);
        int number = worInfoService.findWorInfoNum();
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
        return "pages/work/wor_info_list";
    }

    /**根据编号查找招生信息*/
    @RequestMapping(value="/findWorInfoById2.do")
    public String findEduInfoById2(Model model,@RequestParam("work_id") Integer work_id) {
        WorInfo worInfo = worInfoService.findWorInfoById(work_id);
        model.addAttribute("worInfo",worInfo);
        return "pages/work/wor_info_info";
    }


}
