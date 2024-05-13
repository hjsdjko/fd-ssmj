package com.dao;

import com.entity.ZhutixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhutixinxiView;

/**
 *  Dao 接口
 *
 * @author 
 * @since 2021-02-20
 */
public interface ZhutixinxiDao extends BaseMapper<ZhutixinxiEntity> {

   List<ZhutixinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
