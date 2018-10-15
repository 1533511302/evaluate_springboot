package top.maniy.evaluate_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.maniy.evaluate_springboot.entity.Renyuan;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.repository
 * @Description:
 * @date 2018/10/15 21:00
 */
public interface RenyuanRepository extends JpaRepository<Renyuan,Integer>{

    List<Renyuan> findByDanyuancode(String code);
}
