package com.xinzhiyun.universitysciencesys.service.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduManage;

import java.util.List;
import java.util.Map;

/**
 * 管理制度业务接口
 */
public interface EduManageService {

    /**使用分页查找所有管理制度*/
    List<EduManage> findEduManageAll(Map<String, Object> map);

    /**查找所有管理制度总数*/
    int findEduManageNum();

    /**根据管理制度编号查找查找管理制度*/
    EduManage findEduManageById(Integer educate_id);

    /**根据管理制度编号修改管理制度*/
    Integer updateEduManageById(EduManage eduManage);

    /**增加管理制度*/
    Integer addEduManage(EduManage eduManage);

    /**根据编号删除管理制度*/
    Integer deleteEduManageById(Integer educate_id);
}
