package com.xinzhiyun.universitysciencesys.pojo.college;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: UniversityScienceSys
 * @description: 学院概况实体类
 * @Param:
 * 编号：college_id
 * 标题：college_title
 * 日期：date
 * 记者：person
 * 内容：content
 * 类型：type
 * @create: 2020-08-18 14:32
 **/
public class College implements Serializable {
    private Integer college_id;
    private String college_title;
    private String date;
    private String person;
    private String content;
    private String type;

    public Integer getCollege_id() {
        return college_id;
    }

    public void setCollege_id(Integer college_id) {
        this.college_id = college_id;
    }

    public String getCollege_title() {
        return college_title;
    }

    public void setCollege_title(String college_title) {
        this.college_title = college_title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", college_title='" + college_title + '\'' +
                ", date='" + date + '\'' +
                ", person='" + person + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                '}';
    }
}
