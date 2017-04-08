package com.shanqiu.rabbitmq;

/**
 * Created by qiyuefei on 2017/4/6.
 */
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息队列接收类
 */
@Component
@RabbitListener(queues = "hello")
public class DemoRabbitMqReceiver {

    @RabbitHandler
    public void process(String content) {
//        System.out.println("Receiver : " + content);
    }

}
