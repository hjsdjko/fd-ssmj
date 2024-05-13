package com.dao;

import com.entity.DiscussCaipinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussCaipinxinxiVO;
import com.entity.view.DiscussCaipinxinxiView;


/**
 * 菜品评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface DiscussCaipinxinxiDao extends BaseMapper<DiscussCaipinxinxiEntity> {
	
	List<DiscussCaipinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);
	
	DiscussCaipinxinxiVO selectVO(@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);
	
	List<DiscussCaipinxinxiView> selectListView(@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);

	List<DiscussCaipinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);
	
	DiscussCaipinxinxiView selectView(@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);
	
}
