package com.xinzhiyun.universitysciencesys.controller.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduFlow;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.service.educate.EduFlowService;
import com.xinzhiyun.universitysciencesys.service.educate.EduInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教务办公流程控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/educate")
public class EduFlowController {
    @Autowired
    private EduFlowService eduFlowService;

    /**使用分页查找所有教务办公流程*/
    @RequestMapping(value="/findEduFlowAll.do")
    public String findEduFlowAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduFlow> list= eduFlowService.findEduFlowAll(map);
        int number = eduFlowService.findEduFlowNum();
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
        return "views/educate/flow/edu_flow_list";
    }

    /**根据教务办公流程编号查找查找教务办公流程*/
    @RequestMapping(value="/findEduFlowById.do")
    public String findEduFlowById(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduFlow eduFlow = eduFlowService.findEduFlowById(educate_id);
        model.addAttribute("eduFlow",eduFlow);
        return "views/educate/flow/edu_flow_info";
    }

    /**修改教务办公流程前查找*/
    @RequestMapping(value="/toUpdateEduFlowById.do")
    public String toUpdateEduFlowById(Model model,@RequestParam("educate_id")Integer educate_id) {
        EduFlow eduFlow = eduFlowService.findEduFlowById(educate_id);
        model.addAttribute("eduFlow",eduFlow);
        return "views/educate/flow/edu_flow_edit";
    }

    /**根据教务办公流程编号修改教务办公流程*/
    @RequestMapping(value="/updateEduFlowById.do")
    public String updateEduFlowById(EduFlow eduFlow,@RequestParam("filePicture") MultipartFile filePicture) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/educate/edu_flow/";
        if(!filePicture.isEmpty()){
            orginName= filePicture.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                filePicture.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                eduFlow.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        eduFlowService.updateEduFlowById(eduFlow);
        return "redirect:findEduFlowAll.do";
    }

    /**
     * @Description: 跳转到添加教务办公流程
     * @Date: 2020/8/19
     */
    @RequestMapping("toAddEduFlow.do")
    public String toAddEduFlow() {
        return "views/educate/flow/edu_flow_add";
    }

    /**增加教务办公流程*/
    @RequestMapping(value="/addEduFlow.do")
    public String addEduFlow(EduFlow eduFlow,@RequestParam("filePicture") MultipartFile filePicture) {
        String orginName = filePicture.getOriginalFilename();
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/educate/edu_flow/";

        File file = new File(path+orginName);
        try {
            filePicture.transferTo(file);
            System.out.println("上传成功！");
            String pathName = path.substring(path.indexOf("static"))+orginName;
            eduFlow.setPicture("../"+pathName);
            System.out.println("eduFlow: "+eduFlow);
        } catch (IOException e) {
            e.printStackTrace();
        }

        eduFlowService.addEduFlow(eduFlow);
        return "redirect:findEduFlowAll.do";
    }

    /**根据编号删除教务办公流程*/
    @RequestMapping(value="/deleteEduFlowById.do")
    public String deleteEduFlowById(@RequestParam("educate_id") Integer educate_id) {
        eduFlowService.deleteEduFlowById(educate_id);
        return "redirect:findEduFlowAll.do";
    }

    /**页面控制*/
    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findEduFlowAll2.do")
    public String findEduFlowAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<EduFlow> list= eduFlowService.findEduFlowAll(map);
        int number = eduFlowService.findEduFlowNum();
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
        return "pages/educate/edu_flow_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findEduFlowById2.do")
    public String findEduFlowById2(Model model,@RequestParam("educate_id") Integer educate_id) {
        EduFlow eduFlow = eduFlowService.findEduFlowById(educate_id);
        model.addAttribute("eduFlow",eduFlow);
        return "pages/educate/edu_flow_info";
    }



}
