package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojianyuyEntity;
import java.util.Map;

/**
 * 包间预约表 服务类
 * @author 
 * @since 2021-02-19
 */
public interface BaojianyuyService extends IService<BaojianyuyEntity> {

     PageUtils queryPage(Map<String, Object> params);

}