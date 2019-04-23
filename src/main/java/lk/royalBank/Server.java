package lk.royalBank;

import lk.royalBank.config.RibbonCongisuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


//
@EnableHystrix
@EnableCircuitBreaker
@SpringBootApplication
@RibbonClient(name = "ping-server",configuration = RibbonCongisuration.class)
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
