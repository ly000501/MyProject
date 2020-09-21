package com.xinzhiyun.universitysciencesys.service.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraTutor;

import java.util.List;
import java.util.Map;

/**
 * 导师接口
 */
public interface TraTutorService {

    /**使用分页查找所有导师*/
    List<TraTutor> findTraTutorAll(Map<String, Object> map);

    /**查找硕士生导师*/
    List<TraTutor> findTraGraTutorAll(Map<String, Object> map);

    /**查找所有导师总数*/
    int findTraTutorNum(Map<String,Object> map);

    /**根据导师编号查找查找导师*/
    TraTutor findTraTutorById(Integer train_id);

    /**根据导师编号修改导师*/
    Integer updateTraTutorById(TraTutor traTutor);

    /**增加导师*/
    Integer addTraTutor(TraTutor traTutor);

    /**根据编号删除导师*/
    Integer deleteTraTutorById(Integer train_id);
}
