package com.xinzhiyun.universitysciencesys.service.college;

import com.xinzhiyun.universitysciencesys.pojo.college.College;

import java.util.List;

/**
 * 学院概况业务层接口
 */
public interface CollegeService {
    /**查找所有*/
    List <College> findCollegeAll();

    /**根据类型查找*/
    College findCollegeByType(String type);

    /**根据编号查找学院概况*/
    College findCollegeById(Integer college_id);

    /**修改学院概况*/
    void updateCollege(College college);

    /**删除学院概况*/
    void deleteCollege(Integer college_id);

    /**添加学院概况*/
    void addCollege(College college);
}
