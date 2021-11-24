package com.yang.student.mybatisPlus.entity;

/**
 * Created by Miracle Yang～ on 2021/6/21 10:07 上午
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * mybatis-plus测试实体
 */
@Data
@ApiModel("mybatis-plus测试实体")
public class User {
    @ApiModelProperty("id")
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;
    private BigDecimal tradeScale;

    public BigDecimal getTradeScale() {
        return tradeScale;
    }

    public void setTradeScale(BigDecimal tradeScale) {
        this.tradeScale = tradeScale;
    }
}
