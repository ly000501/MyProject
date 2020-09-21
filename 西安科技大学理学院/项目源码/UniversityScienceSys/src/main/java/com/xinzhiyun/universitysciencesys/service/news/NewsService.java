package com.xinzhiyun.universitysciencesys.service.news;

import com.xinzhiyun.universitysciencesys.pojo.news.News;

import java.util.List;

/**
 * 新闻公告业务层
 */
public interface NewsService {

    /**使用分页查找所有新闻公告*/
    List<News> findNewsListAll(Integer pageNum,Integer pageSize);

    /**查找所有新闻公告总数*/
    int findNewsNum();

    /**根据新闻编号查找查找新闻公告*/
    News findNewById(Integer news_id);

    /**根据新闻编号修改新闻*/
    Integer updateNewsById(News news);

    /**增加新闻*/
    Integer addNews(News news);

    /**根据编号删除新闻*/
    Integer deleteNewsById(List<Integer> news_id);
}
