package com.xinzhiyun.universitysciencesys.controller.datum;

import com.xinzhiyun.universitysciencesys.pojo.datum.Datum;
import com.xinzhiyun.universitysciencesys.service.datum.DatumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 在线资源控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-28 08:57
 **/
@Controller
@RequestMapping("/datum")
public class DatumController {
    @Autowired
    private DatumService datumService;

    /**使用分页查找所有在线资源*/
    @RequestMapping(value="/findDatumAll.do")
    public String findDatumAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<Datum> list= datumService.findDatumAll(map);
        int number = datumService.findDatumNum();
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
        return "views/datum/datum_list";
    }

    /**根据在线资源编号查找查找在线资源*/
    @RequestMapping(value="/findDatumById.do")
    public String findDatumById(Model model,@RequestParam("datum_id") Integer datum_id) {
        Datum datum = datumService.findDatumById(datum_id);
        model.addAttribute("datum",datum);
        return "views/datum/datum_info";
    }

    /**修改在线资源前查找*/
    @RequestMapping(value="/toUpdateDatumById.do")
    public String toUpdateDatumById(Model model,@RequestParam("datum_id")Integer datum_id) {
        Datum datum = datumService.findDatumById(datum_id);
        model.addAttribute("datum",datum);
        return "views/datum/datum_edit";
    }

    /**根据在线资源编号修改在线资源*/
    @RequestMapping(value="/updateDatumById.do")
    public String updateDatumById(Datum datum,@RequestParam("fileDoc") MultipartFile fileDoc) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/file/datum/";
        if(!fileDoc.isEmpty()){
            orginName= fileDoc.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                fileDoc.transferTo(file);
                datum.setFile_name(path+orginName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        datumService.updateDatumById(datum);
        return "redirect:findDatumAll.do";
    }

    /**跳转到添加在线资源*/
    @RequestMapping("toAddDatum.do")
    public String toAddDatum() {
        return "views/datum/datum_add";
    }

    /**增加在线资源*/
    @RequestMapping(value="/addDatum.do")
    public String addDatum(Datum datum,@RequestParam("fileDoc") MultipartFile fileDoc) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/file/datum/";
        if(!fileDoc.isEmpty()){
            orginName= fileDoc.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                fileDoc.transferTo(file);
                datum.setFile_name(path+orginName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        datumService.addDatum(datum);
        return "redirect:findDatumAll.do";
    }

    /**根据编号删除在线资源*/
    @RequestMapping(value="/deleteDatumById.do")
    public String deleteDatumById(@RequestParam("datum_id") Integer datum_id) {
        datumService.deleteDatumById(datum_id);
        return "redirect:findDatumAll.do";
    }

    @RequestMapping(value="/downloadFile")
    public String downLoadFile(@RequestParam("fname") String fname, HttpServletResponse response) throws UnsupportedEncodingException {
        String fileName = fname.substring(fname.lastIndexOf("\\")+1);
        File file = new File(fname);
        if(file.exists()){
            response.setContentType("application/vnd.ms-excel;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Disposition", "attachment;fileName=" +   java.net.URLEncoder.encode(fileName,"UTF-8"));
            //文件流操作
            BufferedInputStream bis = null;
            OutputStream os = null;
             byte [] bytes = new byte[1024];
            try {
                bis =  new BufferedInputStream(new FileInputStream(file));
                os = response.getOutputStream();
                int temp =0;
                while((temp=bis.read(bytes))!=-1){
                    os.write(bytes,0,temp);
                }
                os.flush();
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                bis.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Datum datum = datumService.findDatumByFileName(fileName);
            long number = datum.getNumber()+1;
            datum.setNumber(number);
            datumService.updateDatumById(datum);
        }
        return null;
    }




    /**页面层*/
    /**使用类型查找所有在线资源*/
    @RequestMapping(value="/findDatumByType2.do")
    public String findDatumByType2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize,@RequestParam("type")String type) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<Datum> list= datumService.findDatumByType(map);
        int number = datumService.findDatumNum();
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
        model.addAttribute("type",type);
        return "pages/datum/dat_datum_list";
    }


    /**根据编号查找在线资源*/
    @RequestMapping(value="/findDatumById2.do")
    public String findDatumById2(Model model,@RequestParam("datum_id") Integer datum_id) {
        Datum datum = datumService.findDatumById(datum_id);
        String type = datum.getType();
        Long number = datum.getNumber();
        model.addAttribute("datum",datum);
        model.addAttribute("type",type);
        model.addAttribute("number",number);
        return "pages/datum/dat_datum_info";
    }

}
