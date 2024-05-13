package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.LeixingDao;
import com.entity.LeixingEntity;
import com.service.LeixingService;
import com.entity.view.LeixingView;

/**
 * 类型表 服务实现类
 * @author 
 * @since 2021-02-19
 */
@Service("leixingService")
@Transactional
public class LeixingServiceImpl extends ServiceImpl<LeixingDao, LeixingEntity> implements LeixingService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<LeixingView> page =new Query<LeixingView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
