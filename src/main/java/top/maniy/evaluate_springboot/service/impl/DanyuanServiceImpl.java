package top.maniy.evaluate_springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.maniy.evaluate_springboot.entity.Danyuan;
import top.maniy.evaluate_springboot.repository.DanyuanRepository;
import top.maniy.evaluate_springboot.service.DanyuanService;

import javax.servlet.annotation.WebServlet;
import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.service.impl
 * @Description:
 * @date 2018/10/14 22:58
 */
@Service
public class DanyuanServiceImpl implements DanyuanService {

   @Autowired
   private DanyuanRepository danyuanRepository;

    @Override
    public List<Danyuan> findByParentCode(String code) {
        return danyuanRepository.findByParentCode(code);
    }
}
