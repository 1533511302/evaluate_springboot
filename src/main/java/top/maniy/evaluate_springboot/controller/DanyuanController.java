package top.maniy.evaluate_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maniy.evaluate_springboot.entity.Danyuan;
import top.maniy.evaluate_springboot.service.DanyuanService;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.controller
 * @Description:
 * @date 2018/10/14 23:02
 */
@Controller

public class DanyuanController {

    @Autowired
    private DanyuanService danyuanService;

    @RequestMapping("/")
    public String index(){
        return "/indexPage";
    }

    @RequestMapping("/danYuan/findByParentCode")
    @ResponseBody
    public List<Danyuan> findByParentCode(String flag,@RequestParam(value = "parentCode") String parentCode){

     return danyuanService.findByParentCode(parentCode);
    }
    @RequestMapping("/danYuan/findCity")
    @ResponseBody
    public List<Danyuan> findCity(){

        return danyuanService.findByParentCodeIsNull();
    }
}
