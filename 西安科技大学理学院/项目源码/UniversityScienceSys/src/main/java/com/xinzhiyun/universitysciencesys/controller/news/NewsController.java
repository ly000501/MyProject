package com.xinzhiyun.universitysciencesys.controller.news;

import com.google.gson.Gson;
import com.xinzhiyun.universitysciencesys.pojo.news.News;
import com.xinzhiyun.universitysciencesys.service.news.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @author ：xxx
 * @description：新闻公告的控制层
 * @date ：2020/8/12 14:08
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    /**
    * @Description:跳转到新闻公告页面
     * @Date: 2020/8/15
    */
    @RequestMapping("/toNotice.do")
    public ModelAndView toNotice(@RequestParam(value="pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5") Integer pageSize, ModelAndView modelAndView){
        List<News> newsList =newsService.findNewsListAll(pageNum,pageSize);
        Integer numCount = newsService.findNewsNum();

        modelAndView.addObject("newsList",newsList);
        //每页记录数
        modelAndView.addObject("pageSize",pageSize);
        //第几页
        modelAndView.addObject("pageNum",pageNum);
        //共几页
        int pageCount = numCount%pageSize==0?numCount/pageSize:numCount/pageSize+1;
        modelAndView.addObject("pageCount",pageCount);
        modelAndView.setViewName("views/news/notice");
        return modelAndView;
    }

    /**
     * @Description:分页查找所有新闻公告
     * @Date: 2020/8/15
     */
    @RequestMapping(value="/findNewsList.do",produces ="application/json;charset=utf-8")
    @ResponseBody
    public String findNewsList(@RequestParam(value="page",defaultValue = "1") Integer page, @RequestParam(value="limit",defaultValue = "5") Integer limit, String sname){
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("limit",limit);
        map.put("sname",sname);
        Map<String,Object> result = new HashMap<>();
        result.put("code",0);
        result.put("msg","");
        result.put("count",newsService.findNewsNum());
        result.put("data",newsService.findNewsListAll(page,limit));
        return new Gson().toJson(result);
    }

    /**
    * @Description: 根据编号查询新闻
    * @Date: 2020/8/15
    */
    @RequestMapping("/findNewsById.do")
    public String findNewsById(Model model,Integer new_id){
        News news = newsService.findNewById(new_id);
        model.addAttribute("news",news);
        return "views/news/notice";
    }

    /**
     * @Description: 根据编号修改新闻
     * @Date: 2020/8/15
     */
    @RequestMapping("/updateNewsById.do")
    @ResponseBody
    public String updateNewsById(Model model,News news){
        Integer flag = newsService.updateNewsById(news);
        return flag.toString();
    }

    /**
     * @Description: 增加新闻
     * @Date: 2020/8/15
     */
    @RequestMapping("/addNews.do")
    @ResponseBody
    public String addNews(Model model,News news){
        Integer flag = newsService.addNews(news);
        return flag.toString();
    }

    /**
     * @Description: 根据编号删除新闻
     * @Date: 2020/8/15
     */
    @RequestMapping("/deleteNewsById.do")
    @ResponseBody
    public String deleteNewsById(Model model,@RequestParam(value="news_id[]",required=false) Integer news_id[]){
        List<Integer> list = new ArrayList();
        for(int i =0;i<news_id.length;i++){
            list.add(news_id[i]);
        }
        Integer flag = newsService.deleteNewsById(list);
        return flag.toString();
    }


    /**页面层*/
    @RequestMapping("/toNotice2.do")
    public String toNotice2(Model model,@RequestParam(value="pageNum",defaultValue = "1") Integer pageNum, @RequestParam(value="pageSize",defaultValue = "5") Integer pageSize, ModelAndView modelAndView){
        List<News> newsList =newsService.findNewsListAll(pageNum,pageSize);
        Integer numCount = newsService.findNewsNum();

        model.addAttribute("newsList",newsList);
        //每页记录数
        model.addAttribute("pageSize",pageSize);
        //第几页
        model.addAttribute("pageNum",pageNum);
        //共几页
        int pageCount = numCount%pageSize==0?numCount/pageSize:numCount/pageSize+1;
        model.addAttribute("pageCount",pageCount);
        return "views/news/notice";
    }


    /**根据编号查询新闻*/
    @RequestMapping("/findNewsById2.do")
    public String findNewsById2(Model model,@RequestParam("news_id") Integer news_id){
        News news = newsService.findNewById(news_id);
        model.addAttribute("newsInfo",news);
        return "pages/news/news_info";
    }


}
