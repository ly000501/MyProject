package com.xinzhiyun.universitysciencesys.dao.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduManage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 管理制度dao层
 * @author: Mr.Wang
 * @create: 2020-08-21 11:08
 **/
@Repository
public interface EduManageDao {
    /**使用分页查找所有管理制度*/
    @Select("select educate_id,educate_title,date,content from educate_manage limit ${(pageNum-1)*pageSize},${pageSize}")
    List<EduManage> findEduManageAll(Map<String,Object> map);

    /**查找所有管理制度总数*/
    @Select("select count(educate_id) from educate_manage")
    int findEduManageNum();

    /**根据管理制度编号查找查找管理制度*/
    @Select("select educate_id,educate_title,date,content from educate_manage where educate_id = #{educate_id}")
    EduManage findEduManageById(@Param("educate_id")Integer educate_id);

    /**根据管理制度编号修改管理制度*/
    @Update("update educate_manage set educate_title = #{educate_title},date=#{date},content=#{content} where educate_id =#{educate_id}")
    Integer updateEduManageById(EduManage eduManage);

    /**增加管理制度*/
    @Insert("insert into educate_manage (educate_title,date,content) values(#{educate_title},#{date},#{content})")
    Integer addEduManage(EduManage eduManage);

    /**根据编号删除管理制度*/
    @Delete(" delete from educate_manage where educate_id = #{educate_id}")
    Integer deleteEduManageById(@Param(value="educate_id")Integer educate_id);
}
