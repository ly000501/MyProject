package com.xinzhiyun.universitysciencesys.pojo.party;

/**
 * @program: UniversityScienceSys
 * @description: 党建工作
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 14:53
 **/
public class Party {
    private Integer party_id;
    private String party_title;
    private String date;
    private String person;
    private String content;
    private String picture;
    private String type;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Party{" +
                "party_id=" + party_id +
                ", party_title='" + party_title + '\'' +
                ", date='" + date + '\'' +
                ", person='" + person + '\'' +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
