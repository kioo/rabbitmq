package person.wangchi.rabbitmq.service;

import person.wangchi.rabbitmq.po.Mail;

/**
 * 定义一个发送消息的接口
 */
public interface Producer {
    public void sendMail(String queue, Mail mail);
}
