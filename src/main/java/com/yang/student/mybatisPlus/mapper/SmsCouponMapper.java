package com.yang.student.mybatisPlus.mapper;

import com.yang.student.mybatisPlus.entity.SmsCoupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang.student.mybatisPlus.entity.User;

import java.util.List;

/**
 * <p>
 * 优惠券信息 Mapper 接口
 * </p>
 *
 * @author Yang
 * @since 2021-06-21
 */
public interface SmsCouponMapper extends BaseMapper<SmsCoupon> {

    List<User> getInfo();

}
