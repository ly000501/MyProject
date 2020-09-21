package com.xinzhiyun.universitysciencesys.service.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 本科生培养业务接口
 */
public interface TraRegularService {

    /**使用分页查找所有本科生培养*/
    List<TraBriefPlan> findTraRegularAll(Map<String, Object> map);

    /**查找所有本科生培养总数*/
    int findTraRegularNum();

    /**根据本科生培养编号查找本科生培养*/
    TraBriefPlan findTraRegularById(Integer train_id);

    /**根据本科生培养编号修改本科生培养*/
    Integer updateTraRegularById(TraBriefPlan traBriefPlan);

    /**增加本科生培养*/
    Integer addTraRegular(TraBriefPlan traBriefPlan);

    /**根据编号删除本科生培养*/
    Integer deleteTraRegularById(Integer train_id);

    List<TraBriefPlan> findTraRegularByType(String type);
}
