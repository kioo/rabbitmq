package person.wangchi.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置 Direct 类型的 Exchange 绑定到指定的队列上
 * 步骤：
 * 1. 添加 @Configuration 注解，使 该类成为配置类
 * 2. 定义一个返回 Exchange 对象的方法
 * 3. 定义一个返回 Queue 对象的方法
 * 4. 定义一个返回 Binding 对象，用来绑定 Exchange 和 Queue 对象
 */
@Configuration
public class DirectExchangeConfig {

    @Bean
    public DirectExchange directExchange(){
        DirectExchange directExchange = new DirectExchange("direct");
        return directExchange;
    }

    @Bean
    public Queue directQueue1(){
        return new Queue("directqueue1");
    }

    @Bean
    public Binding bindingorange(){
        Binding binding = BindingBuilder.bind(directQueue1()).to(directExchange()).with("orange");
        return binding;
    }
}
