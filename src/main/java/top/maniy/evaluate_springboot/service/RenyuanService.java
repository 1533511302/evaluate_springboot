package top.maniy.evaluate_springboot.service;

import top.maniy.evaluate_springboot.entity.Renyuan;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.service
 * @Description:
 * @date 2018/10/15 21:08
 */
public interface RenyuanService {

    List<Renyuan> findByDanYuanCode(String code);
}
