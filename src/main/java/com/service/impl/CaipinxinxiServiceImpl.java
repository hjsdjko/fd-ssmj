package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.CaipinxinxiDao;
import com.entity.CaipinxinxiEntity;
import com.service.CaipinxinxiService;
import com.entity.view.CaipinxinxiView;

/**
 * 菜品表 服务实现类
 * @author 
 * @since 2021-02-19
 */
@Service("caipinxinxiService")
@Transactional
public class CaipinxinxiServiceImpl extends ServiceImpl<CaipinxinxiDao, CaipinxinxiEntity> implements CaipinxinxiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CaipinxinxiView> page =new Query<CaipinxinxiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
