package com.xinzhiyun.universitysciencesys.service.impl.train;

import com.xinzhiyun.universitysciencesys.dao.train.TraTutorDao;
import com.xinzhiyun.universitysciencesys.pojo.train.TraTutor;
import com.xinzhiyun.universitysciencesys.service.train.TraTutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 导师业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class TraTutorServiceImpl implements TraTutorService {
    @Autowired
    private TraTutorDao traTutorDao;

    @Override
    public List<TraTutor> findTraTutorAll(Map<String, Object> map) {
        return traTutorDao.findTraTutorAll(map);
    }

    @Override
    public List<TraTutor> findTraGraTutorAll(Map<String, Object> map) {
        return traTutorDao.findTraGraTutorAll(map);
    }

    @Override
    public int findTraTutorNum(Map<String,Object> map) {
        return traTutorDao.findTraTutorNum(map);
    }

    @Override
    public TraTutor findTraTutorById(Integer train_id) {
        return traTutorDao.findTraTutorById(train_id);
    }

    @Override
    public Integer updateTraTutorById(TraTutor traTutor) {
        return traTutorDao.updateTraTutorById(traTutor);
    }

    @Override
    public Integer addTraTutor(TraTutor traTutor) {
        return traTutorDao.addTraTutor(traTutor);
    }

    @Override
    public Integer deleteTraTutorById(Integer train_id) {
        return traTutorDao.deleteTraTutorById(train_id);
    }
}
