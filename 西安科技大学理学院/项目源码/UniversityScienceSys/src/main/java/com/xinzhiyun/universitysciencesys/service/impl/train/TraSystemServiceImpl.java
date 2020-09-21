package com.xinzhiyun.universitysciencesys.service.impl.train;

import com.xinzhiyun.universitysciencesys.dao.train.TraSystemDao;
import com.xinzhiyun.universitysciencesys.pojo.train.TraSystem;
import com.xinzhiyun.universitysciencesys.service.train.TraSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 培养制度业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 10:34
 **/
@Service
public class TraSystemServiceImpl implements TraSystemService {
    @Autowired
    private TraSystemDao traSystemDao;

    @Override
    public List<TraSystem> findTraSystemAll(Map<String, Object> map) {
        return traSystemDao.findTraSystemAll(map);
    }

    @Override
    public int findTraSystemNum(String type) {
        return traSystemDao.findTraSystemNum(type);
    }

    @Override
    public TraSystem findTraSystemById(Integer traSystem) {
        return traSystemDao.findTraSystemById(traSystem);
    }

    @Override
    public Integer updateTraSystemById(TraSystem traSystem) {
        return traSystemDao.updateTraSystemById(traSystem);
    }

    @Override
    public Integer addTraSystem(TraSystem traSystem) {
        return traSystemDao.addTraSystem(traSystem);
    }

    @Override
    public Integer deleteTraSystemById(Integer train_id) {
        return traSystemDao.deleteTraSystemById(train_id);
    }
}
