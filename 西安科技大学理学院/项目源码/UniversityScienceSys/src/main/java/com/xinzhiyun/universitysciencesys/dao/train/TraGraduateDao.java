package com.xinzhiyun.universitysciencesys.dao.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraBriefPlan;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 研究生培养dao层
 * @author: Mr.Ling
 * @create: 2020-08-26 10:20
 **/
@Repository
public interface TraGraduateDao {
    /**使用分页查找所有研究生培养*/
    @Select("select train_id,train_title,date,content,major,type from train_graduate order by #{major} limit ${(pageNum-1)*pageSize},${pageSize}")
    List<TraBriefPlan> findTraGraduateAll(Map<String, Object> map);

    /**查找所有研究生培养总数*/
    @Select("select count(train_id) from train_graduate ")
    int findTraGraduateNum();

    /**根据研究生培养编号查找研究生培养*/
    @Select("select train_id,train_title,date,content,major,type from train_graduate where train_id = #{train_id}")
    TraBriefPlan findTraGraduateById(@Param("train_id") Integer train_id);

    /**根据研究生培养编号修改研究生培养*/
    @Update("update train_graduate set train_title = #{train_title},date=#{date},content=#{content},major=#{major},type=#{type} where train_id =#{train_id}")
    Integer updateTraGraduateById(TraBriefPlan traBriefPlan);

    /**增加研究生培养*/
    @Insert("insert into train_graduate (train_title,date,content,major,type) values(#{train_title},#{date},#{content},#{major},#{type})")
    Integer addTraGraduate(TraBriefPlan traBriefPlan);

    /**根据编号删除研究生培养*/
    @Delete(" delete from train_graduate where train_id = #{train_id}")
    Integer deleteTraGraduateById(@Param(value = "train_id") Integer train_id);

    /**页面层*/
    /**根据编号查找研究生培养*/
    @Select("select train_id,train_title,date,content,major,type from train_graduate where type = #{type}")
    List<TraBriefPlan> findTraGraduateByType(@Param("type") String type);
}
