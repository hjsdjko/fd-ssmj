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
 * 
 *
 * @author 
 * @email
 * @date 2021-02-20
 */
@TableName("zhutixinxi")
public class ZhutixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhutixinxiEntity() {

	}

	public ZhutixinxiEntity(T t) {
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
     * 主题
     */
    @TableField(value = "notice_content")
    private String noticeContent;


    /**
     * 修改时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time")
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
	 * 设置：主题
	 */
    public String getNoticeContent() {
        return noticeContent;
    }


    /**
	 * 获取：主题
	 */

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    /**
	 * 设置：修改时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：修改时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
