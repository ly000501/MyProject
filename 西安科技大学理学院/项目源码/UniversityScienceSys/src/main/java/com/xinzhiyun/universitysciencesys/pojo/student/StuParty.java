package com.xinzhiyun.universitysciencesys.pojo.student;

/**
 * @program: UniversityScienceSys
 * @description: 学生党建pojo类
 * @Param:
 * mysql:student_party，pojo：StuParty
 * party_id编号
 * party_title:文件标题
 * party_name:文件名
 * file:文件路径
 * @author: Mr.Li
 * @create: 2020-09-04 09:15
 **/
public class StuParty {
    private Integer party_id;
    private String party_title;
    private String party_name;
    private String file;

    public Integer getParty_id() {
        return party_id;
    }

    public void setParty_id(Integer party_id) {
        this.party_id = party_id;
    }

    public String getParty_title() {
        return party_title;
    }

    public void setParty_title(String party_title) {
        this.party_title = party_title;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "StuParty{" +
                "party_id=" + party_id +
                ", party_title='" + party_title + '\'' +
                ", party_name='" + party_name + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
