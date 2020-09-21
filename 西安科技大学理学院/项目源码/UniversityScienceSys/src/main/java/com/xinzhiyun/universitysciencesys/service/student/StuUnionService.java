package com.xinzhiyun.universitysciencesys.service.student;

import com.xinzhiyun.universitysciencesys.pojo.student.StuUnion;

import java.util.List;
import java.util.Map;

/**
 * 团委、学生会接口
 */
public interface StuUnionService {

    /**使用分页查找所有团委、学生会*/
    List<StuUnion> findStuUnionAll(Map<String, Object> map);

    /**查找所有团委、学生会总数*/
    int findStuUnionNum();

    /**根据团委、学生会编号查找查找团委、学生会*/
    StuUnion findStuUnionById(Integer union_id);

    /**根据团委、学生会类型查找查找团委、学生会*/
    List<StuUnion> findStuUnionByType(Map<String, Object> map);

    int findStuUnionNumByType(String type);

    /**根据团委、学生会编号修改团委、学生会*/
    Integer updateStuUnionById(StuUnion stuUnion);

    /**增加团委、学生会*/
    Integer addStuUnion(StuUnion stuUnion);

    /**根据编号删除团委、学生会*/
    Integer deleteStuUnionById(Integer union_id);
}
