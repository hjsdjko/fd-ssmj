package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import com.entity.BaojianxinxiEntity;
import com.entity.YonghuxinxiEntity;
import com.service.BaojianxinxiService;
import com.service.YonghuxinxiService;
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

import com.entity.BaojianyuyEntity;

import com.service.BaojianyuyService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 包间预约表
 * 后端接口
 * @author
 * @email
 * @date 2021-02-19
*/
@RestController
@Controller
@RequestMapping("/baojianyuy")
public class BaojianyuyController {
    private static final Logger logger = LoggerFactory.getLogger(BaojianyuyController.class);

    @Autowired
    private BaojianyuyService baojianyuyService;

    @Autowired
    private YonghuxinxiService yonghuxinxiService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        Object role = request.getSession().getAttribute("role");
        PageUtils page = null;
        if(role.equals("用户")){
            params.put("yh",request.getSession().getAttribute("userId"));
            page = baojianyuyService.queryPage(params);
        }else{
            page = baojianyuyService.queryPage(params);
        }
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        BaojianyuyEntity baojianyuy = baojianyuyService.selectById(id);
        if(baojianyuy!=null){
            return R.ok().put("data", baojianyuy);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody BaojianyuyEntity baojianyuy, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<BaojianyuyEntity> queryWrapper = new EntityWrapper<BaojianyuyEntity>()
            .eq("bjnumber", baojianyuy.getBjnumber())
            .eq("yh_types", baojianyuy.getYhTypes());
        logger.info("sql语句:"+queryWrapper.getSqlSegment());

        YonghuxinxiEntity yonghu = yonghuxinxiService.selectById((Integer) request.getSession().getAttribute("userId"));
        if(yonghu != null){
            if(yonghu.getRemaining() > 0 && yonghu.getRemaining() != null){
                Double q = Double.valueOf(yonghu.getRemaining()) - baojianyuy.getMoney();
                if(q > 0){
                    yonghu.setRemaining(q);
                    yonghuxinxiService.updateById(yonghu);
                }else{
                    return R.error(511,"余额不足请充值");
                }
            }else{
                return R.error(511,"余额不足请充值");
            }

        } else {
            return R.error(511,"请登录后在预约");
        }

        BaojianyuyEntity baojianyuyEntity = baojianyuyService.selectOne(queryWrapper);
        if("".equals(baojianyuy.getImgPhoto()) || "null".equals(baojianyuy.getImgPhoto())){
            baojianyuy.setImgPhoto(null);
        }
        if(baojianyuyEntity==null){
            baojianyuy.setYhTypes((Integer) request.getSession().getAttribute("userId"));
            baojianyuyService.insert(baojianyuy);
            return R.ok();
        }else {
            return R.error(511,"不可以重复预约哦");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody BaojianyuyEntity baojianyuy){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<BaojianyuyEntity> queryWrapper = new EntityWrapper<BaojianyuyEntity>()
            .notIn("id",baojianyuy.getId())
            .eq("bjnumber", baojianyuy.getBjnumber())
            .eq("bjname", baojianyuy.getBjname())
            .eq("yh_types", baojianyuy.getYhTypes())
            .eq("notice_content", baojianyuy.getNoticeContent())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BaojianyuyEntity baojianyuyEntity = baojianyuyService.selectOne(queryWrapper);
        if("".equals(baojianyuy.getImgPhoto()) || "null".equals(baojianyuy.getImgPhoto())){
                baojianyuy.setImgPhoto(null);
        }
                baojianyuy.setNoticeTime(new Date());
        if(baojianyuyEntity==null){
            baojianyuyService.updateById(baojianyuy);//根据id更新
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
        baojianyuyService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

