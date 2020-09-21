package com.xinzhiyun.universitysciencesys.service.impl.educate;

import com.xinzhiyun.universitysciencesys.dao.educate.EduResourceDao;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduResource;
import com.xinzhiyun.universitysciencesys.service.educate.EduResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 在线资源业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class EduResourceServiceImpl implements EduResourceService {
    @Autowired
    private EduResourceDao eduResourceDao;

    @Override
    public List<EduResource> findEduResourceAll(Map<String, Object> map) {
        return eduResourceDao.findEduResourceAll(map);
    }

    @Override
    public int findEduResourceNum() {
        return eduResourceDao.findEduResourceNum();
    }

    @Override
    public EduResource findEduResourceById(Integer educate_id) {
        return eduResourceDao.findEduResourceById(educate_id);
    }

    @Override
    public Integer updateEduResourceById(EduResource eduResource) {
        return eduResourceDao.updateEduResourceById(eduResource);
    }

    @Override
    public Integer addEduResource(EduResource eduResource) {
        return eduResourceDao.addEduResource(eduResource);
    }

    @Override
    public Integer deleteEduResourceById(Integer educate_id) {
        return eduResourceDao.deleteEduResourceById(educate_id);
    }
}
