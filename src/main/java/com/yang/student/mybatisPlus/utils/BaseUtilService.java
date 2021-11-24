package com.yang.student.mybatisPlus.utils;

import org.springframework.stereotype.Component;

/**
 * 通用返回服务 Yang～ on 2021/11/23 14:47
 */
@Component
public class BaseUtilService {
    public static <T> BaseResponse<T> success(T t){
        BaseResponse<T> returnResult = new BaseResponse<>();
        returnResult.setCode(GetSetCodeEnum.SUCCESS.getCode());
        returnResult.setMessage(GetSetCodeEnum.SUCCESS.getName());
        returnResult.setData(t);
        return returnResult;
    }
    public static<T> BaseResponse<T> error(T t){
        BaseResponse<T> returnResult = new BaseResponse<>();
        returnResult.setCode(GetSetCodeEnum.ERROR.getCode());
        returnResult.setMessage(GetSetCodeEnum.ERROR.getName());
        returnResult.setData(t);
        return returnResult;
    }
}
