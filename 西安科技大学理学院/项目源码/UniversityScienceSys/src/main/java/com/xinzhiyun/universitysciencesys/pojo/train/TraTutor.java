package com.xinzhiyun.universitysciencesys.pojo.train;

/**
 * @program: UniversityScienceSys
 * @description: 导师pojo类
 * @Param:
 * train_id：编号
 * train_name：姓名
 * hiredate：任职日期
 * job：职位
 * photo:照片
 * brief：简介
 * subject：科目
 * remark：备注
 * @author: Mr.Li
 * @create: 2020-08-26 17:55
 **/
public class TraTutor {
    private Integer train_id;
    private String train_name;
    private String hiredate;
    private String job;
    private String photo;
    private String brief;
    private String subject;
    private String remark;

    public Integer getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Integer train_id) {
        this.train_id = train_id;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
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

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TraTutor{" +
                "train_id=" + train_id +
                ", train_name='" + train_name + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", job='" + job + '\'' +
                ", photo='" + photo + '\'' +
                ", brief='" + brief + '\'' +
                ", subject='" + subject + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
