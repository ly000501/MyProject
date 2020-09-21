package com.xinzhiyun.universitysciencesys.controller.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;
import com.xinzhiyun.universitysciencesys.pojo.science.SciTeambuild;
import com.xinzhiyun.universitysciencesys.service.science.SciTeambuildService;
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
 * @description: 团队建设控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/science")
public class AciTeambuildController {
    @Autowired
    private SciTeambuildService sciTeambuildService;

    /**使用分页查找所有团队建设*/
    @RequestMapping(value="/findSciTeambuildAll.do")
    public String findSciTeambuildAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<SciTeambuild> list= sciTeambuildService.findSciTeambuildAll(map);
        int number = sciTeambuildService.findSciTeambuildNum();
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
        return "views/science/teambuild/sci_teambuild_list";
    }

    /**根据团队建设编号查找查找团队建设*/
    @RequestMapping(value="/findSciTeambuildById.do")
    public String findSciTeambuildById(Model model,@RequestParam("science_id") Integer science_id) {
        SciTeambuild sciTeambuild = sciTeambuildService.findSciTeambuildById(science_id);
        model.addAttribute("sciTeambuild",sciTeambuild);
        return "views/science/teambuild/sci_teambuild_info";
    }

    /**修改团队建设前查找*/
    @RequestMapping(value="/toUpdateSciTeambuildById.do")
    public String toUpdateSciTeambuildById(Model model,@RequestParam("science_id")Integer science_id) {
        SciTeambuild sciTeambuild = sciTeambuildService.findSciTeambuildById(science_id);
        model.addAttribute("sciTeambuild",sciTeambuild);
        return "views/science/teambuild/sci_teambuild_edit";
    }

    /**根据团队建设编号修改团队建设*/
    @RequestMapping(value="/updateSciTeambuildById.do")
    public String updateSciTeambuildById(SciTeambuild sciTeambuild) {
        sciTeambuildService.updateSciTeambuildById(sciTeambuild);
        return "redirect:findSciTeambuildAll.do";
    }

    /**
     * @Description: 跳转到添加团队建设
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddSciTeambuild.do")
    public String toAddSciTeambuild() {
        return "views/science/teambuild/sci_teambuild_add";
    }

    /**增加团队建设*/
    @RequestMapping(value="/addSciTeambuild.do")
    public String addSciTeambuild(SciTeambuild sciTeambuild) {
        sciTeambuildService.addSciTeambuild(sciTeambuild);
        return "redirect:findSciTeambuildAll.do";
    }

    /**根据编号删除团队建设*/
    @RequestMapping(value="/deleteSciTeambuildById.do")
    public String deleteSciTeambuildById(@RequestParam("science_id") Integer science_id) {
        sciTeambuildService.deleteSciTeambuildById(science_id);
        return "redirect:findSciTeambuildAll.do";
    }

    /**页面*/
    /**使用分页查找所有科研信息*/
    @RequestMapping(value="/findSciTeambuildAll2.do")
    public String findSciTeambuildAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<SciTeambuild> list= sciTeambuildService.findSciTeambuildAll(map);
        int number = sciTeambuildService.findSciTeambuildNum();
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
        return "pages/science/sci_teambuild_list";
    }

    /**根据教务信息编号查找查找科研信息*/
    @RequestMapping(value="/findSciTeambuildById2.do")
    public String findSciTeambuildById2(Model model,@RequestParam("science_id") Integer science_id) {
        SciTeambuild sciTeambuild = sciTeambuildService.findSciTeambuildById(science_id);
        model.addAttribute("sciTeambuild",sciTeambuild);
        return "pages/science/sci_teambuild_info";
    }


}
