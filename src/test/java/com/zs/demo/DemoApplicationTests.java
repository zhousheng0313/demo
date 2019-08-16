package com.zs.demo;

import com.zs.demo.rabbitmq.producer.MsgProducer;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    StringEncryptor stringEncryptor;

    @Autowired
    private MsgProducer msgProducer;

    @Test
    public void contextLoads() {

    }

    @Test
    public void encryptPwd() {
        String result = stringEncryptor.encrypt("root");
        System.out.println(result);
    }

    @Test
    public void rabbitMQSend(){
        for (int i = 0;i < 100;i++){
            try {
                msgProducer.sendMsg("testRabbitMQ"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
