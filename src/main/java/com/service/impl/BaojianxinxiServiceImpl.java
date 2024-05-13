package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.BaojianxinxiDao;
import com.entity.BaojianxinxiEntity;
import com.service.BaojianxinxiService;
import com.entity.view.BaojianxinxiView;

/**
 * 包间信息表 服务实现类
 * @author 
 * @since 2021-02-19
 */
@Service("baojianxinxiService")
@Transactional
public class BaojianxinxiServiceImpl extends ServiceImpl<BaojianxinxiDao, BaojianxinxiEntity> implements BaojianxinxiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BaojianxinxiView> page =new Query<BaojianxinxiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
