package cn.silentims.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description: TODO
 * @author: xiangjx
 * @created: 2020/06/01 22:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private  Long id;
    private  String serial;
}
