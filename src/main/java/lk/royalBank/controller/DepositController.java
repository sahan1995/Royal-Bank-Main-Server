package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.CreateAccountDTO;
import lk.royalBank.dto.DepositDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/deposits")
public class DepositController {
    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public DepositController() {

        restTemplate = new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "depositMoneyFallBack", commandKey = "depositMoney", groupKey = "depositMoney")
    @PostMapping
    public void depositMoney(@RequestBody DepositDTO depositDTO){
        restTemplate.postForEntity(servertwo+"deposits",depositDTO,null);

    }

    public void depositMoneyFallBack(DepositDTO depositDTO){
        restTemplate.postForEntity(serverone+"deposits",depositDTO,null);

    }
}
