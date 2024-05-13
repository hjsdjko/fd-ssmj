package com.dao;

import com.entity.LeixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LeixingView;

/**
 * 类型表 Dao 接口
 *
 * @author 
 * @since 2021-02-19
 */
public interface LeixingDao extends BaseMapper<LeixingEntity> {

   List<LeixingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
