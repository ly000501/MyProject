package com.xinzhiyun.universitysciencesys.service.outstand;

import com.xinzhiyun.universitysciencesys.pojo.outstand.OutAlumna;

import java.util.List;
import java.util.Map;

/**
 * 杰出校友接口
 */
public interface OutAlumnaService {

    /**使用分页查找所有杰出校友*/
    List<OutAlumna> findOutAlumnaAll(Map<String, Object> map);

    /**查找所有杰出校友总数*/
    int findOutAlumnaNum();

    /**根据杰出校友编号查找查找杰出校友*/
    OutAlumna findOutAlumnaById(Integer educate_id);

    /**根据杰出校友编号修改杰出校友*/
    Integer updateOutAlumnaById(OutAlumna OutAlumna);

    /**增加杰出校友*/
    Integer addOutAlumna(OutAlumna OutAlumna);

    /**根据编号删除杰出校友*/
    Integer deleteOutAlumnaById(Integer educate_id);
}
