package com.xinzhiyun.universitysciencesys.service.impl.science;

import com.xinzhiyun.universitysciencesys.dao.science.SciAchieveDao;
import com.xinzhiyun.universitysciencesys.pojo.science.SciAchieve;
import com.xinzhiyun.universitysciencesys.service.science.SciAchieveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 研究成果业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class SciAchieveServiceImpl implements SciAchieveService {
    @Autowired
    private SciAchieveDao sciAchieveDao;

    @Override
    public List<SciAchieve> findSciAchieveAll(Map<String, Object> map) {
        return sciAchieveDao.findSciAchieveAll(map);
    }

    @Override
    public int findSciAchieveNum() {
        return sciAchieveDao.findSciAchieveNum();
    }

    @Override
    public SciAchieve findSciAchieveById(Integer science_id) {
        return sciAchieveDao.findSciAchieveById(science_id);
    }

    @Override
    public Integer updateSciAchieveById(SciAchieve sciAchieve) {
        return sciAchieveDao.updateSciAchieveById(sciAchieve);
    }

    @Override
    public Integer addSciAchieve(SciAchieve sciAchieve) {
        return sciAchieveDao.addSciAchieve(sciAchieve);
    }

    @Override
    public Integer deleteSciAchieveById(Integer science_id) {
        return sciAchieveDao.deleteSciAchieveById(science_id);
    }
}
