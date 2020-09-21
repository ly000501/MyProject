package com.xinzhiyun.universitysciencesys.dao.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduResource;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 在线资源dao层
 * @author: Mr.Li
 * @create: 2020-08-21 11:08
 **/
@Repository
public interface EduResourceDao {
    /**使用分页查找所有在线资源*/
    @Select("select educate_id,educate_title,date,content from educate_resource limit ${(pageNum-1)*pageSize},${pageSize}")
    List<EduResource> findEduResourceAll(Map<String,Object> map);

    /**查找所有在线资源总数*/
    @Select("select count(educate_id) from educate_Resource")
    int findEduResourceNum();

    /**根据在线资源编号查找查找在线资源*/
    @Select("select educate_id,educate_title,date,content from educate_resource where educate_id = #{educate_id}")
    EduResource findEduResourceById(@Param("educate_id")Integer educate_id);

    /**根据在线资源编号修改在线资源*/
    @Update("update educate_resource set educate_title = #{educate_title},date=#{date},content=#{content} where educate_id =#{educate_id}")
    Integer updateEduResourceById(EduResource eduResource);

    /**增加在线资源*/
    @Insert("insert into educate_resource (educate_title,date,content) values(#{educate_title},#{date},#{content})")
    Integer addEduResource(EduResource eduResource);

    /**根据编号删除在线资源*/
    @Delete(" delete from educate_resource where educate_id = #{educate_id}")
    Integer deleteEduResourceById(@Param(value="educate_id")Integer educate_id);
}
