package com.xinzhiyun.universitysciencesys.service.impl.student;

import com.xinzhiyun.universitysciencesys.dao.student.StuPartyDao;
import com.xinzhiyun.universitysciencesys.pojo.student.StuParty;
import com.xinzhiyun.universitysciencesys.service.student.StuPartyService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 学生党建实体类
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-04 09:29
 **/
@Service
public class StuPartyServiceImpl implements StuPartyService {
    @Autowired
    private StuPartyDao stuPartydao;
    @Override
    public List<StuParty> findStuPartyAll(Map<String, Object> map) {
        return stuPartydao.findStuPartyAll(map);
    }

    @Override
    public int findStuPartyNum() {
        return stuPartydao.findStuPartyNum();
    }

    @Override
    public StuParty findStuPartyById(Integer party_id) {
        return stuPartydao.findStuPartyById(party_id);
    }

    @Override
    public Integer updateStuPartyById(StuParty stuParty) {
        return stuPartydao.updateStuPartyById(stuParty);
    }

    @Override
    public Integer addStuParty(StuParty stuParty) {
        return stuPartydao.addStuParty(stuParty);
    }

    @Override
    public Integer deleteStuPartyById(Integer party_id) {
        return stuPartydao.deleteStuPartyById(party_id);
    }
}
