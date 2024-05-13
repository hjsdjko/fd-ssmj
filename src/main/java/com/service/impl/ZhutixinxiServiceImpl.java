package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.ZhutixinxiDao;
import com.entity.ZhutixinxiEntity;
import com.service.ZhutixinxiService;
import com.entity.view.ZhutixinxiView;

/**
 *  服务实现类
 * @author 
 * @since 2021-02-20
 */
@Service("zhutixinxiService")
@Transactional
public class ZhutixinxiServiceImpl extends ServiceImpl<ZhutixinxiDao, ZhutixinxiEntity> implements ZhutixinxiService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ZhutixinxiView> page =new Query<ZhutixinxiView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
