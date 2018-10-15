package top.maniy.evaluate_springboot.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.maniy.evaluate_springboot.entity.Danyuan;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liuzonghua
 * @Package top.maniy.evaluate_springboot.repository
 * @Description:
 * @date 2018/10/15 11:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DanyuanRepositoryTest {

    @Autowired
    private DanyuanRepository repository;

    @Test
    public void findByParentCode() {
        List<Danyuan> danyuanList =repository.findByParentCode("01");
        System.out.println(danyuanList);
    }
}