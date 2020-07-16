package cn.silentims.springcloud.service.impl;

import cn.silentims.springcloud.dao.PaymentDao;
import cn.silentims.springcloud.entities.Payment;
import cn.silentims.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: TODO
 * @author: xiangjx
 * @created: 2020/06/01 16:14
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
