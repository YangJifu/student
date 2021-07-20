package com.yang.student.mybatisPlus.controller;


import com.yang.student.mybatisPlus.entity.SmsCoupon;
import com.yang.student.mybatisPlus.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
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
@Api("优惠券信息")
public class SmsCouponController {

    @PostMapping("/test")
    @ApiOperation("测试")
    public List<User> test(@ApiParam("123") String user){
        return new ArrayList<>();
    }
}
