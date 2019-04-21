package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.WidthdrawDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/withdraws")
public class WithdrawController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public WithdrawController() {

        restTemplate = new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "withdrawFallBack", commandKey = "withdraw", groupKey = "withdraw")
    @PostMapping
    public void withdraw(@RequestBody WidthdrawDTO widthdrawDTO){

        restTemplate.postForEntity(servertwo+"withdraw",widthdrawDTO,null);

    }
    public void withdrawFallBack( WidthdrawDTO widthdrawDTO){

        restTemplate.postForEntity(serverthree+"withdraw",widthdrawDTO,null);

    }

}
