package com.xinzhiyun.universitysciencesys.service.impl.outstand;

import com.xinzhiyun.universitysciencesys.dao.outstand.OutAlumnaDao;
import com.xinzhiyun.universitysciencesys.pojo.outstand.OutAlumna;
import com.xinzhiyun.universitysciencesys.service.outstand.OutAlumnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 杰出校友业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-21 11:59
 **/
@Service
public class OutAlumnaServiceImpl implements OutAlumnaService {
    @Autowired
    private OutAlumnaDao outAlumnaDao;

    @Override
    public List<OutAlumna> findOutAlumnaAll(Map<String, Object> map) {
        return outAlumnaDao.findOutAlumnaAll(map);
    }

    @Override
    public int findOutAlumnaNum() {
        return outAlumnaDao.findOutAlumnaNum();
    }

    @Override
    public OutAlumna findOutAlumnaById(Integer outstand_id) {
        return outAlumnaDao.findOutAlumnaById(outstand_id);
    }

    @Override
    public Integer updateOutAlumnaById(OutAlumna outAlumna) {
        return outAlumnaDao.updateOutAlumnaById(outAlumna);
    }

    @Override
    public Integer addOutAlumna(OutAlumna outAlumna) {
        return outAlumnaDao.addOutAlumna(outAlumna);
    }

    @Override
    public Integer deleteOutAlumnaById(Integer outstand_id) {
        return outAlumnaDao.deleteOutAlumnaById(outstand_id);
    }
}
