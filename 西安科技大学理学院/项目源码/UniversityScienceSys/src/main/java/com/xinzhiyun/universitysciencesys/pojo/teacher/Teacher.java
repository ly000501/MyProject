package com.xinzhiyun.universitysciencesys.pojo.teacher;

import java.io.Serializable;

/**
 * @program: UniversityScienceSys
 * @description: 师资队伍实体类
 * @Param: teacher_id:教师编号
 * teacher_name:教师姓名
 * teacher_brief：教师简介
 * hiredate:任职时间
 * job:职位
 * photo:照片
 * background:教育背景
 * experience:工作经历
 * research:研究方向
 * teachcourse：所授课程
 * social：社会职务
 * paper：论文
 * textbook:著作及教材
 * task:课题
 * award：获奖
 * @create: 2020-08-19 09:33
 **/
public class Teacher implements Serializable {
    private Integer teacher_id;
    private String teacher_name;
    private String teacher_brief;
    private String hiredate;
    private String job;
    private String photo;
    private String background;
    private String experience;
    private String research;
    private String teachcourse;
    private String social;
    private String paper;
    private String textbook;
    private String task;
    private String award;

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_brief() {
        return teacher_brief;
    }

    public void setTeacher_brief(String teacher_brief) {
        this.teacher_brief = teacher_brief;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public String getTeachcourse() {
        return teachcourse;
    }

    public void setTeachcourse(String teachcourse) {
        this.teachcourse = teachcourse;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", teacher_name='" + teacher_name + '\'' +
                ", teacher_brief='" + teacher_brief + '\'' +
                ", hiredate='" +

                + '\'' +
                ", job='" + job + '\'' +
                ", photo='" + photo + '\'' +
                ", background='" + background + '\'' +
                ", experience='" + experience + '\'' +
                ", research='" + research + '\'' +
                ", teachcourse='" + teachcourse + '\'' +
                ", social='" + social + '\'' +
                ", paper='" + paper + '\'' +
                ", textbook='" + textbook + '\'' +
                ", task='" + task + '\'' +
                ", award='" + award + '\'' +
                '}';
    }
}
