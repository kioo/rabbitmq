package person.wangchi.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import person.wangchi.rabbitmq.po.Mail;
import person.wangchi.rabbitmq.service.impl.ProducerImpl;

@RestController
public class RabbitMQController {

    @Autowired
    ProducerImpl producer;

    @RequestMapping(value="/produce",produces = {"application/json;charset=UTF-8"})
    public void produce(){
        Mail m = new Mail();
        m.setCountry("shanghai");
        m.setMailId("iwevwe");
        m.setWeight(23l);
        producer.sendMail("directqueue1",m);
    }
}
