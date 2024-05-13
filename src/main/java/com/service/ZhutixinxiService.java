package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhutixinxiEntity;
import java.util.Map;

/**
 *  服务类
 * @author 
 * @since 2021-02-20
 */
public interface ZhutixinxiService extends IService<ZhutixinxiEntity> {

     PageUtils queryPage(Map<String, Object> params);

}