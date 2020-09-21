package com.xinzhiyun.universitysciencesys.service.work;

import com.xinzhiyun.universitysciencesys.pojo.work.WorInfo;

import java.util.List;
import java.util.Map;

/**
 * 招生信息业务接口
 */
public interface WorInfoService {

    /**使用分页查找所有招生信息*/
    List<WorInfo> findWorInfoAll(Map<String, Object> map);

    /**查找所有招生信息总数*/
    int findWorInfoNum();

    /**根据招生信息编号查找查找招生信息*/
    WorInfo findWorInfoById(Integer work_id);

    /**根据招生信息编号修改招生信息*/
    Integer updateWorInfoById(WorInfo worInfo);

    /**增加招生信息*/
    Integer addWorInfo(WorInfo worInfo);

    /**根据编号删除招生信息*/
    Integer deleteWorInfoById(Integer work_id);
}
