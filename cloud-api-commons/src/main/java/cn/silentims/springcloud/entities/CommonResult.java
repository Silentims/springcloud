package cn.silentims.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description: TODO
 * @author: xiangjx
 * @created: 2020/06/01 22:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private  Integer code;
    private  String message;
    private  T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}