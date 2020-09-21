package com.xinzhiyun.universitysciencesys.controller.college;

import com.xinzhiyun.universitysciencesys.pojo.college.College;
import com.xinzhiyun.universitysciencesys.pojo.educate.EduInfo;
import com.xinzhiyun.universitysciencesys.service.college.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: UniversityScienceSys
 * @description: 领导控制层
 * @author: Mr.Wang
 * @create: 2020-08-18 14:38
 **/
@Controller
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @RequestMapping("findCollegeAll.do")
    public String findCollegeAll(Model model){
        List<College> list = collegeService.findCollegeAll();
        model.addAttribute("data",list);
        return "views/college/college_list";
    }

    /**
     * @Description: 根据类型查找
     * @Date: 2020/8/19
     */
    @RequestMapping("findCollegeByType.do")
    public String findCollegeByType(Model model,@RequestParam(value = "type") String type){
        College college = collegeService.findCollegeByType(type);
        model.addAttribute("college",college);
        return "";
    }

    /**
     * @Description: 根据编号查找
     * @Date: 2020/8/19
     */
    @RequestMapping("findCollegeById.do")
    public String findCollegeById(Model model,@RequestParam(value = "college_id")Integer college_id){
        College college = collegeService.findCollegeById(college_id);
        model.addAttribute("college",college);
        return "views/college/college_info";
    }

    /**
     * @Description: 跳转到修改
     * @Date: 2020/8/19
     */
    @RequestMapping("toUpdateCollegeById.do")
    public String toUpdateCollegeById(Model model,@RequestParam(value = "college_id")Integer college_id){
        College college = collegeService.findCollegeById(college_id);
        model.addAttribute("college",college);
        return "views/college/college_edit";
    }

    /**
     * @Description: 修改
     * @Date: 2020/8/19
     */
    @RequestMapping("updateCollegeById.do")
    public String updateCollegeById(College college){
        collegeService.updateCollege(college);
        return "redirect:findCollegeAll.do";
    }

    /**
     * @Description: 跳转到添加
     * @Date: 2020/8/18
     */
    @RequestMapping("toAddCollege.do")
    public String toAddCollege() {
        return "views/college/college_add";
    }

    /**
     * @Description: 添加
     * @Date: 2020/8/18
     */
    @RequestMapping("addCollege.do")
    public String addCollege(College college) {
        collegeService.addCollege(college);
        return "redirect:findCollegeAll.do";
    }

    /**
     * @Description: 删除
     * @Date: 2020/8/18
     */
    @RequestMapping("deleteCollege.do")
    public String deleteCollege(@RequestParam("college_id") Integer college_id) {
        collegeService.deleteCollege(college_id);
        return "redirect:findCollege.do";
    }

    /**页面*/
    /**使用分页查找所有教务信息*/
    @RequestMapping(value="/findCollegeAll2.do")
    public String findEduCollegeAll2(Model model,@RequestParam("type") String type) {
        College college = collegeService.findCollegeByType(type);
        model.addAttribute("college",college);
        if("学院简介".equals(type)){
            return "pages/college/col_brif";
        }else if("党政领导".equals(type)){
            return "pages/college/col_leader";
        }else if("机构设置".equals(type)){
            return "pages/college/col_organ";
        }else{
            model.addAttribute("error","未找到此学院概况");
            return "error";
        }
    }
}
