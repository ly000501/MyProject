package com.xinzhiyun.universitysciencesys.service.science;

import com.xinzhiyun.universitysciencesys.pojo.science.SciTeambuild;

import java.util.List;
import java.util.Map;

/**
 * 团队建设业务接口
 */
public interface SciTeambuildService {

    /**使用分页查找所有团队建设*/
    List<SciTeambuild> findSciTeambuildAll(Map<String, Object> map);

    /**查找所有团队建设总数*/
    int findSciTeambuildNum();

    /**根据团队建设编号查找查找团队建设*/
    SciTeambuild findSciTeambuildById(Integer science_id);

    /**根据团队建设编号修改团队建设*/
    Integer updateSciTeambuildById(SciTeambuild sciTeambuild);

    /**增加团队建设*/
    Integer addSciTeambuild(SciTeambuild SciTeambuild);

    /**根据编号删除团队建设*/
    Integer deleteSciTeambuildById(Integer Scicate_id);
}
