package com.lsege.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocketApplication.class, args);
	}



//	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(SocketApplication.class, args);
//		applicationContext.getBean(SocketServer.class).start();//在spring容器启动后，取到已经初始化的SocketServer，启动Socket服务
//	}
}
