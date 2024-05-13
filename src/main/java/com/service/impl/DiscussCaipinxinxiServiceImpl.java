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


import com.dao.DiscussCaipinxinxiDao;
import com.entity.DiscussCaipinxinxiEntity;
import com.service.DiscussCaipinxinxiService;
import com.entity.vo.DiscussCaipinxinxiVO;
import com.entity.view.DiscussCaipinxinxiView;

@Service("discussCaipinxinxiService")
public class DiscussCaipinxinxiServiceImpl extends ServiceImpl<DiscussCaipinxinxiDao, DiscussCaipinxinxiEntity> implements DiscussCaipinxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussCaipinxinxiEntity> page = this.selectPage(
                new Query<DiscussCaipinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussCaipinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussCaipinxinxiEntity> wrapper) {
		  Page<DiscussCaipinxinxiView> page =new Query<DiscussCaipinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussCaipinxinxiVO> selectListVO(Wrapper<DiscussCaipinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussCaipinxinxiVO selectVO(Wrapper<DiscussCaipinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussCaipinxinxiView> selectListView(Wrapper<DiscussCaipinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussCaipinxinxiView selectView(Wrapper<DiscussCaipinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
