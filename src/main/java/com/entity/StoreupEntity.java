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
 * 收藏表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
@TableName("storeup")
public class StoreupEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public StoreupEntity() {
		
	}
	
	public StoreupEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
	/**
	 * 用户id
	 */
					
	private Integer userid;
	
	/**
	 * 收藏id
	 */
					
	private Integer refid;
	
	/**
	 * 表名
	 */
					
	private String tablename;
	
	/**
	 * 收藏名称
	 */
					
	private String name;
	
	/**
	 * 收藏图片
	 */
					
	private String picture;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRefid() {
		return refid;
	}

	public void setRefid(Integer refid) {
		this.refid = refid;
	}

	/**
	 * 设置：表名
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	/**
	 * 获取：表名
	 */
	public String getTablename() {
		return tablename;
	}
	/**
	 * 设置：收藏名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：收藏名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：收藏图片
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * 获取：收藏图片
	 */
	public String getPicture() {
		return picture;
	}

}
