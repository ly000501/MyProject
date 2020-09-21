package com.xinzhiyun.universitysciencesys.pojo.educate;

/**
 * @program: UniversityScienceSys
 * @description: 管理制度Pojo类
 * @Param:
 * educate_id：编号
 * educate_title：标题
 * date：时间
 * content：内容
 * @author: Mr.Li
 * @create: 2020-08-21 11:19
 **/
public class EduManage {

    private Integer educate_id;
    private String educate_title;
    private String date;
    private String content;

    public Integer getEducate_id() {
        return educate_id;
    }

    public void setEducate_id(Integer educate_id) {
        this.educate_id = educate_id;
    }

    public String getEducate_title() {
        return educate_title;
    }

    public void setEducate_title(String educate_title) {
        this.educate_title = educate_title;
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
        return "EduManage{" +
                "educate_id=" + educate_id +
                ", educate_title='" + educate_title + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
