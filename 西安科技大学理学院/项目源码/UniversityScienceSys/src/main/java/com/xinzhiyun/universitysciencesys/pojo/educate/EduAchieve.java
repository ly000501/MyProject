package com.xinzhiyun.universitysciencesys.pojo.educate;

/**
 * @program: UniversityScienceSys
 * @description: 教学成果pojo类
 * @Param:
 * educate_id：成果编号
 * educate_title：成果标题
 * date：日期
 * achieve_id：成果序号
 * achieve_name:成果名称
 * grade:等级
 * person:主要完成人姓名
 * unit：主要完成单位
 * @author: Mr.Li
 * @create: 2020-08-24 14:18
 **/
public class EduAchieve {
    private Integer educate_id;
    private String educate_title;
    private String date;
    private Integer achieve_id;
    private String achieve_name;
    private String grade;
    private String person;
    private String unit;

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

    public Integer getAchieve_id() {
        return achieve_id;
    }

    public void setAchieve_id(Integer achieve_id) {
        this.achieve_id = achieve_id;
    }

    public String getAchieve_name() {
        return achieve_name;
    }

    public void setAchieve_name(String achieve_name) {
        this.achieve_name = achieve_name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "EduAchieve{" +
                "educate_id=" + educate_id +
                ", educate_title='" + educate_title + '\'' +
                ", date='" + date + '\'' +
                ", achieve_id=" + achieve_id +
                ", achieve_name='" + achieve_name + '\'' +
                ", grade='" + grade + '\'' +
                ", person='" + person + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
