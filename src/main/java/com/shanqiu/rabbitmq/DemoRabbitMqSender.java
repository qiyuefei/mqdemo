package com.shanqiu.rabbitmq;

/**
 * Created by qiyuefei on 2017/4/6.
 */
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoRabbitMqSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String content) {
//        System.out.println("Sender : " + content);
        this.rabbitTemplate.convertAndSend("hello", content);
    }

}

