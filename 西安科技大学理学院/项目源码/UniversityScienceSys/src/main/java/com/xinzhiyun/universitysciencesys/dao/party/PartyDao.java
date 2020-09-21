package com.xinzhiyun.universitysciencesys.dao.party;

import com.xinzhiyun.universitysciencesys.pojo.party.Party;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 党建工作Dao层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-27 15:18
 **/
@Repository
public interface PartyDao {
    /**使用分页查找党建工作*/
    @Select("select party_id,party_title,date,person,content,picture,type from party order by type limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Party> findPartyAll(Map<String, Object> map);

    /**查找所有党建工作总数*/
    @Select(" select count(party_id) from party ")
    int findPartyNum();

    /**根据类别查找党建工作总数*/
    @Select(" select count(party_id) from party where type=#{type}")
    int findPartyNumByType(@Param("type") String type);

    /**根据党建工作编号查找查找党建工作*/
    @Select("select party_id,party_title,date,person,content,picture,type from party where party_id = #{party_id}")
    Party findPartyById(@Param("party_id") Integer party_id);

    /**根据党建工作标题查找查找党建工作*/
    @Select("select party_id,party_title,date,person,content,picture,type from party where type = #{type} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Party> findPartyByType(Map<String, Object> map);

    /**根据党建工作编号修改党建工作*/
    @Update("update party set party_title = #{party_title},date=#{date},person=#{person},picture=#{picture},content=#{content},type=#{type} where party_id =#{party_id}")
    Integer updatePartyById(Party party);

    /**增加党建工作*/
    @Insert("insert into party (party_title,date,person,picture,content,type) values(#{party_title},#{date},#{person},#{picture},#{content},#{type})")
    Integer addParty(Party party);

    /**根据编号删除党建工作*/
    @Delete(" delete from party where party_id = #{party_id}")
    Integer deletePartyById(@Param(value = "party_id") Integer party_id);
}
