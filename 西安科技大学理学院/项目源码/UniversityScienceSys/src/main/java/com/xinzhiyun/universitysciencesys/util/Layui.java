package com.xinzhiyun.universitysciencesys.util;

import java.util.HashMap;
import java.util.List;

/**
 * @program: UniversityScienceSys
 * @description: Layui工具类
 * @author: Mr.Wang
 * @create: 2020-08-15 09:39
 **/
public class Layui extends HashMap<String, Object> {
    public static Layui data(Integer count, List<?> data){
        Layui r = new Layui();
        r.put("code", 0);
        r.put("msg", "");
        r.put("count", count);
        r.put("data", data);
        return r;
    }
}
