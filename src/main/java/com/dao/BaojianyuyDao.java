package com.dao;

import com.entity.BaojianyuyEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojianyuyView;

/**
 * 包间预约表 Dao 接口
 *
 * @author 
 * @since 2021-02-19
 */
public interface BaojianyuyDao extends BaseMapper<BaojianyuyEntity> {

   List<BaojianyuyView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
