package com.entity.view;

import com.entity.DiscussBaojianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 包间评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
@TableName("discussBaojianxinxi")
public class DiscussBaojianxinxiView  extends DiscussBaojianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussBaojianxinxiView(){
	}
 
 	public DiscussBaojianxinxiView(DiscussBaojianxinxiEntity discussBaojianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussBaojianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
