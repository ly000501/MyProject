package com.example.demo;

import com.example.demo.dao.StudentDao;
import com.example.demo.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class StudentApplicationTests {
    @Autowired
    private StudentDao studentDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        Map<String,Object> map = new HashMap<>();
        map.put("name","东方月初");
        List<Student> list = studentDao.selectByMap(map);
        System.out.println(list);
    }

}
