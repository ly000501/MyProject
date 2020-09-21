package com.xinzhiyun.universitysciencesys.service.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * 教务信息业务接口
 */
public interface EduInfoService {

    /**使用分页查找所有教务信息*/
    List<EduInfo> findEduInfoAll(Map<String,Object> map);

    /**查找所有教务信息总数*/
    int findEduInfoNum();

    /**根据教务信息编号查找查找教务信息*/
    EduInfo findEduInfoById(Integer educate_id);

    /**根据教务信息编号修改教务信息*/
    Integer updateEduInfoById(EduInfo eduInfo);

    /**增加教务信息*/
    Integer addEduInfo(EduInfo eduInfo);

    /**根据编号删除教务信息*/
    Integer deleteEduInfoById(Integer educate_id);
}
