package com.rifle.common.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Schema(description = "通用返回")
@Data
public class CommonResult<T> implements Serializable {

    @Schema(description = "错误码")
    private Integer code;

    @Schema(description = "返回数据")
    private T data;

    @Schema(description = "错误提示，用户可阅读")
    private String msg;

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<>();
        result.code = 1;
        result.data = data;
        result.msg = "";
        return result;
    }

    public static <T> CommonResult<T> error(Integer code, String msg) {
        CommonResult<T> result = new CommonResult<>();
        result.code = code;
        result.msg = msg;
        return result;
    }
}
