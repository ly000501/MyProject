package com.xinzhiyun.universitysciencesys.pojo.news;

import java.io.Serializable;
/**
 * @Description: 新闻实体类
 * @Param:
 * 新闻编号:news_id
 * 新闻标题:news_title
 * 记者:person
 * 时间:date
 * 内容:content
* @return:
* @Date: 2020/8/18
*/
public class News implements Serializable {
    private Integer news_id;
    private String news_title;
    private String person;
    private String date;
    private String content;

    public Integer getNews_id() { return news_id; }

    public void setNews_id(Integer news_id) { this.news_id = news_id; }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "news_id=" + news_id +
                ", news_title='" + news_title + '\'' +
                ", person='" + person + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
