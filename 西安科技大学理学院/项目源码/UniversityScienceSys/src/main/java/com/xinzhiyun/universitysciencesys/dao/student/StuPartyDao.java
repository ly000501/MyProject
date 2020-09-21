package com.xinzhiyun.universitysciencesys.dao.student;

import com.xinzhiyun.universitysciencesys.pojo.student.StuParty;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 学生党建Dao层
 * @Param:
 * @author: Mr.Li
 * @create: 2020-09-04 09:18
 **/
@Repository
public interface StuPartyDao {
    /**使用分页查找学生党建*/
    @Select("select party_id,party_title,party_name,file from student_party limit ${(pageNum-1)*pageSize},${pageSize}")
    List<StuParty> findStuPartyAll(Map<String, Object> map);

    /**查找所有学生党建总数*/
    @Select(" select count(party_id) from student_party ")
    int findStuPartyNum();

    /**根据编号查找查找学生党建*/
    @Select("select party_id,party_title,party_name,file from student_party where party_id = #{party_id}")
    StuParty findStuPartyById(@Param("party_id") Integer party_id);


    /**根据编号修改学生党建*/
    @Update("update student_party set party_title = #{party_title},party_name=#{party_name},file=#{file} where party_id =#{party_id}")
    Integer updateStuPartyById(StuParty stuParty);

    /**增加学生党建*/
    @Insert("insert into student_party (party_id,party_title,party_name,file) values(#{party_id},#{party_title},#{party_name},#{file})")
    Integer addStuParty(StuParty stuParty);

    /**根据编号删除学生党建*/
    @Delete(" delete from student_party where party_id = #{party_id}")
    Integer deleteStuPartyById(@Param(value = "party_id") Integer party_id);
}
