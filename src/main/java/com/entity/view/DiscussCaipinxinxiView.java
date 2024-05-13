package com.entity.view;

import com.entity.DiscussCaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
@TableName("discussCaipinxinxi")
public class DiscussCaipinxinxiView  extends DiscussCaipinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussCaipinxinxiView(){
	}
 
 	public DiscussCaipinxinxiView(DiscussCaipinxinxiEntity discussCaipinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussCaipinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
