package top.maniy.evaluate_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.maniy.evaluate_springboot.entity.Danyuan;

import java.util.List;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.repository
 * @Description:
 * @date 2018/10/14 22:48
 */
public interface DanyuanRepository extends JpaRepository<Danyuan,Integer> {
    //根据parentCode查询danyuan集合
    List<Danyuan> findByParentCode(String code);
    //查询parentCode为null的danyuan集合
    List<Danyuan> findByParentCodeIsNull();
}
