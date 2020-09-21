package com.xinzhiyun.universitysciencesys.controller.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduResource;
import com.xinzhiyun.universitysciencesys.service.educate.EduResourceService;
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
 * @description: 在线资源控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/educate")
public class EduResourceController {
    @Autowired
    private EduResourceService eduResourceService;

    /**使用分页查找所有在线资源*/
    @RequestMapping(value="/findEduResourceAll.do")
    public String findEduResourceAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduResource> list= eduResourceService.findEduResourceAll(map);
        int number = eduResourceService.findEduResourceNum();
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
        return "views/educate/resource/edu_resource_list";
    }

    /**根据在线资源编号查找查找在线资源*/
    @RequestMapping(value="/findEduResourceById.do")
    public String findEduResourceById(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduResource eduResource = eduResourceService.findEduResourceById(educate_id);
        model.addAttribute("eduResource",eduResource);
        return "views/educate/resource/edu_resource_info";
    }

    /**修改在线资源前查找*/
    @RequestMapping(value="/toUpdateEduResourceById.do")
    public String toUpdateEduResourceById(Model model,@RequestParam("educate_id")Integer educate_id) {
        EduResource eduResource = eduResourceService.findEduResourceById(educate_id);
        model.addAttribute("eduResource",eduResource);
        return "views/educate/resource/edu_resource_edit";
    }

    /**根据在线资源编号修改在线资源*/
    @RequestMapping(value="/updateEduResourceById.do")
    public String updateEduResourceById(EduResource eduResource) {
        eduResourceService.updateEduResourceById(eduResource);
        return "redirect:findEduResourceAll.do";
    }

    /**
     * @Description: 跳转到添加在线资源
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddEduResource.do")
    public String toAddEduResource() {
        return "views/educate/resource/edu_resource_add";
    }

    /**增加在线资源*/
    @RequestMapping(value="/addEduResource.do")
    public String addEduResource(EduResource eduResource) {
        eduResourceService.addEduResource(eduResource);
        return "redirect:findEduResourceAll.do";
    }

    /**根据编号删除在线资源*/
    @RequestMapping(value="/deleteEduResourceById.do")
    public String deleteEduResourceById(@RequestParam("educate_id") Integer educate_id) {
        eduResourceService.deleteEduResourceById(educate_id);
        return "redirect:findEduResourceAll.do";
    }

    /**页面*/
    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findEduResourceAll2.do")
    public String findEduResourceAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduResource> list= eduResourceService.findEduResourceAll(map);
        int number = eduResourceService.findEduResourceNum();
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
        return "pages/educate/edu_resource_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findEduResourceById2.do")
    public String findEduResourceById2(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduResource eduResource = eduResourceService.findEduResourceById(educate_id);
        model.addAttribute("eduResource",eduResource);
        return "pages/educate/edu_resource_info";
    }


}
