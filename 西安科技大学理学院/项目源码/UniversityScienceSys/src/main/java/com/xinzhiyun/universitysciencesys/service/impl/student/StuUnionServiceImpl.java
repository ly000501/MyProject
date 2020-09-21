package com.xinzhiyun.universitysciencesys.service.impl.student;

import com.xinzhiyun.universitysciencesys.dao.student.StuUnionDao;
import com.xinzhiyun.universitysciencesys.pojo.student.StuUnion;
import com.xinzhiyun.universitysciencesys.service.student.StuUnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 团委、学生会业务层
 * @author: Mr.Li
 * @create: 2020-09-04 11:16
 **/
@Service
public class StuUnionServiceImpl implements StuUnionService {
    @Autowired
    private StuUnionDao stuUnionDao;

    @Override
    public List<StuUnion> findStuUnionAll(Map<String, Object> map) {
        return stuUnionDao.findStuUnionAll(map);
    }

    @Override
    public int findStuUnionNum() {
        return stuUnionDao.findStuUnionNum();
    }

    @Override
    public StuUnion findStuUnionById(Integer union_id) {
        return stuUnionDao.findStuUnionById(union_id);
    }

    @Override
    public List<StuUnion> findStuUnionByType(Map<String,Object> map) {
        return stuUnionDao.findStuUnionByType(map);
    }

    @Override
    public int findStuUnionNumByType(String type) {
        return stuUnionDao.findStuUnionNumByType(type);
    }

    @Override
    public Integer updateStuUnionById(StuUnion stuUnion) {
        return stuUnionDao.updateStuUnionById(stuUnion);
    }

    @Override
    public Integer addStuUnion(StuUnion stuUnion) {
        return stuUnionDao.addStuUnion(stuUnion);
    }

    @Override
    public Integer deleteStuUnionById(Integer union_id) {
        return stuUnionDao.deleteStuUnionById(union_id);
    }
}
