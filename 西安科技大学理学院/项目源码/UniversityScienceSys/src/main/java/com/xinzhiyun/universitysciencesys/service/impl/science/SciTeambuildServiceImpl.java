package com.xinzhiyun.universitysciencesys.service.impl.science;

import com.xinzhiyun.universitysciencesys.dao.science.SciTeambuildDao;
import com.xinzhiyun.universitysciencesys.pojo.science.SciTeambuild;
import com.xinzhiyun.universitysciencesys.service.science.SciTeambuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 团队建设业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class SciTeambuildServiceImpl implements SciTeambuildService {
    @Autowired
    private SciTeambuildDao sciTeambuildDao;

    @Override
    public List<SciTeambuild> findSciTeambuildAll(Map<String, Object> map) {
        return sciTeambuildDao.findSciTeambuildAll(map);
    }

    @Override
    public int findSciTeambuildNum() {
        return sciTeambuildDao.findSciTeambuildNum();
    }

    @Override
    public SciTeambuild findSciTeambuildById(Integer science_id) {
        return sciTeambuildDao.findSciTeambuildById(science_id);
    }

    @Override
    public Integer updateSciTeambuildById(SciTeambuild sciTeambuild) {
        return sciTeambuildDao.updateSciTeambuildById(sciTeambuild);
    }

    @Override
    public Integer addSciTeambuild(SciTeambuild sciTeambuild) {
        return sciTeambuildDao.addSciTeambuild(sciTeambuild);
    }

    @Override
    public Integer deleteSciTeambuildById(Integer science_id) {
        return sciTeambuildDao.deleteSciTeambuildById(science_id);
    }
}
