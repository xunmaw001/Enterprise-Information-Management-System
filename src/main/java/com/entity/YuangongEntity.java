package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 员工
 *
 * @author 
 * @email
 */
@TableName("yuangong")
public class YuangongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuangongEntity() {

	}

	public YuangongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 员工工号
     */
    @TableField(value = "yuangong_uuid_number")

    private String yuangongUuidNumber;


    /**
     * 员工姓名
     */
    @TableField(value = "yuangong_name")

    private String yuangongName;


    /**
     * 员工手机号
     */
    @TableField(value = "yuangong_phone")

    private String yuangongPhone;


    /**
     * 员工身份证号
     */
    @TableField(value = "yuangong_id_number")

    private String yuangongIdNumber;


    /**
     * 员工头像
     */
    @TableField(value = "yuangong_photo")

    private String yuangongPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 部门
     */
    @TableField(value = "bumen_types")

    private Integer bumenTypes;


    /**
     * 职位
     */
    @TableField(value = "zhiwei_types")

    private Integer zhiweiTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "yuangong_email")

    private String yuangongEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：员工工号
	 */
    public String getYuangongUuidNumber() {
        return yuangongUuidNumber;
    }
    /**
	 * 获取：员工工号
	 */

    public void setYuangongUuidNumber(String yuangongUuidNumber) {
        this.yuangongUuidNumber = yuangongUuidNumber;
    }
    /**
	 * 设置：员工姓名
	 */
    public String getYuangongName() {
        return yuangongName;
    }
    /**
	 * 获取：员工姓名
	 */

    public void setYuangongName(String yuangongName) {
        this.yuangongName = yuangongName;
    }
    /**
	 * 设置：员工手机号
	 */
    public String getYuangongPhone() {
        return yuangongPhone;
    }
    /**
	 * 获取：员工手机号
	 */

    public void setYuangongPhone(String yuangongPhone) {
        this.yuangongPhone = yuangongPhone;
    }
    /**
	 * 设置：员工身份证号
	 */
    public String getYuangongIdNumber() {
        return yuangongIdNumber;
    }
    /**
	 * 获取：员工身份证号
	 */

    public void setYuangongIdNumber(String yuangongIdNumber) {
        this.yuangongIdNumber = yuangongIdNumber;
    }
    /**
	 * 设置：员工头像
	 */
    public String getYuangongPhoto() {
        return yuangongPhoto;
    }
    /**
	 * 获取：员工头像
	 */

    public void setYuangongPhoto(String yuangongPhoto) {
        this.yuangongPhoto = yuangongPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }
    /**
	 * 获取：部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }
    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getYuangongEmail() {
        return yuangongEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setYuangongEmail(String yuangongEmail) {
        this.yuangongEmail = yuangongEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yuangong{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yuangongUuidNumber=" + yuangongUuidNumber +
            ", yuangongName=" + yuangongName +
            ", yuangongPhone=" + yuangongPhone +
            ", yuangongIdNumber=" + yuangongIdNumber +
            ", yuangongPhoto=" + yuangongPhoto +
            ", sexTypes=" + sexTypes +
            ", bumenTypes=" + bumenTypes +
            ", zhiweiTypes=" + zhiweiTypes +
            ", yuangongEmail=" + yuangongEmail +
            ", createTime=" + createTime +
        "}";
    }
}
