package com.xinzhiyun.universitysciencesys.pojo.work;

/**
 * @program: UniversityScienceSys
 * @description: 招生信息
 * @Param:
 * work_id：编号
 * work_title：标题
 * date：日期
 * content内容
 * @author: Mr.Li
 * @create: 2020-08-26 10:18
 **/
public class WorInfo {
    private Integer work_id;
    private String work_title;
    private String date;
    private String content;

    public Integer getWork_id() {
        return work_id;
    }

    public void setWork_id(Integer work_id) {
        this.work_id = work_id;
    }

    public String getWork_title() {
        return work_title;
    }

    public void setWork_title(String work_title) {
        this.work_title = work_title;
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
        return "WorInfo{" +
                "work_id=" + work_id +
                ", work_title='" + work_title + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
