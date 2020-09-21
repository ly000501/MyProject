package com.xinzhiyun.universitysciencesys.service.impl.datum;

import com.xinzhiyun.universitysciencesys.dao.datum.DatumDao;
import com.xinzhiyun.universitysciencesys.pojo.datum.Datum;
import com.xinzhiyun.universitysciencesys.service.datum.DatumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 资料下载业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 15:29
 **/
@Service
public class DatumServiceImpl implements DatumService {
    @Autowired
    private DatumDao datumDao;

    @Override
    public List<Datum> findDatumAll(Map<String, Object> map) {
        return datumDao.findDatumAll(map);
    }

    @Override
    public int findDatumNum() {
        return datumDao.findDatumNum();
    }

    @Override
    public Datum findDatumById(Integer datum_id) {
        return datumDao.findDatumById(datum_id);
    }

    @Override
    public Datum findDatumByFileName(String file_name) {
        return datumDao.findDatumByFileName(file_name);
    }

    @Override
    public List<Datum> findDatumByType(Map<String, Object> map) {
        return datumDao.findDatumByType(map);
    }

    @Override
    public Integer updateDatumById(Datum datum) {
        return datumDao.updateDatumById(datum);
    }

    @Override
    public Integer addDatum(Datum datum) {
        return datumDao.addDatum(datum);
    }

    @Override
    public Integer deleteDatumById(Integer datum_id) {
        return datumDao.deleteDatumById(datum_id);
    }
}
