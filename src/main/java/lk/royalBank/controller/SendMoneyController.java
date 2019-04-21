package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.SendMoneyDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/sendmoney")
public class SendMoneyController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public SendMoneyController() {

        restTemplate = new RestTemplate();
    }
    @HystrixCommand(fallbackMethod = "sendMoneyFallBack", commandKey = "sendMoney", groupKey = "sendMoney")
    @PostMapping
    public void sendMoney(@RequestBody SendMoneyDTO sendMoneyDTO) {

        restTemplate.postForEntity(servertwo + "sendmoney", sendMoneyDTO, null);
    }

    public void sendMoneyFallBack(SendMoneyDTO sendMoneyDTO) {

        restTemplate.postForEntity(serverthree + "sendmoney", sendMoneyDTO, null);
    }
}