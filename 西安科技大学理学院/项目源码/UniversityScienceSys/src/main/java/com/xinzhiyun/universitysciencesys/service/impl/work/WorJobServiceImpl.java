package com.xinzhiyun.universitysciencesys.service.impl.work;

import com.xinzhiyun.universitysciencesys.dao.work.WorJobDao;
import com.xinzhiyun.universitysciencesys.pojo.work.WorJob;
import com.xinzhiyun.universitysciencesys.service.work.WorJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 就业信息业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-25 11:59
 **/
@Service
public class WorJobServiceImpl implements WorJobService {
    @Autowired
    private WorJobDao worJobDao;

    @Override
    public List<WorJob> findWorJobAll(Map<String, Object> map) {
        return worJobDao.findWorJobAll(map);
    }

    @Override
    public int findWorJobNum() {
        return worJobDao.findWorJobNum();
    }

    @Override
    public WorJob findWorJobById(Integer work_id) {
        return worJobDao.findWorJobById(work_id);
    }

    @Override
    public Integer updateWorJobById(WorJob WorJob) {
        return worJobDao.updateWorJobById(WorJob);
    }

    @Override
    public Integer addWorJob(WorJob WorJob) {
        return worJobDao.addWorJob(WorJob);
    }

    @Override
    public Integer deleteWorJobById(Integer work_id) {
        return worJobDao.deleteWorJobById(work_id);
    }
}
