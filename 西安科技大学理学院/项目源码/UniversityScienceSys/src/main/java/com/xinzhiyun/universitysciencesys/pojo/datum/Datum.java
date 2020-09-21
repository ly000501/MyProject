package com.xinzhiyun.universitysciencesys.pojo.datum;

/**
 * @program: UniversityScienceSys
 * @description: 资料下载pojo类
 * @Param:
 * datum_id：编号
 * datum_title：标题
 * date：日期
 * file_name:文件名
 * file：文件
 * number：下载量
 * type：类别
 * @author: Mr.Li
 * @create: 2020-08-27 17:51
 **/
public class Datum {
    private Integer datum_id;
    private String datum_title;
    private String date;
    private String file_name;
    private String file;
    private Long number;
    private String type;

    public Integer getDatum_id() {
        return datum_id;
    }

    public void setDatum_id(Integer datum_id) {
        this.datum_id = datum_id;
    }

    public String getDatum_title() {
        return datum_title;
    }

    public void setDatum_title(String datum_title) {
        this.datum_title = datum_title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "datum_id=" + datum_id +
                ", datum_title='" + datum_title + '\'' +
                ", date='" + date + '\'' +
                ", file_name='" + file_name + '\'' +
                ", file='" + file + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
