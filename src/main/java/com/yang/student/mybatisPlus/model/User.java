package com.yang.student.mybatisPlus.model;

/**
 * Created by Miracle Yang～ on 2021/6/21 10:07 上午
 */

import lombok.Data;

import java.time.LocalDateTime;

/**
 * mybatis-plus测试实体
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;
}
