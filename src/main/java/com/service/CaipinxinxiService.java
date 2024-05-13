package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinxinxiEntity;
import java.util.Map;

/**
 * 菜品表 服务类
 * @author 
 * @since 2021-02-19
 */
public interface CaipinxinxiService extends IService<CaipinxinxiEntity> {

     PageUtils queryPage(Map<String, Object> params);

}