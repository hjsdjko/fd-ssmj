package com.dao;

import com.entity.BaojianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojianxinxiView;

/**
 * 包间信息表 Dao 接口
 *
 * @author 
 * @since 2021-02-19
 */
public interface BaojianxinxiDao extends BaseMapper<BaojianxinxiEntity> {

   List<BaojianxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
