package com.xinzhiyun.universitysciencesys.controller.work;

import com.xinzhiyun.universitysciencesys.pojo.work.WorInfo;
import com.xinzhiyun.universitysciencesys.pojo.work.WorJob;
import com.xinzhiyun.universitysciencesys.service.work.WorJobService;
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
 * @description: 就业信息控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-25 14:05
 **/
@Controller
@RequestMapping("/work")
public class WorJobController {
    @Autowired
    private WorJobService worJobService;

    /**使用分页查找所有就业信息*/
    @RequestMapping(value="/findWorJobAll.do")
    public String findWorJobAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<WorJob> list= worJobService.findWorJobAll(map);
        int number = worJobService.findWorJobNum();
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
        return "views/work/job/wor_job_list";
    }

    /**根据就业信息编号查找查找就业信息*/
    @RequestMapping(value="/findWorJobById.do")
    public String findWorJobById(Model model,@RequestParam("work_id") Integer work_id) {
        WorJob worJob = worJobService.findWorJobById(work_id);
        model.addAttribute("worJob",worJob);
        return "views/work/job/wor_job_info";
    }

    /**修改就业信息前查找*/
    @RequestMapping(value="/toUpdateWorJobById.do")
    public String toUpdateWorJobById(Model model,@RequestParam("work_id")Integer work_id) {
        WorJob worJob = worJobService.findWorJobById(work_id);
        model.addAttribute("worJob",worJob);
        return "views/work/job/wor_job_edit";
    }

    /**根据就业信息编号修改就业信息*/
    @RequestMapping(value="/updateWorJobById.do")
    public String updateWorJobById(WorJob worJob) {
        worJobService.updateWorJobById(worJob);
        return "redirect:findWorJobAll.do";
    }

    /**跳转到添加就业信息*/
    @RequestMapping("toAddWorJob.do")
    public String toAddWorJob() {
        return "views/work/job/wor_job_add";
    }

    /**增加就业信息*/
    @RequestMapping(value="/addWorJob.do")
    public String addWorJob(WorJob worJob) {
        System.out.println(worJob);
        worJobService.addWorJob(worJob);
        return "redirect:findWorJobAll.do";
    }

    /**根据编号删除就业信息*/
    @RequestMapping(value="/deleteWorJobById.do")
    public String deleteWorJobById(@RequestParam("work_id") Integer work_id) {
        worJobService.deleteWorJobById(work_id);
        return "redirect:findWorJobAll.do";
    }

    /**页面层*/
    /**使用分页查找所有就业信息*/
    @RequestMapping(value="/findWorJobAll2.do")
    public String findWorJobAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<WorJob> list= worJobService.findWorJobAll(map);
        int number = worJobService.findWorJobNum();
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
        return "pages/work/wor_job_list";
    }

    /**根据编号查找就业信息*/
    @RequestMapping(value="/findWorJobById2.do")
    public String findWorJobById2(Model model,@RequestParam("work_id") Integer work_id) {
        WorJob worJob = worJobService.findWorJobById(work_id);
        model.addAttribute("worJob",worJob);
        return "pages/work/wor_job_info";
    }


}
