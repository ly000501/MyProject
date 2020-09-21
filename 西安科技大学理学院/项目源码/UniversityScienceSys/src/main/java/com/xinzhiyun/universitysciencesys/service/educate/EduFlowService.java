package com.xinzhiyun.universitysciencesys.service.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduFlow;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;

import java.util.List;
import java.util.Map;

/**
 * 教务办公流程接口
 */
public interface EduFlowService {

    /**使用分页查找所有教务办公流程*/
    List<EduFlow> findEduFlowAll(Map<String, Object> map);

    /**查找所有教务办公流程总数*/
    int findEduFlowNum();

    /**根据教务办公流程编号查找查找教务办公流程*/
    EduFlow findEduFlowById(Integer educate_id);

    /**根据教务办公流程编号修改教务办公流程*/
    Integer updateEduFlowById(EduFlow eduFlow);

    /**增加教务办公流程*/
    Integer addEduFlow(EduFlow eduFlow);

    /**根据编号删除教务办公流程*/
    Integer deleteEduFlowById(Integer educate_id);
}
