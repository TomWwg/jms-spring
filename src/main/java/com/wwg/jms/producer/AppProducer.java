package com.wwg.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wwg on 2017/11/6.
 */
public class AppProducer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 0; i<100; i++){
            service.sendMessage("test" + i);
        }
        context.close();
    }
}
