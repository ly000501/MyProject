package com.xinzhiyun.universitysciencesys.service.lab;

import com.xinzhiyun.universitysciencesys.pojo.lab.Lab;

import java.util.List;
import java.util.Map;

/**
 * 实验室建设接口
 */
public interface LabService {

    /**使用分页查找所有实验室建设*/
    List<Lab> findLabAll(Map<String, Object> map);

    /**查找所有实验室建设总数*/
    int findLabNum();

    /**根据实验室建设编号查找查找实验室建设*/
    Lab findLabById(Integer lab_id);

    /**根据实验室建设标题查找查找实验室建设*/
    Lab findLabByTitle(String lab_title);

    /**根据实验室建设编号修改实验室建设*/
    Integer updateLabById(Lab lab);

    /**增加实验室建设*/
    Integer addLab(Lab lab);

    /**根据编号删除实验室建设*/
    Integer deleteLabById(Integer lab_id);

    /**根据类型或实验室名称查找*/
    List<Lab> findLabByType(Map<String, Object> map);
}
