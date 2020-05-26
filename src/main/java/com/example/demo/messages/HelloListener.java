package com.example.demo.messages;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloBinding.class)
public class HelloListener {
	/*In Spring Cloud Stream, sink is used to consume message from queue. @StreamListener(target = Sink.INPUT)*/
    @StreamListener(target = HelloBinding.GREETING)
    public void processHelloChannelGreeting(String msg) {
        System.out.println(msg);
    }
}