package com.xinzhiyun.universitysciencesys.dao.train;

import com.xinzhiyun.universitysciencesys.pojo.train.TraTutor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 导师Dao层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-08-26 17:59
 **/
@Repository
public interface TraTutorDao {


    /**使用分页查找博士生导师*/
    @Select({"<script>"+
            " select train_id,train_name,hiredate,job,photo,brief,subject,remark from train_tutor where 1=1 " +
            " <if test = 'remark != null'> and remark = #{remark} </if> " +
            " <if test = 'subject != null'> and subject = #{subject} </if> "+
            " order by subject "+
            " limit ${(pageNum-1)*pageSize},${pageSize} "+
            " </script> "})
    List<TraTutor> findTraTutorAll(Map<String, Object> map);

    /**查找硕士生导师*/
    @Select({"<script>"+
            " select train_id,train_name,hiredate,job,photo,brief,subject,remark from train_tutor where 1=1 " +
            " <if test = 'subject != null'> and subject = #{subject} </if> "+
            " </script> "})
    List<TraTutor> findTraGraTutorAll(Map<String, Object> map);


    /**查找所有导师总数*/
    @Select({"<script>"+
            " select count(train_id) from train_tutor where 1=1 "+
            " <if test='remark != null '> and remark = #{remark} </if> "+
            " </script> "})
    int findTraTutorNum(Map<String,Object> map);

    /**根据导师编号查找查找导师*/
    @Select("select train_id,train_name,hiredate,job,photo,brief,remark from train_tutor where train_id = #{train_id}")
    TraTutor findTraTutorById(@Param("train_id") Integer train_id);

    /**根据导师编号修改导师*/
    @Update("update train_tutor set train_name = #{train_name},hiredate=#{hiredate},job=#{job},photo=#{photo},brief=#{brief} where train_id =#{train_id}")
    Integer updateTraTutorById(TraTutor traTutor);

    /**增加导师*/
    @Insert("insert into train_tutor (train_name,hiredate,job,photo,brief,remark,subject) values(#{train_name},#{hiredate},#{job},#{photo},#{brief},#{remark},#{subject})")
    Integer addTraTutor(TraTutor traTutor);

    /**根据编号删除导师*/
    @Delete(" delete from train_tutor where train_id = #{train_id}")
    Integer deleteTraTutorById(@Param(value = "train_id") Integer train_id);
}
