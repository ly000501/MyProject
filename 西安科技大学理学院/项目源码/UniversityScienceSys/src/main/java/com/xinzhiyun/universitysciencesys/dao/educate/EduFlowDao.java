package com.xinzhiyun.universitysciencesys.dao.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduFlow;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教务办公流程dao层
 * @author: Mr.Wang
 * @create: 2020-08-21 11:08
 **/
@Repository
public interface EduFlowDao {
    /**使用分页查找所有办公流程*/
    @Select("select educate_id,educate_title,person,date,picture from educate_flow limit ${(pageNum-1)*pageSize},${pageSize}")
    List<EduFlow> findEduFlowAll(Map<String,Object> map);

    /**查找所有教务信息总数*/
    @Select("select count(educate_id) from educate_flow")
    int findEduFlowNum();

    /**根据教务信息编号查找查找教务信息*/
    @Select("select educate_id,educate_title,person,date,picture from educate_flow where educate_id = #{educate_id}")
    EduFlow findEduFlowById(@Param("educate_id")Integer educate_id);

    /**根据教务信息编号修改教务信息*/
    @Update("update educate_flow set educate_title = #{educate_title},person=#{person},date=#{date},picture=#{picture} where educate_id =#{educate_id}")
    Integer updateEduFlowById(EduFlow eduFlow);

    /**增加教务信息*/
    @Insert("insert into educate_flow (educate_title,person,date,picture) values(#{educate_title},#{person},#{date},#{picture})")
    Integer addEduFlow(EduFlow eduFlow);

    /**根据编号删除教务信息*/
    @Delete(" delete from educate_flow where educate_id = #{educate_id}")
    Integer deleteEduFlowById(@Param(value="educate_id")Integer educate_id);
}
