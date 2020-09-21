package com.xinzhiyun.universitysciencesys.service.impl.educate;

import com.xinzhiyun.universitysciencesys.dao.educate.EduFlowDao;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduFlow;
import com.xinzhiyun.universitysciencesys.service.educate.EduFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教务办公流程业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class EduFlowServiceImpl implements EduFlowService {
    @Autowired
    private EduFlowDao eduFlowDao;

    @Override
    public List<EduFlow> findEduFlowAll(Map<String, Object> map) {
        return eduFlowDao.findEduFlowAll(map);
    }

    @Override
    public int findEduFlowNum() {
        return eduFlowDao.findEduFlowNum();
    }

    @Override
    public EduFlow findEduFlowById(Integer educate_id) {
        return eduFlowDao.findEduFlowById(educate_id);
    }

    @Override
    public Integer updateEduFlowById(EduFlow EduFlow) {
        return eduFlowDao.updateEduFlowById(EduFlow);
    }

    @Override
    public Integer addEduFlow(EduFlow EduFlow) {
        return eduFlowDao.addEduFlow(EduFlow);
    }

    @Override
    public Integer deleteEduFlowById(Integer educate_id) {
        return eduFlowDao.deleteEduFlowById(educate_id);
    }
}
