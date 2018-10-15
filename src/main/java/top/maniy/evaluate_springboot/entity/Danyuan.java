package top.maniy.evaluate_springboot.entity;


import javax.persistence.*;

/**
 * @author liuzonghua
 * @Package top.maniy.entity
 * @Description:
 * @date 2018/9/13 9:09
 */

@Entity
@Table(name = "danyuan")
public class Danyuan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="danyuan_id")
    private Integer danyuanId;
    @Column(name="name")
    private String name;
    @Column(name="dizhi")
    private String dizhi;
    @Column(name="code")
    private String code;
    @Column(name="parent_code")
    private String parentCode;

    public Integer getDanyuanId() {
        return danyuanId;
    }

    public void setDanyuanId(Integer danyuanId) {
        this.danyuanId = danyuanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
