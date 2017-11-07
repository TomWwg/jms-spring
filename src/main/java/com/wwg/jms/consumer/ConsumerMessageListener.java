package com.wwg.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by wwg on 2017/11/6.
 */
public class ConsumerMessageListener implements MessageListener {

    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("接收消息" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
