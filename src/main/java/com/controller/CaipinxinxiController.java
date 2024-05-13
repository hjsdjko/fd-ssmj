package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.CaipinxinxiEntity;

import com.service.CaipinxinxiService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 菜品表
 * 后端接口
 * @author
 * @email
 * @date 2021-02-19
*/
@RestController
@Controller
@RequestMapping("/caipinxinxi")
public class CaipinxinxiController {
    private static final Logger logger = LoggerFactory.getLogger(CaipinxinxiController.class);

    @Autowired
    private CaipinxinxiService caipinxinxiService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = caipinxinxiService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        CaipinxinxiEntity caipinxinxi = caipinxinxiService.selectById(id);
        if(caipinxinxi!=null){
            return R.ok().put("data", caipinxinxi);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody CaipinxinxiEntity caipinxinxi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<CaipinxinxiEntity> queryWrapper = new EntityWrapper<CaipinxinxiEntity>()
            .eq("cpname", caipinxinxi.getCpname())
            .eq("lx_types", caipinxinxi.getLxTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CaipinxinxiEntity caipinxinxiEntity = caipinxinxiService.selectOne(queryWrapper);
        if("".equals(caipinxinxi.getImgPhoto()) || "null".equals(caipinxinxi.getImgPhoto())){
            caipinxinxi.setImgPhoto(null);
        }
        if(caipinxinxiEntity==null){
            caipinxinxiService.insert(caipinxinxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody CaipinxinxiEntity caipinxinxi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<CaipinxinxiEntity> queryWrapper = new EntityWrapper<CaipinxinxiEntity>()
            .notIn("id",caipinxinxi.getId())
            .eq("cpname", caipinxinxi.getCpname())
            .eq("lx_types", caipinxinxi.getLxTypes())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        CaipinxinxiEntity caipinxinxiEntity = caipinxinxiService.selectOne(queryWrapper);
        if("".equals(caipinxinxi.getImgPhoto()) || "null".equals(caipinxinxi.getImgPhoto())){
                caipinxinxi.setImgPhoto(null);
        }
        if(caipinxinxiEntity==null){
            caipinxinxiService.updateById(caipinxinxi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        caipinxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

