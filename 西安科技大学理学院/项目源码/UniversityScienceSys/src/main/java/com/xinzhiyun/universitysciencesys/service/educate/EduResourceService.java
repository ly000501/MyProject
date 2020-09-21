package com.xinzhiyun.universitysciencesys.service.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduResource;

import java.util.List;
import java.util.Map;

/**
 * 在线资源业务接口
 */
public interface EduResourceService {

    /**使用分页查找所有在线资源*/
    List<EduResource> findEduResourceAll(Map<String, Object> map);

    /**查找所有在线资源总数*/
    int findEduResourceNum();

    /**根据在线资源编号查找查找在线资源*/
    EduResource findEduResourceById(Integer educate_id);

    /**根据在线资源编号修改在线资源*/
    Integer updateEduResourceById(EduResource eduResource);

    /**增加在线资源*/
    Integer addEduResource(EduResource eduResource);

    /**根据编号删除在线资源*/
    Integer deleteEduResourceById(Integer educate_id);
}
