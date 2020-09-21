package com.xinzhiyun.universitysciencesys.controller.outstand;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.pojo.outstand.OutAlumna;
import com.xinzhiyun.universitysciencesys.service.outstand.OutAlumnaService;
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
 * @description: 杰出校友控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 14:05
 **/
@Controller
@RequestMapping("/outstand")
public class OutAlumnaController {
    @Autowired
    private OutAlumnaService outAlumnaService;

    /**使用分页查找所有杰出校友*/
    @RequestMapping(value="/findOutAlumnaAll.do")
    public String findOutAlumnaAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<OutAlumna> list= outAlumnaService.findOutAlumnaAll(map);
        int number = outAlumnaService.findOutAlumnaNum();
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
        return "views/outstand/out_alumna_list";
    }

    /**根据杰出校友编号查找查找杰出校友*/
    @RequestMapping(value="/findOutAlumnaById.do")
    public String findOutAlumnaById(Model model,@RequestParam("outstand_id") Integer outstand_id) {
        OutAlumna outAlumna = outAlumnaService.findOutAlumnaById(outstand_id);
        model.addAttribute("outAlumna",outAlumna);
        return "views/outstand/out_alumna_info";
    }

    /**修改杰出校友前查找*/
    @RequestMapping(value="/toUpdateOutAlumnaById.do")
    public String toUpdateOutAlumnaById(Model model,@RequestParam("outstand_id")Integer outstand_id) {
        OutAlumna outAlumna = outAlumnaService.findOutAlumnaById(outstand_id);
        model.addAttribute("outAlumna",outAlumna);
        return "views/outstand/out_alumna_edit";
    }

    /**根据杰出校友编号修改杰出校友*/
    @RequestMapping(value="/updateOutAlumnaById.do")
    public String updateOutAlumnaById(OutAlumna outAlumna,@RequestParam("filePhoto") MultipartFile filePhoto) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/outstand/";
        if(!filePhoto.isEmpty()){
            orginName= filePhoto.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                filePhoto.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                outAlumna.setPhoto("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        outAlumnaService.updateOutAlumnaById(outAlumna);
        return "redirect:findOutAlumnaAll.do";
    }

    /**跳转到添加杰出校友*/
    @RequestMapping("toAddOutAlumna.do")
    public String toAddOutAlumna() {
        return "views/outstand/out_alumna_add";
    }

    /**增加杰出校友*/
    @RequestMapping(value="/addOutAlumna.do")
    public String addOutAlumna(OutAlumna outAlumna,@RequestParam("filePhoto") MultipartFile filePhoto) {
        String orginName = filePhoto.getOriginalFilename();
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/outstand/";
        if(!filePhoto.isEmpty()){
            File file = new File(path+orginName);
            try {
                filePhoto.transferTo(file);
                System.out.println("上传成功！");
                String pathName = path.substring(path.indexOf("static"))+orginName;
                outAlumna.setPhoto("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        outAlumnaService.addOutAlumna(outAlumna);
        return "redirect:findOutAlumnaAll.do";
    }

    /**根据编号删除杰出校友*/
    @RequestMapping(value="/deleteOutAlumnaById.do")
    public String deleteOutAlumnaById(@RequestParam("outstand_id") Integer outstand_id) {
        outAlumnaService.deleteOutAlumnaById(outstand_id);
        return "redirect:findOutAlumnaAll.do";
    }


    /**页面层*/
    /**使用分页查找所有杰出校友*/
    @RequestMapping(value="/findOutAlumnaAll2.do")
    public String findOutAlumnaAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<OutAlumna> list= outAlumnaService.findOutAlumnaAll(map);
        int number = outAlumnaService.findOutAlumnaNum();
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
        return "pages/outstand/out_alumna_list";
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findOutAlumnaById2.do")
    public String findOutAlumnaById2(Model model,@RequestParam("outstand_id") Integer outstand_id) {
        OutAlumna outAlumna = outAlumnaService.findOutAlumnaById(outstand_id);
        model.addAttribute("outAlumna",outAlumna);
        return "pages/outstand/out_alumna_info";
    }



}
