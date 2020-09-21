package com.xinzhiyun.universitysciencesys.service.impl.college;

import com.xinzhiyun.universitysciencesys.dao.college.CollegeDao;
import com.xinzhiyun.universitysciencesys.pojo.college.College;
import com.xinzhiyun.universitysciencesys.service.college.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: UniversityScienceSys
 * @description: 学院概况业务实现层
 * @author: Mr.Wang
 * @create: 2020-08-19 14:10
 **/
@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    private CollegeDao collegeDao;

    @Override
    public List<College> findCollegeAll() {
        return collegeDao.findCollegeAll();
    }

    @Override
    public College findCollegeByType(String type) {
        return collegeDao.findCollegeByType(type);
    }

    @Override
    public College findCollegeById(Integer college_id) {
        return collegeDao.findCollegeById(college_id);
    }

    @Override
    public void updateCollege(College college) {
        collegeDao.updateCollege(college);
    }

    @Override
    public void deleteCollege(Integer college_id) {
        collegeDao.deleteCollege(college_id);
    }

    @Override
    public void addCollege(College college) {
        collegeDao.addCollege(college);
    }
}
