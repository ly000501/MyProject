package com.xinzhiyun.universitysciencesys.controller.educate;

import com.google.gson.Gson;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduAchieve;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.service.educate.EduAchieveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教学成果控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/educate")
public class EduAchieveController {
    @Autowired
    private EduAchieveService eduAchieveService;

    /**教学成果操作*/
    /**使用分页查找所有教学成果*/
    @RequestMapping(value="/findEduAchieveAll.do")
    public String findEduAchieveAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduAchieve> list= eduAchieveService.findEduAchieveAll(map);
        int number = eduAchieveService.findEduAchieveNum();
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
        return "views/educate/achieve/edu_achieve_list";
    }

    /**根据教学成果编号查找查找教学成果*/
    @RequestMapping(value="/findEduAchieveById.do")
    public String findEduAchieveById(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduAchieve eduAchieve = eduAchieveService.findEduAchieveById(educate_id);
        model.addAttribute("eduAchieve",eduAchieve);
        return "views/educate/achieve/edu_achieve_info";
    }

    /**修改教学成果前查找*/
    @RequestMapping(value="/toUpdateEduAchieveById.do")
    public String toUpdateEduAchieveById(Model model,@RequestParam("educate_id")Integer educate_id) {
        EduAchieve eduAchieve = eduAchieveService.findEduAchieveById(educate_id);
        model.addAttribute("eduAchieve",eduAchieve);
        return "views/educate/achieve/edu_achieve_edit";
    }

    /**根据教学成果编号修改教学成果*/
    @RequestMapping(value="/updateEduAchieveById.do")
    public String updateEduAchieveById(EduAchieve eduAchieve) {
        eduAchieveService.updateEduAchieveById(eduAchieve);
        return "redirect:findEduAchieveAll.do";
    }

    /**跳转到添加教学成果*/
    @RequestMapping("toAddEduAchieve.do")
    public String toAddEduAchieve(Model model) {
        return "views/educate/achieve/edu_achieve_add";
    }

    /**增加教学成果*/
    @RequestMapping(value="/addEduAchieve.do")
    public String addEduAchieve(EduAchieve eduAchieve) {
        eduAchieveService.addEduAchieve(eduAchieve);
        return "redirect:findEduAchieveAll.do";
    }

    /**根据编号删除教学成果*/
    @RequestMapping(value="/deleteEduAchieveById.do")
    public String deleteEduAchieveById(@RequestParam("educate_id") Integer educate_id) {
        eduAchieveService.deleteAchieveListByIdAll(educate_id);
        eduAchieveService.deleteEduAchieveById(educate_id);
        return "redirect:findEduAchieveAll.do";
    }

    /**获奖名单操作*/
    /**根据教学成果编号获取所有获奖名单*/
    @RequestMapping(value="/findAchieveListAll.do")
    public String findAchieveListAll(Model model, @RequestParam(value = "educate_id") Integer educate_id) {
        Map<String,Object>map = new HashMap<>();
        map.put("educate_id",educate_id);
        List<EduAchieve> achieveList= eduAchieveService.findAchieveListAll(map);
        EduAchieve eduAchieve = eduAchieveService.findEduAchieveById(educate_id);
        model.addAttribute("achieveList",achieveList);
        model.addAttribute("eduAchieve",eduAchieve);
        return "views/educate/achieve/edu_achieve_info";
    }

    /**根据教学成果编号查找获奖名单*/
    @RequestMapping(value="/findAchieveListById.do")
    public String findAchieveListById(Model model,@RequestParam("achieve_id") Integer achieve_id) {
        EduAchieve eduAchieveList = eduAchieveService.findAchieveListById(achieve_id);
        model.addAttribute("achieveList",eduAchieveList);
        return "views/educate/achieve/edu_achieve_info";
    }

    /**修改获奖名单前查找*/
    @RequestMapping(value="/toUpdateAchieveListById.do")
    public String toUpdateAchieveListById(Model model,@RequestParam("achieve_id")Integer achieve_id) {
        EduAchieve achieveList = eduAchieveService.findAchieveListById(achieve_id);
        model.addAttribute("achieveList",achieveList);
        return "views/educate/achieve/edu_achieve_list_edit";
    }

    /**根据序号修改获奖名单*/
    @RequestMapping(value="/updateAchieveListById.do")
    public String updateEduAchieveListById(EduAchieve eduAchieve, RedirectAttributes attr) {
        eduAchieveService.updateAchieveListById(eduAchieve);
        attr.addAttribute("educate_id",eduAchieve.getEducate_id());
        return "redirect:findAchieveListAll.do";
    }

    /**跳转到添加获奖名单*/
    @RequestMapping("toAddAchieveList.do")
    public String toAddAchieveList(Model model,@RequestParam("educate_id")Integer achieve_id) {
        EduAchieve eduAchieve = eduAchieveService.findAchieveListById(achieve_id);
        model.addAttribute("educate_id",eduAchieve.getEducate_id());
        model.addAttribute("achieveList",eduAchieve);
        return "views/educate/achieve/edu_achieve_list_add";
    }

    /**增加获奖名单*/
    @RequestMapping(value="/addAchieveList.do")
    public String addAchieveList(EduAchieve eduAchieve, RedirectAttributes attr) {
        attr.addAttribute("educate_id",eduAchieve.getEducate_id());
        eduAchieveService.addAchieveList(eduAchieve);
        return "redirect:findAchieveListAll.do";
    }

    /**根据编号删除获奖名单*/
    @RequestMapping(value="/deleteAchieveListById.do")
    public String deleteAchieveListById(@RequestParam("achieve_id") Integer achieve_id,@RequestParam("educate_id") Integer educate_id, RedirectAttributes attr) {
        eduAchieveService.deleteAchieveListById(achieve_id);
        attr.addAttribute("educate_id",educate_id);
        return "redirect:findAchieveListAll.do";
    }

    /**页面*/
    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findEduAchieveAll2.do")
    public String findEduAchieveAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduAchieve> list= eduAchieveService.findEduAchieveAll(map);
        int number = eduAchieveService.findEduAchieveNum();
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
        return "pages/educate/edu_achieve_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findEduAchieveById2.do")
    public String findEduAchieveById2(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduAchieve achieve = eduAchieveService.findEduAchieveById(educate_id);
        Map<String,Object> map = new HashMap<>();
        map.put("educate_id",achieve.getEducate_id());
        List<EduAchieve> eduAchieve = eduAchieveService.findAchieveListAll(map);
        model.addAttribute("achieve",achieve);
        model.addAttribute("eduAchieve",eduAchieve);
        return "pages/educate/edu_achieve_info";
    }


}
