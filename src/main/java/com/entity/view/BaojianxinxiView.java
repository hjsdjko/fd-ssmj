package com.entity.view;

import com.entity.BaojianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 包间信息表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-19
 */
@TableName("baojianxinxi")
public class BaojianxinxiView extends BaojianxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public BaojianxinxiView() {

	}

	public BaojianxinxiView(BaojianxinxiEntity baojianxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, baojianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
