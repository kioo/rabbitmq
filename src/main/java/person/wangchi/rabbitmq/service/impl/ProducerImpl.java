package person.wangchi.rabbitmq.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import person.wangchi.rabbitmq.po.Mail;

/**
 * producer 实现类
 * 1. 注入 RabbitTemplate 类
 * 2. 调用
 */

@Service("producer")
public class ProducerImpl {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMail(String queue, Mail mail){
        rabbitTemplate.convertAndSend(queue,mail);
    }
}
