package com.shanqiu.rabbitmq;

/**
 * Created by qiyuefei on 2017/4/6.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试Rabbit MQ
 */
@RestController
@RequestMapping(value="/rabbitmq")
public class DemoRabbitMqController {

    @Autowired
    private DemoRabbitMqSender demoRabbitMqSender;

    /**
     * 发送测试消息队列
     */
    @RequestMapping(value = "/addRabbitMq", method = RequestMethod.GET)
    public String addEntity() {
        long start= System.currentTimeMillis();
        System.out.println("start : " + start);
        for(int i =0;i<10000;i++){
            demoRabbitMqSender.send(i+"wwww");
        }
        long end = System.currentTimeMillis();
        System.out.println("end : " + end);
        System.out.println("end -start : " + (end -start));
        return (end -start)+"";
    }

}



