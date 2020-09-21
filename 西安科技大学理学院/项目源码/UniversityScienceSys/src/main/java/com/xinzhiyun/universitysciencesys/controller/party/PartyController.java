package com.xinzhiyun.universitysciencesys.controller.party;

import com.xinzhiyun.universitysciencesys.pojo.party.Party;
import com.xinzhiyun.universitysciencesys.service.party.PartyService;
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
 * @description: 党建工作控制层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 15:34
 **/
@Controller
@RequestMapping("/party")
public class PartyController {
    @Autowired
    private PartyService partyService;

    /**使用分页查找所有党建工作*/
    @RequestMapping(value="/findPartyAll.do")
    public String findPartyAll(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        List<Party> list= partyService.findPartyAll(map);
        int number = partyService.findPartyNum();
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
        return "views/party/party_list";
    }

    /**根据党建工作编号查找查找党建工作*/
    @RequestMapping(value="/findPartyById.do")
    public String findPartyById(Model model,@RequestParam("party_id") Integer party_id) {
        Party party = partyService.findPartyById(party_id);
        model.addAttribute("party",party);
        return "views/party/party_info";
    }

    /**修改党建工作前查找*/
    @RequestMapping(value="/toUpdatePartyById.do")
    public String toUpdatePartyById(Model model,@RequestParam("party_id")Integer party_id) {
        Party party = partyService.findPartyById(party_id);
        model.addAttribute("party",party);
        return "views/party/party_edit";
    }

    /**根据党建工作编号修改党建工作*/
    @RequestMapping(value="/updatePartyById.do")
    public String updatePartyById(Party party,@RequestParam("filePicture") MultipartFile filePicture) {
        String orginName=null;
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/party/";
        if(!filePicture.isEmpty()){
            orginName= filePicture.getOriginalFilename();
            File file =new File(path+orginName);
            try {
                filePicture.transferTo(file);
                String pathName = path.substring(path.indexOf("static"))+orginName;
                party.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        partyService.updatePartyById(party);
        return "redirect:findPartyAll.do";
    }

    /**跳转到添加党建工作*/
    @RequestMapping("toAddParty.do")
    public String toAddParty() {
        return "views/party/party_add";
    }

    /**增加党建工作*/
    @RequestMapping(value="/addParty.do")
    public String addParty(Party party,@RequestParam("filePicture") MultipartFile filePicture) {
        String orginName = filePicture.getOriginalFilename();
        String path="E:/WorkSpace/idea/UniversityScienceSys/src/main/resources/static/imgs/party/";
        if(!filePicture.isEmpty()){
            File file = new File(path+orginName);
            try {
                filePicture.transferTo(file);
                System.out.println("上传成功！");
                String pathName = path.substring(path.indexOf("static"))+orginName;
                party.setPicture("../"+pathName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        partyService.addParty(party);
        return "redirect:findPartyAll.do";
    }

    /**根据编号删除党建工作*/
    @RequestMapping(value="/deletePartyById.do")
    public String deletePartyById(@RequestParam("party_id") Integer party_id) {
        partyService.deletePartyById(party_id);
        return "redirect:findPartyAll.do";
    }


    /**页面层*/
    /**使用分页查找所有党建工作*/
    @RequestMapping(value="/findPartyAll2.do")
    public String findPartyAll2(Model model, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5")Integer pageSize,@RequestParam("type")String type) {
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);
        map.put("type",type);
        List<Party> list= partyService.findPartyByType(map);
        int number = partyService.findPartyNumByType(type);
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

        if("组织结构".equals(type)){
            Party party = list.get(0);
            model.addAttribute("party",party);
            return "pages/party/party_brief_info";
        }else{
            return "pages/party/party_list";
        }
    }

    /**根据编号查找查找党建工作*/
    @RequestMapping(value="/findPartyById2.do")
    public String findPartyById2(Model model,@RequestParam("party_id") Integer party_id) {
        Party party = partyService.findPartyById(party_id);
        model.addAttribute("party",party);
        return "pages/party/party_info";
    }


}
