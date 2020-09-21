package com.xinzhiyun.universitysciencesys.dao.news;

import com.xinzhiyun.universitysciencesys.pojo.news.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：xxx
 * @description：新闻公告dao层
 * @date ：2020/8/12 14:04
 */
@Repository
public interface NewsDao {

    /**使用分页查找所有新闻公告*/
    @Select("select news_id,news_title,person,date,content from news limit ${(pageNum-1)*pageSize},${pageSize}")
    List<News> findNewsListAll(@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);

    /**查找所有新闻公告总数*/
    @Select("select count(news_id) from news")
    int findNewsNum();

    /**根据新闻编号查找查找新闻公告*/
    @Select("select news_id,news_title,person,date,content from news where news_id = #{news_id}")
    News findNewById(@Param("news_id")Integer news_id);

    /**根据新闻编号修改新闻*/
    @Update("update news set news_title = #{news_title},person=#{person},date=#{date},content=#{content} where news_id =#{news_id}")
    Integer updateNewsById(News news);

    /**增加新闻*/
    @Insert("insert into news (news_title,person,date,content) values(#{news_title},#{person},#{date},#{content})")
    Integer addNews(News news);

    /**根据编号删除新闻*/
    @Delete({"<script>" ,
            "<foreach collection='list' item='item'  index='index'   separator=';'>" ,
            " delete from news  where news_id = #{item}" ,
            "</foreach> ;",
            "</script>"})
    Integer deleteNewsById(@Param(value="list")List<Integer> list);

}
