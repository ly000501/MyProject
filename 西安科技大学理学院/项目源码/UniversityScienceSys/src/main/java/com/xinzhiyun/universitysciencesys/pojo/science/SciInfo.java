package com.xinzhiyun.universitysciencesys.pojo.science;

/**
 * @program: UniversityScienceSys
 * @description: 科研信息Pojo类
 * @Param:
 * educate_id：编号
 * educate_title：标题
 * person：人名
 * date：时间
 * content：内容
 * @author: Mr.Li
 * @create: 2020-08-21 11:19
 **/
public class SciInfo {

    private Integer science_id;
    private String science_title;
    private String person;
    private String date;
    private String content;

    public Integer getScience_id() {
        return science_id;
    }

    public void setScience_id(Integer science_id) {
        this.science_id = science_id;
    }

    public String getScience_title() {
        return science_title;
    }

    public void setScience_title(String science_title) {
        this.science_title = science_title;
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
        return "SciInfo{" +
                "science_id=" + science_id +
                ", science_title='" + science_title + '\'' +
                ", person='" + person + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
