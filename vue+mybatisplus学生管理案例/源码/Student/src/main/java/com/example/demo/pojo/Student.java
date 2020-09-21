package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: Student
 * @description: 学生实体类
 * @Param:
 * id:编号
 * name：姓名
 * sex：性别
 * room：教室
 * age：年龄
 * address：家庭住址
 * password：密码
 * @author: Mr.Li
 * @create: 2020-09-08 09:31
 **/
@Data
@TableName("student")
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private String room;
    private int age;
    private String address;
    private String password;

}
