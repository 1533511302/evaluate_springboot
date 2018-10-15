package top.maniy.evaluate_springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maniy.evaluate_springboot.entity.Renyuan;
import top.maniy.evaluate_springboot.repository.RenyuanRepository;
import top.maniy.evaluate_springboot.service.RenyuanService;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.service.impl
 * @Description:
 * @date 2018/10/15 21:10
 */
@Service
public class RenyuanServiceImpl implements RenyuanService {

    @Autowired
    private RenyuanRepository renyuanRepository;

    @Override
    public List<Renyuan> findByDanYuanCode(String code) {
        return renyuanRepository.findByDanyuancode(code);
    }
}
