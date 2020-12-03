package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * 服务端app
 * </p>
 *
 * @author Aohongzhu
 * @since 2020年12月03日
 */
@SpringBootApplication(scanBasePackages = "com.example.server")
@EnableDiscoveryClient
public class ServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }
}
