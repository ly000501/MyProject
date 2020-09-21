package com.xinzhiyun.universitysciencesys.service.party;

import com.xinzhiyun.universitysciencesys.pojo.party.Party;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 党建工作接口
 */
public interface PartyService {

    /**使用分页查找所有党建工作*/
    List<Party> findPartyAll(Map<String, Object> map);

    /**查找所有党建工作总数*/
    int findPartyNum();

    /**根据党建工作编号查找查找党建工作*/
    Party findPartyById(Integer party_id);

    /**根据党建类型查找党建工作*/
    List<Party> findPartyByType(Map<String, Object> map);

    /**根据党建工作编号修改党建工作*/
    Integer updatePartyById(Party party);

    /**增加党建工作*/
    Integer addParty(Party Party);

    /**根据编号删除党建工作*/
    Integer deletePartyById(Integer party_id);

    /**根据类别查找总数*/
    int findPartyNumByType(String type);
}
