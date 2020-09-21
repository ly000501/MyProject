package com.xinzhiyun.universitysciencesys.pojo.outstand;

/**
 * @program: UniversityScienceSys
 * @description: 杰出校友pojo类
 * @Param:
 * outstand_id:编号
 * outstand_name:姓名
 * hiredate：任职时间
 * job：工作
 * photo：照片
 * brief：简介
 * @author: Mr.Li
 * @create: 2020-08-25 16:00
 **/
public class OutAlumna {
    private Integer outstand_id;
    private String outstand_name;
    private String hiredate;
    private String job;
    private String photo;
    private String brief;

    public Integer getOutstand_id() {
        return outstand_id;
    }

    public void setOutstand_id(Integer outstand_id) {
        this.outstand_id = outstand_id;
    }

    public String getOutstand_name() {
        return outstand_name;
    }

    public void setOutstand_name(String outstand_name) {
        this.outstand_name = outstand_name;
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

    @Override
    public String toString() {
        return "OutAlumna{" +
                "outstand_id=" + outstand_id +
                ", outstand_name='" + outstand_name + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", job='" + job + '\'' +
                ", photo='" + photo + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
