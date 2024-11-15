package com.rifle.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回
 *
 * @param <T> 数据泛型
 */
@Data
public class CommonResult<T> implements Serializable {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 错误提示，用户可阅读
     */
    private String msg;

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = 1;
        result.data = data;
        result.msg = "操作成功";
        return result;
    }

    public static <T> CommonResult<T> error(Integer code, String msg) {
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.msg = msg;
        return result;
    }
}
