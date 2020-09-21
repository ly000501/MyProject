package com.xinzhiyun.universitysciencesys.pojo.student;

/**
 * @program: UniversityScienceSys
 * @description: 团委、学生会pojo
 * @Param:
 * union_id:
 * union_title:
 * date:日期
 * person：人名
 * content：内容
 * picture：图片
 * type：类别
 * @author: Mr.Li
 * @create: 2020-09-04 11:07
 **/
public class StuUnion {
    private Integer union_id;
    private String union_title;
    private String date;
    private String person;
    private String content;
    private String picture;
    private String type;

    public Integer getUnion_id() {
        return union_id;
    }

    public void setUnion_id(Integer union_id) {
        this.union_id = union_id;
    }

    public String getUnion_title() {
        return union_title;
    }

    public void setUnion_title(String union_title) {
        this.union_title = union_title;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "StuUnion{" +
                "union_id=" + union_id +
                ", union_title='" + union_title + '\'' +
                ", date='" + date + '\'' +
                ", person='" + person + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
