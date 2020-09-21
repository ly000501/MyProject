package com.xinzhiyun.universitysciencesys.service.impl.train;

import com.xinzhiyun.universitysciencesys.dao.train.TraRegularDao;
import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import com.xinzhiyun.universitysciencesys.service.train.TraRegularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 本科生培养业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 10:34
 **/
@Service
public class TraRegularServiceImpl implements TraRegularService {
    @Autowired
    private TraRegularDao traRegularDao;

    @Override
    public List<TraBriefPlan> findTraRegularAll(Map<String, Object> map) {
        return traRegularDao.findTraRegularAll(map);
    }

    @Override
    public int findTraRegularNum() {
        return traRegularDao.findTraRegularNum();
    }

    @Override
    public TraBriefPlan findTraRegularById(Integer train_id) {
        return traRegularDao.findTraRegularById(train_id);
    }

    @Override
    public Integer updateTraRegularById(TraBriefPlan traBriefPlan) {
        return traRegularDao.updateTraRegularById(traBriefPlan);
    }

    @Override
    public Integer addTraRegular(TraBriefPlan traBriefPlan) {
        return traRegularDao.addTraRegular(traBriefPlan);
    }

    @Override
    public Integer deleteTraRegularById(Integer train_id) {
        return traRegularDao.deleteTraRegularById(train_id);
    }

    @Override
    public List<TraBriefPlan> findTraRegularByType(String type) {
        return traRegularDao.findTraRegularByType(type);
    }
}
