package com.xinzhiyun.universitysciencesys.controller;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.pojo.news.News;
import com.xinzhiyun.universitysciencesys.pojo.party.Party;
import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;
import com.xinzhiyun.universitysciencesys.pojo.student.StuParty;
import com.xinzhiyun.universitysciencesys.pojo.student.Student;
import com.xinzhiyun.universitysciencesys.service.educate.EduInfoService;
import com.xinzhiyun.universitysciencesys.service.news.NewsService;
import com.xinzhiyun.universitysciencesys.service.party.PartyService;
import com.xinzhiyun.universitysciencesys.service.science.SciInfoService;
import com.xinzhiyun.universitysciencesys.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：xxx
 * @description：进入页面
 * @date ：2020/8/14 09:24
 */
@Controller
public class IndexController {
    /**新闻公告*/
    @Autowired
    NewsService newsService;
    /**党员活动*/
    @Autowired
    private PartyService partyService;
    /**科研信息*/
    @Autowired
    private SciInfoService sciInfoService;
    /**教务信息*/
    @Autowired
    private EduInfoService eduInfoService;
    /**学工动态*/
    @Autowired
    private StudentService studentService;


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/pages")
    public String pages(Model model){
        int pageNum = 1;
        int pageSize = 5;
        Map<String,Object>map = new HashMap<>();
        map.put("pageNum",pageNum);
        map.put("pageSize",pageSize);

        /**新闻公告*/
        List<News> newsList = newsService.findNewsListAll(pageNum,pageSize);
        model.addAttribute("newsList",newsList);
        /**党员活动*/
        map.put("type","党员活动");
        List<Party> partyList = partyService.findPartyByType(map);
        model.addAttribute("partyList",partyList);

        /**科研信息*/
        List<SciInfo> sciInList= sciInfoService.findSciInfoAll(map);
        model.addAttribute("sciInList",sciInList);

        /**教务信息*/
        List<EduInfo> eduInfoList=eduInfoService.findEduInfoAll(map);
        model.addAttribute("eduInfoList",eduInfoList);
        /**学工动态*/
        map.put("type","学工动态");
        List<Student> studentList=studentService.findStudentByType(map);
        model.addAttribute("studentList",studentList);

        return "index2";
    }

    @RequestMapping("/pageNav")
    public String pageNav(){
        return "pagenav";
    }

    @RequestMapping("/footer")
    public String footer(){
        return "footer";
    }


}
