package com.xinzhiyun.universitysciencesys.dao.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 本科生培养dao层
 * @author: Mr.Ling
 * @create: 2020-08-26 10:20
 **/
@Repository
public interface TraRegularDao {
    /**使用分页查找所有本科生培养*/
    @Select("select train_id,train_title,date,content,major,type from train_regular order by #{major} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<TraBriefPlan> findTraRegularAll(Map<String, Object> map);

    /**查找所有本科生培养总数*/
    @Select("select count(train_id) from train_regular ")
    int findTraRegularNum();

    /**根据本科生培养编号查找本科生培养*/
    @Select("select train_id,train_title,date,content,major,type from train_regular where train_id = #{train_id}")
    TraBriefPlan findTraRegularById(@Param("train_id") Integer train_id);

    /**根据本科生培养编号修改本科生培养*/
    @Update("update train_regular set train_title = #{train_title},date=#{date},content=#{content},major=#{major},type=#{type} where train_id =#{train_id}")
    Integer updateTraRegularById(TraBriefPlan traBriefPlan);

    /**增加本科生培养*/
    @Insert("insert into train_regular (train_title,date,content,major,type) values(#{train_title},#{date},#{content},#{major},#{type})")
    Integer addTraRegular(TraBriefPlan traBriefPlan);

    /**根据编号删除本科生培养*/
    @Delete(" delete from train_regular where train_id = #{train_id}")
    Integer deleteTraRegularById(@Param(value = "train_id") Integer train_id);

    /**页面层*/
    /**根据类型本科生培养*/
    @Select("select train_id,train_title,date,content,major,type from train_regular where type= #{type}")
    List<TraBriefPlan> findTraRegularByType(@Param("type")String type);
}
