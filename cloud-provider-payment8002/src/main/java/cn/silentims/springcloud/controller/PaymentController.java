package cn.silentims.springcloud.controller;

import cn.silentims.springcloud.entities.CommonResult;
import cn.silentims.springcloud.entities.Payment;
import cn.silentims.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: TODO
 * @author: xiangjx
 * @created: 2020/06/01 16:25
 */
@RestController
@Slf4j
@SuppressWarnings("unchecked")
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****数据插入成功："+result);

        if (result > 0){
            return new CommonResult(200,"插入数据成功,server port:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****数据查询成功："+payment);

        if (payment != null){
            return new CommonResult(200,"查询数据成功,server port:"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询数据失败,无对应记录，id:"+id,null);
        }
    }
}
