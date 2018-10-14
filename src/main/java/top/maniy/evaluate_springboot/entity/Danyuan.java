package top.maniy.evaluate_springboot.entity;

/**
 * @author liuzonghua
 * @Package top.maniy.entity
 * @Description:
 * @date 2018/9/13 9:09
 */
public class Danyuan {
    private int danYuanId;

    private String name;

    private String diZhi;

    private String code;

    private String parentCode;

    public int getDanYuanId() {
        return danYuanId;
    }

    public void setDanYuanId(int danYuanId) {
        this.danYuanId = danYuanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiZhi() {
        return diZhi;
    }

    public void setDiZhi(String diZhi) {
        this.diZhi = diZhi;
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

    @Override
    public String toString() {
        return "Danyuan{" +
                "danYuanId=" + danYuanId +
                ", name='" + name + '\'' +
                ", diZhi='" + diZhi + '\'' +
                ", code='" + code + '\'' +
                ", parentCode='" + parentCode + '\'' +
                '}';
    }
}
