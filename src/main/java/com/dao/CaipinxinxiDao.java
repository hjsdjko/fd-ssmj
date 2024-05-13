package com.dao;

import com.entity.CaipinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinxinxiView;

/**
 * 菜品表 Dao 接口
 *
 * @author 
 * @since 2021-02-19
 */
public interface CaipinxinxiDao extends BaseMapper<CaipinxinxiEntity> {

   List<CaipinxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
