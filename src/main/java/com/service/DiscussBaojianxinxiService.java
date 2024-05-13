package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussBaojianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussBaojianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussBaojianxinxiView;


/**
 * 包间评论表
 *
 * @author 
 * @email 
 * @date 2020-12-24 11:35:16
 */
public interface DiscussBaojianxinxiService extends IService<DiscussBaojianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussBaojianxinxiVO> selectListVO(Wrapper<DiscussBaojianxinxiEntity> wrapper);
   	
   	DiscussBaojianxinxiVO selectVO(@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);
   	
   	List<DiscussBaojianxinxiView> selectListView(Wrapper<DiscussBaojianxinxiEntity> wrapper);
   	
   	DiscussBaojianxinxiView selectView(@Param("ew") Wrapper<DiscussBaojianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussBaojianxinxiEntity> wrapper);
   	
}

