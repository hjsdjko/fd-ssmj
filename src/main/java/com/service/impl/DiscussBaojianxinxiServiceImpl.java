package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussBaojianxinxiDao;
import com.entity.DiscussBaojianxinxiEntity;
import com.service.DiscussBaojianxinxiService;
import com.entity.vo.DiscussBaojianxinxiVO;
import com.entity.view.DiscussBaojianxinxiView;

@Service("discussBaojianxinxiService")
public class DiscussBaojianxinxiServiceImpl extends ServiceImpl<DiscussBaojianxinxiDao, DiscussBaojianxinxiEntity> implements DiscussBaojianxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussBaojianxinxiEntity> page = this.selectPage(
                new Query<DiscussBaojianxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussBaojianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussBaojianxinxiEntity> wrapper) {
		  Page<DiscussBaojianxinxiView> page =new Query<DiscussBaojianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussBaojianxinxiVO> selectListVO(Wrapper<DiscussBaojianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussBaojianxinxiVO selectVO(Wrapper<DiscussBaojianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussBaojianxinxiView> selectListView(Wrapper<DiscussBaojianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussBaojianxinxiView selectView(Wrapper<DiscussBaojianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
