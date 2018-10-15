package top.maniy.evaluate_springboot.service;

import top.maniy.evaluate_springboot.entity.Danyuan;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.service
 * @Description:
 * @date 2018/10/14 22:57
 */
public interface DanyuanService {
    List<Danyuan> findByParentCode(String code);

    List<Danyuan> findByParentCodeIsNull();
}
