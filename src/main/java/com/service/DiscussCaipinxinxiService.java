package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussCaipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussCaipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussCaipinxinxiView;


/**
 * 菜品评论表
 *
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface DiscussCaipinxinxiService extends IService<DiscussCaipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussCaipinxinxiVO> selectListVO(Wrapper<DiscussCaipinxinxiEntity> wrapper);
   	
   	DiscussCaipinxinxiVO selectVO(@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);
   	
   	List<DiscussCaipinxinxiView> selectListView(Wrapper<DiscussCaipinxinxiEntity> wrapper);
   	
   	DiscussCaipinxinxiView selectView(@Param("ew") Wrapper<DiscussCaipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussCaipinxinxiEntity> wrapper);
   	
}

