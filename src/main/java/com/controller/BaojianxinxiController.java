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

import com.entity.BaojianxinxiEntity;

import com.service.BaojianxinxiService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 包间信息表
 * 后端接口
 * @author
 * @email
 * @date 2021-02-19
*/
@RestController
@Controller
@RequestMapping("/baojianxinxi")
public class BaojianxinxiController {
    private static final Logger logger = LoggerFactory.getLogger(BaojianxinxiController.class);

    @Autowired
    private BaojianxinxiService baojianxinxiService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = baojianxinxiService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        BaojianxinxiEntity baojianxinxi = baojianxinxiService.selectById(id);
        if(baojianxinxi!=null){
            return R.ok().put("data", baojianxinxi);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody BaojianxinxiEntity baojianxinxi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<BaojianxinxiEntity> queryWrapper = new EntityWrapper<BaojianxinxiEntity>()
            .eq("bjnumber", baojianxinxi.getBjnumber())
            .eq("bjname", baojianxinxi.getBjname())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BaojianxinxiEntity baojianxinxiEntity = baojianxinxiService.selectOne(queryWrapper);
        if("".equals(baojianxinxi.getImgPhoto()) || "null".equals(baojianxinxi.getImgPhoto())){
            baojianxinxi.setImgPhoto(null);
        }
        if(baojianxinxiEntity==null){
            baojianxinxiService.insert(baojianxinxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody BaojianxinxiEntity baojianxinxi, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<BaojianxinxiEntity> queryWrapper = new EntityWrapper<BaojianxinxiEntity>()
            .notIn("id",baojianxinxi.getId())
            .eq("bjnumber", baojianxinxi.getBjnumber())
            .eq("bjname", baojianxinxi.getBjname())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BaojianxinxiEntity baojianxinxiEntity = baojianxinxiService.selectOne(queryWrapper);
        if("".equals(baojianxinxi.getImgPhoto()) || "null".equals(baojianxinxi.getImgPhoto())){
                baojianxinxi.setImgPhoto(null);
        }
        if(baojianxinxiEntity==null){
            baojianxinxiService.updateById(baojianxinxi);//根据id更新
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
        baojianxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

