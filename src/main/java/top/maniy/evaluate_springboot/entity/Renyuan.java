package top.maniy.evaluate_springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author liuzonghua
 * @Package top.maniy.entity
 * @Description:
 * @date 2018/9/13 14:33
 */
@Entity
public class Renyuan {
    @Id
    private Integer renyuanid;

    private String name;

    private String phone;

    private String chengshi;

    private String pinpai;

    private String zhuangui;

    private String danyuancode;

    private String danyuanmc;

    private String username;

    private String password;

    private int gangweiid;

    private String gangweimc;

    private String createtime;

    private String zhuangtai;

    private String zhuangtaimc;

    private int shanchu;

    private String beizhu;

    private int quanxianid;

    public int getShanchu() {
        return shanchu;
    }

    public void setShanchu(int shanchu) {
        this.shanchu = shanchu;
    }

    public Integer getRenyuanid() {
        return renyuanid;
    }

    public void setRenyuanid(Integer renyuanid) {
        this.renyuanid = renyuanid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getChengshi() {
        return chengshi;
    }

    public void setChengshi(String chengshi) {
        this.chengshi = chengshi;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public String getZhuangui() {
        return zhuangui;
    }

    public void setZhuangui(String zhuangui) {
        this.zhuangui = zhuangui;
    }

    public String getDanyuancode() {
        return danyuancode;
    }

    public void setDanyuancode(String danyuancode) {
        this.danyuancode = danyuancode;
    }

    public String getDanyuanmc() {
        return danyuanmc;
    }

    public void setDanyuanmc(String danyuanmc) {
        this.danyuanmc = danyuanmc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGangweiid() {
        return gangweiid;
    }

    public void setGangweiid(int gangweiid) {
        this.gangweiid = gangweiid;
    }

    public String getGangweimc() {
        return gangweimc;
    }

    public void setGangweimc(String gangweimc) {
        this.gangweimc = gangweimc;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }

    public String getZhuangtaimc() {
        return zhuangtaimc;
    }

    public void setZhuangtaimc(String zhuangtaimc) {
        this.zhuangtaimc = zhuangtaimc;
    }



    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public int getQuanxianid() {
        return quanxianid;
    }

    public void setQuanxianid(int quanxianid) {
        this.quanxianid = quanxianid;
    }

    @Override
    public String toString() {
        return "Renyuan{" +
                "renyuanid=" + renyuanid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", chengshi='" + chengshi + '\'' +
                ", pinpai='" + pinpai + '\'' +
                ", zhuangui='" + zhuangui + '\'' +
                ", danyuancode='" + danyuancode + '\'' +
                ", danyuanmc='" + danyuanmc + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gangweiid=" + gangweiid +
                ", gangweimc='" + gangweimc + '\'' +
                ", createtime='" + createtime + '\'' +
                ", zhuangtai='" + zhuangtai + '\'' +
                ", zhuangtaimc='" + zhuangtaimc + '\'' +
                ", shanchu='" + shanchu + '\'' +
                ", beizhu='" + beizhu + '\'' +
                ", quanxianid=" + quanxianid +
                '}';
    }
}
