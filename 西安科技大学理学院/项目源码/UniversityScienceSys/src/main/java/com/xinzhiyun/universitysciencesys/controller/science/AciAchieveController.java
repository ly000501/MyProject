package com.xinzhiyun.universitysciencesys.controller.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciAchieve;
import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;
import com.xinzhiyun.universitysciencesys.service.science.SciAchieveService;
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
 * @description: 研究成果控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/science")
public class AciAchieveController {
    @Autowired
    private SciAchieveService sciAchieveService;

    /**使用分页查找所有研究成果*/
    @RequestMapping(value="/findSciAchieveAll.do")
    public String findSciAchieveAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<SciAchieve> list= sciAchieveService.findSciAchieveAll(map);
        int number = sciAchieveService.findSciAchieveNum();
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
        return "views/science/achieve/sci_achieve_list";
    }

    /**根据研究成果编号查找查找研究成果*/
    @RequestMapping(value="/findSciAchieveById.do")
    public String findSciAchieveById(Model model,@RequestParam("science_id") Integer science_id) {
        SciAchieve sciAchieve = sciAchieveService.findSciAchieveById(science_id);
        model.addAttribute("sciAchieve",sciAchieve);
        return "views/science/achieve/sci_achieve_info";
    }

    /**修改研究成果前查找*/
    @RequestMapping(value="/toUpdateSciAchieveById.do")
    public String toUpdateSciAchieveById(Model model,@RequestParam("science_id")Integer science_id) {
        SciAchieve sciAchieve = sciAchieveService.findSciAchieveById(science_id);
        model.addAttribute("sciAchieve",sciAchieve);
        return "views/science/achieve/sci_achieve_edit";
    }

    /**根据研究成果编号修改研究成果*/
    @RequestMapping(value="/updateSciAchieveById.do")
    public String updateSciAchieveById(SciAchieve sciAchieve) {
        sciAchieveService.updateSciAchieveById(sciAchieve);
        return "redirect:findSciAchieveAll.do";
    }

    /**
     * @Description: 跳转到添加研究成果
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddSciAchieve.do")
    public String toAddSciAchieve() {
        return "views/science/achieve/sci_achieve_add";
    }

    /**增加研究成果*/
    @RequestMapping(value="/addSciAchieve.do")
    public String addSciAchieve(SciAchieve sciAchieve) {
        sciAchieveService.addSciAchieve(sciAchieve);
        return "redirect:findSciAchieveAll.do";
    }

    /**根据编号删除研究成果*/
    @RequestMapping(value="/deleteSciAchieveById.do")
    public String deleteSciAchieveById(@RequestParam("science_id") Integer science_id) {
        sciAchieveService.deleteSciAchieveById(science_id);
        return "redirect:findSciAchieveAll.do";
    }

    /**页面*/
    /**使用分页查找所有科研成果*/
    @RequestMapping(value="/findSciAchieveAll2.do")
    public String findSciAchieveAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<SciAchieve> list= sciAchieveService.findSciAchieveAll(map);
        int number = sciAchieveService.findSciAchieveNum();
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
        return "pages/science/sci_achieve_list";
    }

    /**根据教务信息编号查找查找科研信息*/
    @RequestMapping(value="/findSciAchieveById2.do")
    public String findSciAchieveById2(Model model,@RequestParam("science_id") Integer science_id) {
        SciAchieve sciAchieve = sciAchieveService.findSciAchieveById(science_id);
        model.addAttribute("sciAchieve",sciAchieve);
        return "pages/science/sci_achieve_info";
    }


}
