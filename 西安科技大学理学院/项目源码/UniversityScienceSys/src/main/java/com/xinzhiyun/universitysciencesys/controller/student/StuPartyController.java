package com.xinzhiyun.universitysciencesys.controller.student;

import com.xinzhiyun.universitysciencesys.pojo.student.StuParty;
import com.xinzhiyun.universitysciencesys.service.student.StuPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
 * @description: 学生党建控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-04 09:06
 **/
@Controller
@RequestMapping("/student")
public class StuPartyController {

    @Autowired
    private StuPartyService stuPartyService;

    /**使用分页查找所有学生工作*/
    @RequestMapping(value="/findStuPartyAll.do")
    public String findStuPartyAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "6")Integer pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<StuParty> list= stuPartyService.findStuPartyAll(map);
        int number = stuPartyService.findStuPartyNum();
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
        return "views/student/stu_party_list";
    }


    /**修改在线资源前查找*/
    @RequestMapping(value="/toUpdateStuPartyById.do")
    public String toUpdateStuPartyById(Model model,@RequestParam("party_id")Integer party_id) {
        StuParty stuParty = stuPartyService.findStuPartyById(party_id);
        model.addAttribute("stuParty",stuParty);
        return "views/student/stu_party_edit";
    }

    /**根据在线资源编号修改在线资源*/
    @RequestMapping(value="/updateStuPartyById.do")
    public String updateStuPartyById(StuParty stuParty,@RequestParam("fileDoc") MultipartFile fileDoc) {
        System.out.println(stuParty);
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/file/student/party/";
        if(!fileDoc.isEmpty()){
            orginName= fileDoc.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                fileDoc.transferTo(file);
                stuParty.setParty_name(path+orginName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        stuPartyService.updateStuPartyById(stuParty);
        return "redirect:findStuPartyAll.do";
    }

    /**跳转到添加在线资源*/
    @RequestMapping("toAddStuParty.do")
    public String toAddStuParty() {
        return "views/student/stu_party_add";
    }

    /**增加在线资源*/
    @RequestMapping(value="/addStuParty.do")
    public String addStuParty(StuParty stuParty,@RequestParam("fileDoc") MultipartFile fileDoc) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/file/student/party/";
        if(!fileDoc.isEmpty()){
            orginName= fileDoc.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                fileDoc.transferTo(file);
                stuParty.setFile(path+orginName);
                stuParty.setParty_name(orginName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        stuPartyService.addStuParty(stuParty);
        return "redirect:findStuPartyAll.do";
    }

    /**根据编号删除在线资源*/
    @RequestMapping(value="/deleteStuPartyById.do")
    public String deleteStuPartyById(@RequestParam("party_id") Integer party_id) {
        stuPartyService.deleteStuPartyById(party_id);
        return "redirect:findStuPartyAll.do";
    }



    /**资源下载*/
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

            
        }
        return null;
    }



    /**页面层*/
    /**使用分页查找所有学生工作*/
    @RequestMapping(value="/findStuPartyAll2.do")
    public String findStuPartyAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "6")Integer pageSize) {
        Map<String,Object> map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<StuParty> list= stuPartyService.findStuPartyAll(map);
        int number = stuPartyService.findStuPartyNum();
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
        return "pages/student/stu_party_info";
    }


}
