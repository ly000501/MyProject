package com.xinzhiyun.universitysciencesys.service.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;

import java.util.List;
import java.util.Map;

/**
 * 研究成果业务接口
 */
public interface SciInfoService {

    /**使用分页查找所有研究成果*/
    List<SciInfo> findSciInfoAll(Map<String, Object> map);

    /**查找所有研究成果总数*/
    int findSciInfoNum();

    /**根据研究成果编号查找查找研究成果*/
    SciInfo findSciInfoById(Integer science_id);

    /**根据研究成果编号修改研究成果*/
    Integer updateSciInfoById(SciInfo sciInfo);

    /**增加研究成果*/
    Integer addSciInfo(SciInfo SciInfo);

    /**根据编号删除研究成果*/
    Integer deleteSciInfoById(Integer Scicate_id);
}
