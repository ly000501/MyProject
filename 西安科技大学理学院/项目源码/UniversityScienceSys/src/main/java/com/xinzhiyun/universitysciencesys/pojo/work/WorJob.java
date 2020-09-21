package com.xinzhiyun.universitysciencesys.pojo.work;

/**
 * @program: UniversityScienceSys
 * @description: 就业信息
 * @Param:
 * work_id：编号
 * work_title：标题
 * person:姓名
 * date：日期
 * content内容
 * @author: Mr.Li
 * @create: 2020-08-25 16:16
 **/
public class WorJob {
    private Integer work_id;
    private String work_title;
    private String person;
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
        return "WorJob{" +
                "work_id=" + work_id +
                ", work_title='" + work_title + '\'' +
                ", person='" + person + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
