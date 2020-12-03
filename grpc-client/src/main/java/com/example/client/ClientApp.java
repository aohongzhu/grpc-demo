package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 *  客户端app
 * </p>
 *
 * @author Aohongzhu
 * @since 2020年12月03日
 */
@SpringBootApplication(scanBasePackages = "com.example.client")
@EnableDiscoveryClient
public class ClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }
}
