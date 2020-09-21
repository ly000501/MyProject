package com.xinzhiyun.universitysciencesys.service.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraSystem;

import java.util.List;
import java.util.Map;

/**
 * 培养制度业务接口
 */
public interface TraSystemService {

    /**使用分页查找所有培养制度*/
    List<TraSystem> findTraSystemAll(Map<String, Object> map);

    /**查找所有培养制度总数*/
    int findTraSystemNum(String type);

    /**根据培养制度编号查找培养制度*/
    TraSystem findTraSystemById(Integer train_id);

    /**根据培养制度编号修改培养制度*/
    Integer updateTraSystemById(TraSystem traSystem);

    /**增加培养制度*/
    Integer addTraSystem(TraSystem traSystem);

    /**根据编号删除培养制度*/
    Integer deleteTraSystemById(Integer train_id);
}
