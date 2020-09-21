package com.xinzhiyun.universitysciencesys.controller.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraSystem;
import com.xinzhiyun.universitysciencesys.service.train.TraSystemService;
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
 * @description: 培养制度控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 10:38
 **/
@Controller
@RequestMapping("/train")
public class TraSystemController {
    @Autowired
    private TraSystemService traSystemService;

    /**本科生与研究生的增加与修改*/
    /**跳转到添加培养制度*/
    @RequestMapping("toAddTraSystem.do")
    public String toAddTraSystem() {
        return "views/train/system/tra_system_add";
    }

    /**增加培养制度*/
    @RequestMapping(value="/addTraSystem.do")
    public String addTraSystem(TraSystem traSystem,Model model) {
        traSystemService.addTraSystem(traSystem);
        String type = traSystem.getType();
        if("本科生".equals(type)){
            return "redirect:findRegTraSystemAll.do";
        }else if("研究生".equals(type)){
            return "redirect:findGraTraSystemAll.do";
        }else{
            model.addAttribute("error","培养制度添加失败");
            return "error";
        }
    }

    /**修改培养制度前查找*/
    @RequestMapping(value="/toUpdateTraSystemById.do")
    public String toUpdateTraSystemById(Model model,@RequestParam("train_id")Integer train_id) {
        TraSystem traSystem = traSystemService.findTraSystemById(train_id);
        model.addAttribute("traSystem",traSystem);
        return "views/train/system/tra_system_edit";
    }

    /**根据培养制度编号修改培养制度*/
    @RequestMapping(value="/updateTraSystemById.do")
    public String updateTraSystemById(TraSystem traSystem,Model model) {
        traSystemService.updateTraSystemById(traSystem);
        String type = traSystem.getType();
        if("本科生".equals(type)){
            return "redirect:findRegTraSystemAll.do";
        }else if("研究生".equals(type)){
            return "redirect:findGraTraSystemAll.do";
        }else{
            model.addAttribute("error","培养制度修改失败");
            return "error";
        }
    }

    /**本科生*/
    /**使用分页查找本科生培养制度*/
    @RequestMapping(value="/findRegTraSystemAll.do")
    public String findRegTraSystemAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        String type ="本科生";
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<TraSystem> list= traSystemService.findTraSystemAll(map);
        int number = traSystemService.findTraSystemNum(type);
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
        return "views/train/system/tra_sys_regular_list";
    }

    /**根据编号查找本科生培养制度*/
    @RequestMapping(value="/findRegTraSystemById.do")
    public String findRegTraSystemById(Model model,@RequestParam("train_id") Integer train_id) {
        TraSystem traSystem = traSystemService.findTraSystemById(train_id);
        model.addAttribute("traSystem",traSystem);
        return "views/train/system/tra_sys_regular_info";
    }



    /**根据编号删除本科生培养制度*/
    @RequestMapping(value="/deleteRefTraSystemById.do")
    public String deleteRefTraSystemById(@RequestParam("train_id") Integer train_id) {
        traSystemService.deleteTraSystemById(train_id);
        return "redirect:findRegTraSystemAll.do";
    }


    /**研究生*/
    /**使用分页查找研究生培养制度*/
    @RequestMapping(value="/findGraTraSystemAll.do")
    public String findGraTraSystemAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        String type = "研究生";
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<TraSystem> list= traSystemService.findTraSystemAll(map);
        int number = traSystemService.findTraSystemNum(type);
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
        return "views/train/system/tra_sys_graduate_list";
    }

    /**根据编号查找研究生培养制度*/
    @RequestMapping(value="/findGraTraSystemById.do")
    public String findGraTraSystemById(Model model,@RequestParam("train_id") Integer train_id) {
        TraSystem traSystem = traSystemService.findTraSystemById(train_id);
        model.addAttribute("traSystem",traSystem);
        return "views/train/system/tra_sys_graduate_info";
    }


    /**根据编号删除研究生培养制度*/
    @RequestMapping(value="/deleteGraTraSystemById.do")
    public String deleteGraTraSystemById(@RequestParam("train_id") Integer train_id) {
        traSystemService.deleteTraSystemById(train_id);
        return "redirect:findGraTraSystemAll.do";
    }

    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findTraSystemAll2.do")
    public String findTraSystemAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize,@RequestParam("type")String type) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<TraSystem> list= traSystemService.findTraSystemAll(map);
        int number = traSystemService.findTraSystemNum(type);
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
        if("本科生".equals(type)){
            return "pages/train/regular/tra_reg_system_list";
        }else if("研究生".equals(type)){
            return "pages/train/graduate/tra_gra_system_list";
        }else{
            model.addAttribute("error","学生培养查找错误！");
            return "error";
        }
    }

    /**根据教务信息编号查找查找教务信息*/
    @RequestMapping(value="/findTraSystemById2.do")
    public String findTraSystemById2(Model model,@RequestParam("train_id") Integer train_id) {
        TraSystem traSystem = traSystemService.findTraSystemById(train_id);
        model.addAttribute("traSystem",traSystem);
        String type = traSystem.getType();
        if("本科生".equals(type)){
            return "pages/train/regular/tra_reg_system_info";
        }else if("研究生".equals(type)){
            return "pages/train/graduate/tra_gra_system_info";
        }else{
            model.addAttribute("error","学生培养查找错误！");
            return "error";
        }
    }

}
