package com.xinzhiyun.universitysciencesys.dao.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraSystem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 培养制度dao层
 * @author: Mr.Ling
 * @create: 2020-08-26 10:20
 **/
@Repository
public interface TraSystemDao {
    /**使用分页查找所有培养制度*/
    @Select("select train_id,train_title,date,content from train_system where type=#{type} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<TraSystem> findTraSystemAll(Map<String, Object> map);

    /**查找所有培养制度总数*/
    @Select("select count(train_id) from train_system where type=#{type}")
    int findTraSystemNum(@Param("type") String type);

    /**根据培养制度编号查找培养制度*/
    @Select("select train_id,train_title,date,content,type from train_system where train_id = #{train_id}")
    TraSystem findTraSystemById(@Param("train_id") Integer train_id);

    /**根据培养制度编号修改培养制度*/
    @Update("update train_system set train_title = #{train_title},date=#{date},content=#{content},type=#{type} where train_id =#{train_id}")
    Integer updateTraSystemById(TraSystem TraSystem);

    /**增加培养制度*/
    @Insert("insert into train_system (train_title,date,content,type) values(#{train_title},#{date},#{content},#{type})")
    Integer addTraSystem(TraSystem TraSystem);

    /**根据编号删除培养制度*/
    @Delete(" delete from train_system where train_id = #{train_id}")
    Integer deleteTraSystemById(@Param(value = "train_id") Integer train_id);
}
