package com.xinzhiyun.universitysciencesys.service.impl.train;

import com.xinzhiyun.universitysciencesys.dao.train.TraGraduateDao;
import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import com.xinzhiyun.universitysciencesys.service.train.TraGraduateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description:研究生培养业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 10:34
 **/
@Service
public class TraGraduateServiceImpl implements TraGraduateService {
    @Autowired
    private TraGraduateDao traGraduateDao;

    @Override
    public List<TraBriefPlan> findTraGraduateAll(Map<String, Object> map) {
        return traGraduateDao.findTraGraduateAll(map);
    }

    @Override
    public int findTraGraduateNum() {
        return traGraduateDao.findTraGraduateNum();
    }

    @Override
    public TraBriefPlan findTraGraduateById(Integer train_id) {
        return traGraduateDao.findTraGraduateById(train_id);
    }

    @Override
    public Integer updateTraGraduateById(TraBriefPlan traBriefPlan) {
        return traGraduateDao.updateTraGraduateById(traBriefPlan);
    }

    @Override
    public Integer addTraGraduate(TraBriefPlan traBriefPlan) {
        return traGraduateDao.addTraGraduate(traBriefPlan);
    }

    @Override
    public Integer deleteTraGraduateById(Integer train_id) {
        return traGraduateDao.deleteTraGraduateById(train_id);
    }

    @Override
    public List<TraBriefPlan> findTraGraduateByType(String type) {
        return traGraduateDao.findTraGraduateByType(type);
    }
}
