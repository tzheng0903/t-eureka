package cn.evun.test.teureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TEurekaApplication.class, args);
    }

}
