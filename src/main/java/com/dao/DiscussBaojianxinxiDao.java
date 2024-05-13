package com.dao;

import com.entity.DiscussBaojianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussBaojianxinxiVO;
import com.entity.view.DiscussBaojianxinxiView;


/**
 * 包间评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface DiscussBaojianxinxiDao extends BaseMapper<DiscussBaojianxinxiEntity> {
	
	List<DiscussBaojianxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);
	
	DiscussBaojianxinxiVO selectVO(@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);
	
	List<DiscussBaojianxinxiView> selectListView(@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);

	List<DiscussBaojianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);
	
	DiscussBaojianxinxiView selectView(@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);
	
}
