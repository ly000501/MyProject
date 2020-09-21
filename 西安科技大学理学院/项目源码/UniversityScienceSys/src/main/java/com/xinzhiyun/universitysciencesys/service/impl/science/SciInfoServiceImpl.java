package com.xinzhiyun.universitysciencesys.service.impl.science;

import com.xinzhiyun.universitysciencesys.dao.science.SciInfoDao;
import com.xinzhiyun.universitysciencesys.pojo.science.SciInfo;
import com.xinzhiyun.universitysciencesys.service.science.SciInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 科研信息业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class SciInfoServiceImpl implements SciInfoService {
    @Autowired
    private SciInfoDao SciInfoDao;

    @Override
    public List<SciInfo> findSciInfoAll(Map<String, Object> map) {
        return SciInfoDao.findSciInfoAll(map);
    }

    @Override
    public int findSciInfoNum() {
        return SciInfoDao.findSciInfoNum();
    }

    @Override
    public SciInfo findSciInfoById(Integer science_id) {
        return SciInfoDao.findSciInfoById(science_id);
    }

    @Override
    public Integer updateSciInfoById(SciInfo SciInfo) {
        return SciInfoDao.updateSciInfoById(SciInfo);
    }

    @Override
    public Integer addSciInfo(SciInfo SciInfo) {
        return SciInfoDao.addSciInfo(SciInfo);
    }

    @Override
    public Integer deleteSciInfoById(Integer science_id) {
        return SciInfoDao.deleteSciInfoById(science_id);
    }
}
