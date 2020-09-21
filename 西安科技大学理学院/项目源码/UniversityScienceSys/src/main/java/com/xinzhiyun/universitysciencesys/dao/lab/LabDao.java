package com.xinzhiyun.universitysciencesys.dao.lab;

import com.xinzhiyun.universitysciencesys.pojo.lab.Lab;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 实验室建设dao层
 * @author: Mr.Ling
 * @create: 2020-08-27 12:02
 **/
@Repository
public interface LabDao {
    /**使用分页查找所有实验室建设*/
    @Select("select lab_id,lab_title,lab_name,date,content,type from lab order by lab_name limit ${(pageNum-1)*pageSize},${pageSize}")
    List<Lab> findLabAll(Map<String, Object> map);

    /**查找所有实验室建设总数*/
    @Select("select count(lab_id) from lab")
    int findLabNum();

    /**根据实验室建设编号查找查找实验室建设*/
    @Select("select lab_id,lab_title,lab_name,date,content,type from lab where lab_id = #{lab_id}")
    Lab findLabById(@Param("lab_id") Integer lab_id);

    /**根据实验室建设标题查找查找实验室建设*/
    @Select("select lab_id,lab_title,lab_name,date,content,type from lab where lab_title = #{lab_title}")
    Lab findLabByTitle(@Param("lab_title") String lab_title);

    /**根据实验室建设编号修改实验室建设*/
    @Update("update lab set lab_title = #{lab_title} ,lab_name=#{lab_name},date=#{date},content=#{content},type=#{type} where lab_id =#{lab_id}")
    Integer updateLabById(Lab lab);

    /**增加实验室建设*/
    @Insert("insert into lab (lab_title,lab_name,date,content,type) values(#{lab_title},#{lab_name},#{date},#{content},#{type})")
    Integer addLab(Lab lab);

    /**根据编号删除实验室建设*/
    @Delete(" delete from lab where lab_id = #{lab_id}")
    Integer deleteLabById(@Param(value = "lab_id") Integer lab_id);


    /**页面层*/
    /**根据实验室名称或类型查找实验室*/
    @Select({"<script>"+
            " select lab_id,lab_title,lab_name,date,content,type from lab where 1=1 " +
            " <if test = 'lab_name != null'> and lab_name = #{lab_name} </if> " +
            " <if test = 'type != null'> and type = #{type} </if> "+
            " limit ${(pageNum-1)*pageSize},${pageSize} "+
            " </script> "})
    List<Lab> findLabByType(Map<String, Object> map);
}
