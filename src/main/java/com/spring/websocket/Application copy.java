package com.spring.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * 
 * WebSocket is a computer communications protocol, providing full-duplex
 * communication channels over a single TCP connection. WebSocket is a different
 * protocol from HTTP. Both protocols are located at layer 7 in the OSI model
 * and, as such, depend on TCP at layer 4. Although they are different, RFC 6455
 * states that WebSocket "is designed to work over HTTP ports 80 and 443 as well
 * as to support HTTP proxies and intermediaries" thus making it compatible with
 * the HTTP protocol. To achieve compatibility, the WebSocket handshake uses the
 * HTTP Upgrade header[1] to change from the HTTP protocol to the WebSocket
 * protocol. <br/>
 * 
 * https://spring.io/guides/gs/messaging-stomp-websocket/
 * 
 * Simple (or Streaming) Text Oriented Message Protocol (STOMP)
 * http://localhost:8080/ -> Connect
 * 
 * REST API Sample (type: xhr)-
 * http://localhost:8083/gs-guide-websocket/info?t=1539248805369 
 * Websocket sample (type: websocket)-
 * ws://localhost:8083/gs-guide-websocket/954/p1whnbrx/websocket
 * 
 * 101 status code - means switching protocol
 * 
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
