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
@RequestMapping("/danyuan")
public class DanyuanController {

    @Autowired
    private DanyuanService danyuanService;

    @RequestMapping("/findByParentCode")
    @ResponseBody
    public List<Danyuan> findByParentCode(@RequestParam("parentCode") String parentCode){
        return danyuanService.findByParentCode(parentCode);
    }
}
