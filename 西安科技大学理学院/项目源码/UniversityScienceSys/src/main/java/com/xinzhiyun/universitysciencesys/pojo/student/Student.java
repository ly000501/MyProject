package com.xinzhiyun.universitysciencesys.pojo.student;

/**
 * @program: UniversityScienceSys
 * @description: 学生工作
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 16:35
 **/
public class Student {
    private Integer student_id;
    private String student_title;
    private String date;
    private String person;
    private String content;
    private String picture;
    private String type;

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getStudent_title() {
        return student_title;
    }

    public void setStudent_title(String student_title) {
        this.student_title = student_title;
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
        return "Student{" +
                "student_id=" + student_id +
                ", student_title='" + student_title + '\'' +
                ", date='" + date + '\'' +
                ", person='" + person + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
