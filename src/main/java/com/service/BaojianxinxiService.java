package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojianxinxiEntity;
import java.util.Map;

/**
 * 包间信息表 服务类
 * @author 
 * @since 2021-02-19
 */
public interface BaojianxinxiService extends IService<BaojianxinxiEntity> {

     PageUtils queryPage(Map<String, Object> params);

}