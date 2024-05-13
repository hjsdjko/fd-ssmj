package com.entity.view;

import com.entity.ZhutixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-20
 */
@TableName("zhutixinxi")
public class ZhutixinxiView extends ZhutixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public ZhutixinxiView() {

	}

	public ZhutixinxiView(ZhutixinxiEntity zhutixinxiEntity) {
		try {
			BeanUtils.copyProperties(this, zhutixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
