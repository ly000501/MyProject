package com.xinzhiyun.universitysciencesys.dao.educate;

import com.xinzhiyun.universitysciencesys.pojo.educate.EduAchieve;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 教学成果dao层
 * @author: Mr.Wang
 * @create: 2020-08-21 11:09
 **/
@Repository
public interface EduAchieveDao {
    /**教学成果操作*/
    /**使用分页查找所有教学成果*/
    @Select("select educate_id,educate_title,date from educate_achieve limit ${(pageNum-1)*pageSize},${pageSize}")
    List<EduAchieve> findEduAchieveAll(Map<String,Object> map);

    /**查找所有教学成果总数*/
    @Select("select count(educate_id) from educate_achieve")
    int findEduAchieveNum();

    /**根据教学成果编号查找查找教学成果*/
    @Select("select educate_id,educate_title,date from educate_achieve where educate_id = #{educate_id}")
    EduAchieve findEduAchieveById(@Param("educate_id")Integer educate_id);

    /**根据教学成果编号修改教学成果*/
    @Update("update educate_achieve set educate_title = #{educate_title},date=#{date} where educate_id =#{educate_id}")
    Integer updateEduAchieveById(EduAchieve eduAchieve);

    /**增加教学成果*/
    @Insert("insert into educate_achieve (educate_title,date) values(#{educate_title},#{date})")
    Integer addEduAchieve(EduAchieve eduAchieve);

    /**根据编号删除教学成果*/
    @Delete(" delete from educate_achieve where educate_id = #{educate_id}")
    Integer deleteEduAchieveById(@Param(value="educate_id")Integer educate_id);


    /**获奖名单操作*/
    /**根据编号查找所有获奖名单*/
    @Select("select achieve_id,achieve_name,grade,person,unit from educate_achieve_list where educate_id=#{educate_id}")
    List<EduAchieve> findAchieveListAll(Map<String,Object> map);

    /**查找获奖名单总数*/
    @Select("select count(achieve_id) from educate_achieve_list where educate_id = #{educate_id}")
    int findAchieveListNum(@Param(value="educate_id")Integer educate_id);

    /**根据序号查找查找获奖名单*/
    @Select("select achieve_id,achieve_name,grade,person,unit,educate_id from educate_achieve_list where achieve_id = #{achieve_id}")
    EduAchieve findAchieveListById(@Param("achieve_id")Integer achieve_id);

    /**根据序号修改获奖列表*/
    @Update("update educate_achieve_list set achieve_name=#{achieve_name},grade=#{grade},person=#{person},unit=#{unit} where achieve_id =#{achieve_id}")
    Integer updateAchieveListById(EduAchieve eduAchieve);

    /**增加获奖名单*/
    @Insert("insert into educate_achieve_list (achieve_name,grade,person,unit,educate_id) values(#{achieve_name},#{grade},#{person},#{unit},#{educate_id})")
    Integer addAchieveList(EduAchieve eduAchieve);

    /**根据序号删除获奖名单*/
    @Delete(" delete from educate_achieve_list where achieve_id = #{achieve_id}")
    Integer deleteAchieveListById(@Param(value="achieve_id")Integer achieve_id);

    /**根据成果编号删除获奖名单*/
    @Delete(" delete from educate_achieve_list where educate_id = #{educate_id}")
    Integer deleteAchieveListByIdAll(@Param(value="educate_id")Integer educate_id);

}
