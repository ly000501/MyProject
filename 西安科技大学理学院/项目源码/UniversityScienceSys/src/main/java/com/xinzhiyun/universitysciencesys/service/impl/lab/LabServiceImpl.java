package com.xinzhiyun.universitysciencesys.service.impl.lab;

import com.xinzhiyun.universitysciencesys.dao.lab.LabDao;
import com.xinzhiyun.universitysciencesys.pojo.lab.Lab;
import com.xinzhiyun.universitysciencesys.service.lab.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 实验室建设业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 11:59
 **/
@Service
public class LabServiceImpl implements LabService {
    @Autowired
    private LabDao labDao;

    @Override
    public List<Lab> findLabAll(Map<String, Object> map) {
        return labDao.findLabAll(map);
    }

    @Override
    public int findLabNum() {
        return labDao.findLabNum();
    }

    @Override
    public Lab findLabById(Integer lab_id) {
        return labDao.findLabById(lab_id);
    }

    @Override
    public Lab findLabByTitle(String lab_title) {
        return labDao.findLabByTitle(lab_title);
    }

    @Override
    public Integer updateLabById(Lab lab) {
        return labDao.updateLabById(lab);
    }

    @Override
    public Integer addLab(Lab lab) {
        return labDao.addLab(lab);
    }

    @Override
    public Integer deleteLabById(Integer lab_id) {
        return labDao.deleteLabById(lab_id);
    }

    @Override
    public List<Lab> findLabByType(Map<String, Object> map) {
        return labDao.findLabByType(map);
    }
}
