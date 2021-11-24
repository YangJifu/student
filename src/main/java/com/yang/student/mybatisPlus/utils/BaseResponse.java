package com.yang.student.mybatisPlus.utils;

import lombok.Data;

/**
 *  通用返回类 Yang～ on 2021/11/23 14:45
 */
@Data
public class BaseResponse<T> {
    private Integer code;
    private String message;
    private T data;
}
