package com.xinzhiyun.universitysciencesys.dao.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教务信息dao层
 * @author: Mr.Wang
 * @create: 2020-08-21 11:07
 **/
@Repository
public interface EduInfoDao {
    /**使用分页查找所有教务信息*/
    @Select("select educate_id,educate_title,person,date,content from educate_info limit ${(pageNum-1)*pageSize},${pageSize}")
    List<EduInfo> findEduInfoAll(Map<String,Object> map);

    /**查找所有教务信息总数*/
    @Select("select count(educate_id) from educate_info")
    int findEduInfoNum();

    /**根据教务信息编号查找查找教务信息*/
    @Select("select educate_id,educate_title,person,date,content from educate_info where educate_id = #{educate_id}")
    EduInfo findEduInfoById(@Param("educate_id")Integer educate_id);

    /**根据教务信息编号修改教务信息*/
    @Update("update educate_info set educate_title = #{educate_title},person=#{person},date=#{date},content=#{content} where educate_id =#{educate_id}")
    Integer updateEduInfoById(EduInfo eduInfo);

    /**增加教务信息*/
    @Insert("insert into educate_info (educate_title,person,date,content) values(#{educate_title},#{person},#{date},#{content})")
    Integer addEduInfo(EduInfo eduInfo);

    /**根据编号删除教务信息*/
    @Delete(" delete from educate_info where educate_id = #{educate_id}")
    Integer deleteEduInfoById(@Param(value="educate_id")Integer educate_id);
}
