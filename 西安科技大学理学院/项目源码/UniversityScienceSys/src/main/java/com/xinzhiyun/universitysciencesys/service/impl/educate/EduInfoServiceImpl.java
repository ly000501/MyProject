package com.xinzhiyun.universitysciencesys.service.impl.educate;

import com.xinzhiyun.universitysciencesys.dao.educate.EduInfoDao;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.service.educate.EduInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教务信息业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class EduInfoServiceImpl implements EduInfoService {
    @Autowired
    private EduInfoDao eduInfoDao;

    @Override
    public List<EduInfo> findEduInfoAll(Map<String, Object> map) {
        return eduInfoDao.findEduInfoAll(map);
    }

    @Override
    public int findEduInfoNum() {
        return eduInfoDao.findEduInfoNum();
    }

    @Override
    public EduInfo findEduInfoById(Integer educate_id) {
        return eduInfoDao.findEduInfoById(educate_id);
    }

    @Override
    public Integer updateEduInfoById(EduInfo eduInfo) {
        return eduInfoDao.updateEduInfoById(eduInfo);
    }

    @Override
    public Integer addEduInfo(EduInfo eduInfo) {
        return eduInfoDao.addEduInfo(eduInfo);
    }

    @Override
    public Integer deleteEduInfoById(Integer educate_id) {
        return eduInfoDao.deleteEduInfoById(educate_id);
    }
}
