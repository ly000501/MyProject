package com.xinzhiyun.universitysciencesys.service.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciAchieve;

import java.util.List;
import java.util.Map;

/**
 * 研究成果业务接口
 */
public interface SciAchieveService {

    /**使用分页查找所有科研信息*/
    List<SciAchieve> findSciAchieveAll(Map<String, Object> map);

    /**查找所有科研信息总数*/
    int findSciAchieveNum();

    /**根据科研信息编号查找查找科研信息*/
    SciAchieve findSciAchieveById(Integer science_id);

    /**根据科研信息编号修改科研信息*/
    Integer updateSciAchieveById(SciAchieve sciAchieve);

    /**增加科研信息*/
    Integer addSciAchieve(SciAchieve SciAchieve);

    /**根据编号删除科研信息*/
    Integer deleteSciAchieveById(Integer Scicate_id);
}
