package com.spring.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


    @MessageMapping("/helloGAN")
    @SendTo("/topic/greetings")
    public Greeting greetingGAN(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello GAN friend, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
    
    @MessageMapping("/helloGM")
    @SendTo("/topic/greetings")
    public Greeting greetingGM(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello GM friend, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
