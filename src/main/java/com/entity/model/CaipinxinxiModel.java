package com.entity.model;

import com.entity.CaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 菜品表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-02-19
 */
public class CaipinxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 菜品名称 Search
     */
    private String cpname;


    /**
     * 类型 Search
     */
    private Integer lxTypes;


    /**
     * 图片
     */
    private String imgPhoto;


    /**
     * 价格
     */
    private Double money;


    /**
     * 详情信息
     */
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
