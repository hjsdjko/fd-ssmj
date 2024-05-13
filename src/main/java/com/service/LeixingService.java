package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeixingEntity;
import java.util.Map;

/**
 * 类型表 服务类
 * @author 
 * @since 2021-02-19
 */
public interface LeixingService extends IService<LeixingEntity> {

     PageUtils queryPage(Map<String, Object> params);

}