package top.maniy.evaluate_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.maniy.evaluate_springboot.entity.Renyuan;
import top.maniy.evaluate_springboot.service.RenyuanService;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.controller
 * @Description:
 * @date 2018/10/15 21:14
 */
@Controller
public class RenyuanController {

    @Autowired
    private RenyuanService renyuanService;

    @RequestMapping("renYuan/findByDanYuanCode")
    @ResponseBody
    public List<Renyuan> findByDanYuanCode(String renYuanCode){
        return  renyuanService.findByDanYuanCode(renYuanCode);
    }
}
