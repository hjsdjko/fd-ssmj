package com.entity.view;

import com.entity.BaojianyuyEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 包间预约表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-02-19
 */
@TableName("baojianyuy")
public class BaojianyuyView extends BaojianyuyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public BaojianyuyView() {

	}

	public BaojianyuyView(BaojianyuyEntity baojianyuyEntity) {
		try {
			BeanUtils.copyProperties(this, baojianyuyEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
