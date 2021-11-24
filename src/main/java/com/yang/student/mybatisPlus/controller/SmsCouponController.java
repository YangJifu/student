package com.yang.student.mybatisPlus.controller;


import com.yang.student.mybatisPlus.entity.User;
import com.yang.student.mybatisPlus.mapper.SmsCouponMapper;
import com.yang.student.mybatisPlus.utils.BaseResponse;
import com.yang.student.mybatisPlus.utils.BaseUtilService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author Yang
 * @since 2021-06-21
 */
@RestController
@RequestMapping("/sms-coupon")
@Api(tags = "优惠券信息")
public class SmsCouponController {
    @Autowired
    private BaseUtilService baseUtilService;

    @Autowired
    private SmsCouponMapper smsCouponMapper;

    @GetMapping("/test")
    @ApiOperation("测试")
    public BaseResponse test(@RequestParam String user){
        List<User> info = smsCouponMapper.getInfo();
        return baseUtilService.success(info);
    }
    @GetMapping("/test2")
    @ApiOperation("测试")
    public BaseResponse test2(){
        return baseUtilService.success("success");
    }
}
