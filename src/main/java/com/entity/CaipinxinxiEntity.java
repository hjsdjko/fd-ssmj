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
 * 菜品表
 *
 * @author 
 * @email
 * @date 2021-02-19
 */
@TableName("caipinxinxi")
public class CaipinxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipinxinxiEntity() {

	}

	public CaipinxinxiEntity(T t) {
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
     * 菜品名称 Search
     */
    @TableField(value = "cpname")
    private String cpname;


    /**
     * 类型 Search
     */
    @TableField(value = "lx_types")
    private Integer lxTypes;


    /**
     * 图片
     */
    @TableField(value = "img_photo")
    private String imgPhoto;


    /**
     * 价格
     */
    @TableField(value = "money")
    private Double money;


    /**
     * 详情信息
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
	 * 设置：菜品名称 Search
	 */
    public String getCpname() {
        return cpname;
    }


    /**
	 * 获取：菜品名称 Search
	 */

    public void setCpname(String cpname) {
        this.cpname = cpname;
    }
    /**
	 * 设置：类型 Search
	 */
    public Integer getLxTypes() {
        return lxTypes;
    }


    /**
	 * 获取：类型 Search
	 */

    public void setLxTypes(Integer lxTypes) {
        this.lxTypes = lxTypes;
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
	 * 设置：价格
	 */
    public Double getMoney() {
        return money;
    }


    /**
	 * 获取：价格
	 */

    public void setMoney(Double money) {
        this.money = money;
    }
    /**
	 * 设置：详情信息
	 */
    public String getNoticeContent() {
        return noticeContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

}
