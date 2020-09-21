package com.xinzhiyun.universitysciencesys.service.impl.educate;

import com.xinzhiyun.universitysciencesys.dao.educate.EduAchieveDao;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduAchieve;
import com.xinzhiyun.universitysciencesys.service.educate.EduAchieveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教学成果业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class EduAchieveServiceImpl implements EduAchieveService {
    @Autowired
    private EduAchieveDao eduAchieveDao;

    @Override
    public List<EduAchieve> findEduAchieveAll(Map<String, Object> map) {
        return eduAchieveDao.findEduAchieveAll(map);
    }

    @Override
    public int findEduAchieveNum() {
        return eduAchieveDao.findEduAchieveNum();
    }

    @Override
    public EduAchieve findEduAchieveById(Integer educate_id) {
        return eduAchieveDao.findEduAchieveById(educate_id);
    }

    @Override
    public Integer updateEduAchieveById(EduAchieve eduAchieve) {
        return eduAchieveDao.updateEduAchieveById(eduAchieve);
    }

    @Override
    public Integer addEduAchieve(EduAchieve eduAchieve) {
        return eduAchieveDao.addEduAchieve(eduAchieve);
    }

    @Override
    public Integer deleteEduAchieveById(Integer educate_id) {
        return eduAchieveDao.deleteEduAchieveById(educate_id);
    }

    @Override
    public List<EduAchieve> findAchieveListAll(Map<String, Object> map) {
        return eduAchieveDao.findAchieveListAll(map);
    }

    @Override
    public int findAchieveListNum(Integer educate_id) {
        return eduAchieveDao.findAchieveListNum(educate_id);
    }

    @Override
    public EduAchieve findAchieveListById(Integer educate_id) {
        return eduAchieveDao.findAchieveListById(educate_id);
    }

    @Override
    public Integer updateAchieveListById(EduAchieve eduAchieve) {
        return eduAchieveDao.updateAchieveListById(eduAchieve);
    }

    @Override
    public Integer addAchieveList(EduAchieve eduAchieve) {
        return eduAchieveDao.addAchieveList(eduAchieve);
    }

    @Override
    public Integer deleteAchieveListById(Integer achieve_id) {
        return eduAchieveDao.deleteAchieveListById(achieve_id);
    }

    @Override
    public Integer deleteAchieveListByIdAll(Integer educate_id) {
        return eduAchieveDao.deleteAchieveListByIdAll(educate_id);
    }
}
