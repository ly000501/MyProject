package com.xinzhiyun.universitysciencesys.service.impl.educate;

import com.xinzhiyun.universitysciencesys.dao.educate.EduManageDao;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduManage;
import com.xinzhiyun.universitysciencesys.service.educate.EduManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 管理制度业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class EduManageServiceImpl implements EduManageService {
    @Autowired
    private EduManageDao eduManageDao;

    @Override
    public List<EduManage> findEduManageAll(Map<String, Object> map) {
        return eduManageDao.findEduManageAll(map);
    }

    @Override
    public int findEduManageNum() {
        return eduManageDao.findEduManageNum();
    }

    @Override
    public EduManage findEduManageById(Integer educate_id) {
        return eduManageDao.findEduManageById(educate_id);
    }

    @Override
    public Integer updateEduManageById(EduManage eduManage) {
        return eduManageDao.updateEduManageById(eduManage);
    }

    @Override
    public Integer addEduManage(EduManage eduManage) {
        return eduManageDao.addEduManage(eduManage);
    }

    @Override
    public Integer deleteEduManageById(Integer educate_id) {
        return eduManageDao.deleteEduManageById(educate_id);
    }
}
