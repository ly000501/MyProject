package com.xinzhiyun.universitysciencesys.service.work;

import com.xinzhiyun.universitysciencesys.pojo.work.WorJob;

import java.util.List;
import java.util.Map;

/**
 * 就业信息业务接口
 */
public interface WorJobService {

    /**使用分页查找所有就业信息*/
    List<WorJob> findWorJobAll(Map<String, Object> map);

    /**查找所有就业信息总数*/
    int findWorJobNum();

    /**根据就业信息编号查找查找就业信息*/
    WorJob findWorJobById(Integer work_id);

    /**根据就业信息编号修改就业信息*/
    Integer updateWorJobById(WorJob worJob);

    /**增加就业信息*/
    Integer addWorJob(WorJob worJob);

    /**根据编号删除就业信息*/
    Integer deleteWorJobById(Integer work_id);
}
