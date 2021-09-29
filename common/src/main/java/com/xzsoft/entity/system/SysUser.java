package com.xzsoft.entity.system;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import org.springframework.stereotype.Component;

import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author xboV
 * @since 2021-09-27
 */
@TableName("SYS_USER")
@Component
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableId("SID")
    private String sid;

    @TableField("USERCODE")
    private String usercode;

    @TableField("USERNAME")
    private String username;

    @TableField("PASSWORD")
    private String password;

    @TableField("USERNUM")
    private String usernum;

    @TableField("ORGID")
    private String orgid;

    /**
     * 部门ID
     */
    @TableField("DEPARTMENTID")
    private String departmentid;

    @TableField("JOB")
    private String job;

    /**
     * 入职日期
     */
    @TableField("ENTRYDATE")
    private String entrydate;

    @TableField("SEX")
    private String sex;

    /**
     * 出生日期
     */
    @TableField("BIRTHDAY")
    private String birthday;

    /**
     * 学历
     */
    @TableField("EDUBACKGROUND")
    private String edubackground;

    @TableField("MOBILEPHONE")
    private String mobilephone;

    @TableField("MOBILEPHONE2")
    private String mobilephone2;

    @TableField("OFFICEPHONE")
    private String officephone;

    /**
     * 邮箱
     */
    @TableField("EMAIL")
    private String email;

    @TableField("UAMID")
    private String uamid;

    @TableField("REMARKS")
    private String remarks;

    @TableField("STATE")
    private String state;

    /**
     * 0：普通用户，1：管理院，2：超级管理员
     */
    @TableField("ISADMIN")
    private String isadmin;

    /**
     * 创建人
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @TableField("CREATETIME")
    private String createtime;

    @TableField("MODIFIER")
    private String modifier;

    @TableField("MODIFYTIME")
    private String modifytime;

    @TableField("SPARAM01")
    private String sparam01;

    @TableField("SPARAM02")
    private String sparam02;

    @TableField("NPARAM01")
    private BigDecimal nparam01;

    @TableField("NPARAM02")
    private BigDecimal nparam02;

    @TableField("LASTLOGINTIME")
    private String lastlogintime;

    /**
     * 0：未锁定，1：连续错误锁定，2周期锁定
     */
    @TableField("LOCKSTATE")
    private String lockstate;

    @TableField("ISUSEIP")
    private String isuseip;

    @TableField("IP")
    private String ip;

    @TableField("CREATEORGID")
    private String createorgid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
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

    public String getUsernum() {
        return usernum;
    }

    public void setUsernum(String usernum) {
        this.usernum = usernum;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEdubackground() {
        return edubackground;
    }

    public void setEdubackground(String edubackground) {
        this.edubackground = edubackground;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getMobilephone2() {
        return mobilephone2;
    }

    public void setMobilephone2(String mobilephone2) {
        this.mobilephone2 = mobilephone2;
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUamid() {
        return uamid;
    }

    public void setUamid(String uamid) {
        this.uamid = uamid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    public String getSparam01() {
        return sparam01;
    }

    public void setSparam01(String sparam01) {
        this.sparam01 = sparam01;
    }

    public String getSparam02() {
        return sparam02;
    }

    public void setSparam02(String sparam02) {
        this.sparam02 = sparam02;
    }

    public BigDecimal getNparam01() {
        return nparam01;
    }

    public void setNparam01(BigDecimal nparam01) {
        this.nparam01 = nparam01;
    }

    public BigDecimal getNparam02() {
        return nparam02;
    }

    public void setNparam02(BigDecimal nparam02) {
        this.nparam02 = nparam02;
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLockstate() {
        return lockstate;
    }

    public void setLockstate(String lockstate) {
        this.lockstate = lockstate;
    }

    public String getIsuseip() {
        return isuseip;
    }

    public void setIsuseip(String isuseip) {
        this.isuseip = isuseip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCreateorgid() {
        return createorgid;
    }

    public void setCreateorgid(String createorgid) {
        this.createorgid = createorgid;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", sid=" + sid +
        ", usercode=" + usercode +
        ", username=" + username +
        ", password=" + password +
        ", usernum=" + usernum +
        ", orgid=" + orgid +
        ", departmentid=" + departmentid +
        ", job=" + job +
        ", entrydate=" + entrydate +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", edubackground=" + edubackground +
        ", mobilephone=" + mobilephone +
        ", mobilephone2=" + mobilephone2 +
        ", officephone=" + officephone +
        ", email=" + email +
        ", uamid=" + uamid +
        ", remarks=" + remarks +
        ", state=" + state +
        ", isadmin=" + isadmin +
        ", creator=" + creator +
        ", createtime=" + createtime +
        ", modifier=" + modifier +
        ", modifytime=" + modifytime +
        ", sparam01=" + sparam01 +
        ", sparam02=" + sparam02 +
        ", nparam01=" + nparam01 +
        ", nparam02=" + nparam02 +
        ", lastlogintime=" + lastlogintime +
        ", lockstate=" + lockstate +
        ", isuseip=" + isuseip +
        ", ip=" + ip +
        ", createorgid=" + createorgid +
        "}";
    }
}
