package com.xinzhiyun.universitysciencesys.service.impl.party;

import com.xinzhiyun.universitysciencesys.dao.party.PartyDao;
import com.xinzhiyun.universitysciencesys.pojo.party.Party;
import com.xinzhiyun.universitysciencesys.service.party.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 党建工作业务层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 15:29
 **/
@Service
public class PartyServiceImpl implements PartyService {
    @Autowired
    private PartyDao partyDao;

    @Override
    public List<Party> findPartyAll(Map<String, Object> map) {
        return partyDao.findPartyAll(map);
    }

    @Override
    public int findPartyNum() {
        return partyDao.findPartyNum();
    }

    @Override
    public Party findPartyById(Integer party_id) {
        return partyDao.findPartyById(party_id);
    }

    @Override
    public List<Party> findPartyByType(Map<String, Object> map) {
        return partyDao.findPartyByType(map);
    }

    @Override
    public Integer updatePartyById(Party party) {
        return partyDao.updatePartyById(party);
    }

    @Override
    public Integer addParty(Party party) {
        return partyDao.addParty(party);
    }

    @Override
    public Integer deletePartyById(Integer party_id) {
        return partyDao.deletePartyById(party_id);
    }

    @Override
    public int findPartyNumByType(String type) {
        return partyDao.findPartyNumByType(type);
    }
}
