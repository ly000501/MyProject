package com.xinzhiyun.universitysciencesys.pojo.train;

/**
 * @program: UniversityScienceSys
 * @description: 培养制度
 * @Param:
 * train_id：编号
 * train：标题
 * date：日期
 * content内容
 * @author: Mr.Li
 * @create: 2020-08-25 16:16
 **/
public class TraSystem {
    private Integer train_id;
    private String train_title;
    private String date;
    private String content;
    private String type;

    public Integer getTrain_id() {
        return train_id;
    }

    public void setTrain_id(Integer train_id) {
        this.train_id = train_id;
    }

    public String getTrain_title() {
        return train_title;
    }

    public void setTrain_title(String train_title) {
        this.train_title = train_title;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TraSystem{" +
                "train_id=" + train_id +
                ", train_title='" + train_title + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
