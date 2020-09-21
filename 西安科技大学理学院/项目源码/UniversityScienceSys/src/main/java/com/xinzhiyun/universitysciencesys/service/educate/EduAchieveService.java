package com.xinzhiyun.universitysciencesys.service.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduAchieve;

import java.util.List;
import java.util.Map;

/**
 * 教学成果业务接口
 */
public interface EduAchieveService {

    /**使用分页查找所有教学成果*/
    List<EduAchieve> findEduAchieveAll(Map<String, Object> map);

    /**查找所有教学成果总数*/
    int findEduAchieveNum();

    /**根据教学成果编号查找查找教学成果*/
    EduAchieve findEduAchieveById(Integer educate_id);

    /**根据教学成果编号修改教学成果*/
    Integer updateEduAchieveById(EduAchieve eduAchieve);

    /**增加教学成果*/
    Integer addEduAchieve(EduAchieve eduAchieve);

    /**根据编号删除教学成果*/
    Integer deleteEduAchieveById(Integer educate_id);

    /**查找获奖名单*/
    List<EduAchieve> findAchieveListAll(Map<String, Object> map);

    /**查找获奖名单总数*/
    int findAchieveListNum(Integer educate_id);

    /**根据序号查找查找获奖名单*/
    EduAchieve findAchieveListById(Integer achieve_id);

    /**根据序号修改获奖名单*/
    Integer updateAchieveListById(EduAchieve eduAchieve);

    /**增加获奖名单*/
    Integer addAchieveList(EduAchieve eduAchieve);

    /**根据序号删除获奖名单*/
    Integer deleteAchieveListById(Integer achieve_id);

    /**根据编号删除获奖名单*/
    Integer deleteAchieveListByIdAll(Integer educate_id);
}
