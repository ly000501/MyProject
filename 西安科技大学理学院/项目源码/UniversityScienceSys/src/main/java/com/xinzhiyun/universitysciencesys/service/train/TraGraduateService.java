package com.xinzhiyun.universitysciencesys.service.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 研究生培养业务接口
 */
public interface TraGraduateService {

    /**使用分页查找所有研究生培养*/
    List<TraBriefPlan> findTraGraduateAll(Map<String, Object> map);

    /**查找所有研究生培养总数*/
    int findTraGraduateNum();

    /**根据研究生培养编号查找研究生培养*/
    TraBriefPlan findTraGraduateById(Integer train_id);

    /**根据研究生培养编号修改研究生培养*/
    Integer updateTraGraduateById(TraBriefPlan traBriefPlan);

    /**增加研究生培养*/
    Integer addTraGraduate(TraBriefPlan traBriefPlan);

    /**根据编号删除研究生培养*/
    Integer deleteTraGraduateById(Integer train_id);

    /**根据类型查找*/
    List<TraBriefPlan> findTraGraduateByType(String type);
}
