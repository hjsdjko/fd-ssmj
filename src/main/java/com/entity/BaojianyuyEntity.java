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
 * 包间预约表
 *
 * @author 
 * @email
 * @date 2021-02-19
 */
@TableName("baojianyuy")
public class BaojianyuyEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BaojianyuyEntity() {

	}

	public BaojianyuyEntity(T t) {
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
     * 包间编号
     */
    @TableField(value = "bjnumber")
    private Integer bjnumber;


    /**
     * 包间名称 Search
     */
    @TableField(value = "bjname")
    private String bjname;


    /**
     * 图片
     */
    @TableField(value = "img_photo")
    private String imgPhoto;


    /**
     * 包间定金
     */
    @TableField(value = "money")
    private Double money;


    /**
     * 预约用户
     */
    @TableField(value = "yh_types")
    private Integer yhTypes;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "notice_time")
    private Date noticeTime;


    /**
     * 备注信息
     */
    @TableField(value = "notice_content")
    private String noticeContent;


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
	 * 设置：包间编号
	 */
    public Integer getBjnumber() {
        return bjnumber;
    }


    /**
	 * 获取：包间编号
	 */

    public void setBjnumber(Integer bjnumber) {
        this.bjnumber = bjnumber;
    }
    /**
	 * 设置：包间名称 Search
	 */
    public String getBjname() {
        return bjname;
    }


    /**
	 * 获取：包间名称 Search
	 */

    public void setBjname(String bjname) {
        this.bjname = bjname;
    }
    /**
	 * 设置：图片
	 */
    public String getImgPhoto() {
        return imgPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setImgPhoto(String imgPhoto) {
        this.imgPhoto = imgPhoto;
    }
    /**
	 * 设置：包间定金
	 */
    public Double getMoney() {
        return money;
    }


    /**
	 * 获取：包间定金
	 */

    public void setMoney(Double money) {
        this.money = money;
    }
    /**
	 * 设置：预约用户
	 */
    public Integer getYhTypes() {
        return yhTypes;
    }


    /**
	 * 获取：预约用户
	 */

    public void setYhTypes(Integer yhTypes) {
        this.yhTypes = yhTypes;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getNoticeTime() {
        return noticeTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }
    /**
	 * 设置：备注信息
	 */
    public String getNoticeContent() {
        return noticeContent;
    }


    /**
	 * 获取：备注信息
	 */

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

}
