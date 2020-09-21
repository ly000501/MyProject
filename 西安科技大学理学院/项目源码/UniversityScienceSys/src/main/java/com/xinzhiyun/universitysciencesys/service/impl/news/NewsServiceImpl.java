package com.xinzhiyun.universitysciencesys.service.impl.news;

import com.xinzhiyun.universitysciencesys.dao.news.NewsDao;
import com.xinzhiyun.universitysciencesys.pojo.news.News;
import com.xinzhiyun.universitysciencesys.service.news.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：xxx
 * @description：新闻公告实体类
 * @date ：2020/8/12 14:10
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDao newsDao;

    /**使用分页查找所有新闻公告*/
    @Override
    public List<News> findNewsListAll(Integer pageNum,Integer pageSize){return newsDao.findNewsListAll(pageNum,pageSize);}

    /**查找所有新闻公告总数*/
    @Override
    public int findNewsNum() { return newsDao.findNewsNum();}

    /**根据新闻编号查找查找新闻公告*/
    @Override
    public News findNewById(Integer news_id) {
        return newsDao.findNewById(news_id);
    }

    /**根据新闻编号修改新闻*/
    @Override
    public Integer updateNewsById(News news) {
        return newsDao.updateNewsById(news);
    }

    /**增加新闻*/
    @Override
    public Integer addNews(News news) {
        return newsDao.addNews(news);
    }

    /**根据编号删除新闻*/
    @Override
    public Integer deleteNewsById(List<Integer> news_id) {
        return newsDao.deleteNewsById(news_id);
    }

}
