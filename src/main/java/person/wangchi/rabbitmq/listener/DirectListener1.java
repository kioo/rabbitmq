package person.wangchi.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import person.wangchi.rabbitmq.po.Mail;

/**
 * 定义接收器
 * 1、使用 @Component 修饰类
 * 2、使用 @RabbitListener 注解在方法上添加要监听的 队列，然后该方法接受队列发送的消息
 */
@Component
public class DirectListener1 {

    @RabbitListener(queues = "directqueue1")
    public void displayMail(Mail mail) throws Exception{
        System.out.println("directqueue1队列监听器1号收到消息"+mail.toString());
    }
}
