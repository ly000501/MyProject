package com.xinzhiyun.universitysciencesys.service.impl.work;

import com.xinzhiyun.universitysciencesys.dao.work.WorInfoDao;
import com.xinzhiyun.universitysciencesys.pojo.work.WorInfo;
import com.xinzhiyun.universitysciencesys.service.work.WorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 招生信息业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-25 11:59
 **/
@Service
public class WorInfoServiceImpl implements WorInfoService {
    @Autowired
    private WorInfoDao worInfoDao;

    @Override
    public List<WorInfo> findWorInfoAll(Map<String, Object> map) {
        return worInfoDao.findWorInfoAll(map);
    }

    @Override
    public int findWorInfoNum() {
        return worInfoDao.findWorInfoNum();
    }

    @Override
    public WorInfo findWorInfoById(Integer work_id) {
        return worInfoDao.findWorInfoById(work_id);
    }

    @Override
    public Integer updateWorInfoById(WorInfo worInfo) {
        return worInfoDao.updateWorInfoById(worInfo);
    }

    @Override
    public Integer addWorInfo(WorInfo worInfo) {
        return worInfoDao.addWorInfo(worInfo);
    }

    @Override
    public Integer deleteWorInfoById(Integer work_id) {
        return worInfoDao.deleteWorInfoById(work_id);
    }
}
