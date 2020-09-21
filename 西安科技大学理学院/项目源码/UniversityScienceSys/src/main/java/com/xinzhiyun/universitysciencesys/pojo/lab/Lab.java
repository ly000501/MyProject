package com.xinzhiyun.universitysciencesys.pojo.lab;

/**
 * @program: UniversityScienceSys
 * @description: 实验室建设pojo类
 * @Param:
 * lab_id:实验室编号
 * lab_title：标题
 * lab_name: 实验室名称
 * date:日期
 * content：内容
 * type：类型
 * @author: Mr.Li
 * @create: 2020-08-27 11:57
 **/
public class Lab {
    private Integer lab_id;
    private String lab_title;
    private String lab_name;
    private String date;
    private String content;
    private String type;

    public Integer getLab_id() {
        return lab_id;
    }

    public void setLab_id(Integer lab_id) {
        this.lab_id = lab_id;
    }

    public String getLab_title() {
        return lab_title;
    }

    public void setLab_title(String lab_title) {
        this.lab_title = lab_title;
    }

    public String getLab_name() {
        return lab_name;
    }

    public void setLab_name(String lab_name) {
        this.lab_name = lab_name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "lab_id=" + lab_id +
                ", lab_title='" + lab_title + '\'' +
                ", lab_name='" + lab_name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
