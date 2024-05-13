package com.entity.vo;

import com.entity.BaojianxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 包间信息表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-02-19
 */
@TableName("baojianxinxi")
public class BaojianxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
