package com.xinzhiyun.universitysciencesys.service.student;

import com.xinzhiyun.universitysciencesys.pojo.student.StuParty;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface StuPartyService {
    /**使用分页查找学生党建*/
    List<StuParty> findStuPartyAll(Map<String, Object> map);

    /**查找所有学生党建总数*/
    int findStuPartyNum();

    /**根据编号查找查找学生党建*/
    StuParty findStuPartyById(Integer party_id);


    /**根据编号修改学生党建*/
    Integer updateStuPartyById(StuParty stuParty);

    /**增加学生党建*/
    Integer addStuParty(StuParty stuParty);

    /**根据编号删除学生党建*/
    Integer deleteStuPartyById(@Param(value = "party_id") Integer party_id);
}
