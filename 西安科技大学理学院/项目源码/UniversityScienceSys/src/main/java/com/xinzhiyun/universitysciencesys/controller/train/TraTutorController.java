package com.xinzhiyun.universitysciencesys.controller.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraTutor;
import com.xinzhiyun.universitysciencesys.service.train.TraTutorService;
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
 * @description: 导师控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 09:37
 **/
@Controller
@RequestMapping("/train")
public class TraTutorController {
    @Autowired
    private TraTutorService traTutorService;

    /**博士生导师与硕士生导师的增加与修改*/
    /**跳转到添加导师*/
    @RequestMapping("toAddTraTutor.do")
    public String toAddTraTutor() {
        return "views/train/tutor/tra_tutor_add";
    }

    /**增加导师*/
    @RequestMapping(value="/addTraTutor.do")
    public String addTraTutor(Model model,TraTutor traTutor,@RequestParam("filePhoto") MultipartFile filePhoto) {
        String orginName = filePhoto.getOriginalFilename();
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/train/tutor/";
        if(!filePhoto.isEmpty()){
            File file = new File(path+orginName);
            try {
                filePhoto.transferTo(file);
                System.out.println("上传成功！");
                String pathName = path.substring(path.indexOf("static"))+orginName;
                traTutor.setPhoto("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        traTutorService.addTraTutor(traTutor);
        String remark =traTutor.getRemark();
        if("博导".equals(remark)){
            return "redirect:findTraDoctorTutorAll.do";
        }else if (remark==null||"".equals(remark)){
            return "redirect:findTraMasterTutorAll.do";
        }else{
            model.addAttribute("error","导师添加失败");
            return "error";
        }
    }

    /**修改导师前查找*/
    @RequestMapping(value="/toUpdateTraTutorById.do")
    public String toUpdateTraTutorById(Model model,@RequestParam("train_id")Integer train_id) {
        TraTutor traTutor = traTutorService.findTraTutorById(train_id);
        model.addAttribute("traTutor",traTutor);
        return "views/train/tutor/tra_tutor_edit";
    }

    /**根据导师编号修改导师*/
    @RequestMapping(value="/updateTraTutorById.do")
    public String updateTraTutorById(Model model,TraTutor traTutor,@RequestParam("filePhoto") MultipartFile filePhoto) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/train/tutor/";
        if(!filePhoto.isEmpty()){
            orginName= filePhoto.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                filePhoto.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                traTutor.setPhoto("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        traTutorService.updateTraTutorById(traTutor);
        String remark =traTutor.getRemark();
        if("博导".equals(remark)){
            return "redirect:findTraDoctorTutorAll.do";
        }else if (remark==null||"".equals(remark)){
            return "redirect:findTraMasterTutorAll.do";
        }else{
            model.addAttribute("error","导师修改失败");
            return "error";
        }
    }



    /**博士生导师TraDoctor*/
    /**使用分页查找所有博士生导师*/
    @RequestMapping(value="/findTraDoctorTutorAll.do")
    public String findTraDoctorTutorAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        String remark = "博导";
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("remark",remark);
        List<TraTutor> list= traTutorService.findTraTutorAll(map);
        Map<String,Object>num = new HashMap<>();
        num.put("remark",remark);
        int number = traTutorService.findTraTutorNum(num);
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
        return "views/train/tutor/tra_doc_tutor_list";
    }



    /**根据导师编号查找查找导师*/
    @RequestMapping(value="/findTraDoctorTutorById.do")
    public String findTraDoctorTutorById(Model model,@RequestParam("train_id") Integer train_id) {
        TraTutor traTutor = traTutorService.findTraTutorById(train_id);
        model.addAttribute("traTutor",traTutor);
        return "views/train/tutor/tra_doc_tutor_info";
    }





    /**根据编号删除导师*/
    @RequestMapping(value="/deleteTraDoctorTutorById.do")
    public String deleteTraDoctorTutorById(@RequestParam("train_id") Integer train_id) {
        traTutorService.deleteTraTutorById(train_id);
        return "redirect:findTraDoctorTutorAll.do";
    }


    /**硕士生导师TraMaster*/
    /**使用分页查找所有硕士生导师*/
    @RequestMapping(value="/findTraMasterTutorAll.do")
    public String findTraMasterTutorAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        String remark = null;
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("remark",remark);
        List<TraTutor> list= traTutorService.findTraTutorAll(map);
        Map<String,Object>num = new HashMap<>();
        num.put("remark",remark);
        int number = traTutorService.findTraTutorNum(num);
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
        return "views/train/tutor/tra_mas_tutor_list";
    }

    /**根据导师编号查找查找导师*/
    @RequestMapping(value="/findMasterTraTutorById.do")
    public String findMasterTraTutorById(Model model,@RequestParam("train_id") Integer train_id) {
        TraTutor traTutor = traTutorService.findTraTutorById(train_id);
        model.addAttribute("traTutor",traTutor);
        return "views/train/tutor/tra_mas_tutor_info";
    }

    /**根据编号删除导师*/
    @RequestMapping(value="/deleteTraMasterTutorById.do")
    public String deleteTraMasterTutorById(@RequestParam("train_id") Integer train_id) {
        traTutorService.deleteTraTutorById(train_id);
        return "redirect:findTraMasterTutorAll.do";
    }

    /**页面*/
    /**使用分页查找博士生导师*/
    @RequestMapping(value="/findTraTutorByRemark.do")
    public String findTraTutorByRemark(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "6")Integer pageSize) {
        String remark ="博导";
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("remark",remark);
        List<TraTutor> list= traTutorService.findTraTutorAll(map);

        Map<String,Object> num = new HashMap<>();
        num.put("remark",remark);

        int number = traTutorService.findTraTutorNum(num);
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
        return "pages/train/tutor/tutor_regular_list";

    }

    /**使用分页查找硕士生导师*/
    @RequestMapping(value="/findTraTutorBySubject.do")
    public String findTraTutorBySubject(Model model) {
        //数学
        String subject1 = "数学";
        Map<String,Object>map1 = new HashMap<>();
        map1.put("subject",subject1);
        List<TraTutor> math= traTutorService.findTraGraTutorAll(map1);
        model.addAttribute("math",math);

        //工程力学、固体力学
        String subject2 = "工程力学、固体力学";
        Map<String,Object>map2 = new HashMap<>();
        map2.put("subject",subject2);
        List<TraTutor> engin= traTutorService.findTraGraTutorAll(map2);
        model.addAttribute("engin",engin);


        //工程力学、固体力学
        String subject3 = "物理学";
        Map<String,Object>map3 = new HashMap<>();
        map3.put("subject",subject3);
        List<TraTutor> physics= traTutorService.findTraGraTutorAll(map3);
        model.addAttribute("physics",physics);
        return "pages/train/tutor/tutor_graduate_list";
    }

    /**根据教编号查找博士生导师*/
    @RequestMapping(value="/findTraTutorById2.do")
    public String findTraTutorById2(Model model,@RequestParam("train_id") Integer train_id) {
        TraTutor traTutor = traTutorService.findTraTutorById(train_id);
        model.addAttribute("traTutor",traTutor);
        return "pages/train/tutor/tutor_regular_info";
    }

    /**根据教编号查找硕士生导师*/
    @RequestMapping(value="/findTraGraTutorById2.do")
    public String findTraGraTutorById2(Model model,@RequestParam("train_id") Integer train_id) {
        TraTutor traTutor = traTutorService.findTraTutorById(train_id);
        model.addAttribute("traTutor",traTutor);
        return "pages/train/tutor/tutor_graduate_info";
    }

}
