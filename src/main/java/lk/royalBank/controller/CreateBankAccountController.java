package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.CreateAccountDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/createaccount")
public class CreateBankAccountController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public CreateBankAccountController() {

        restTemplate = new RestTemplate();
    }
    @HystrixCommand(fallbackMethod = "createNewAccountFallBack", commandKey = "createNewAccount", groupKey = "createNewAccount")
    @PostMapping
    public void createNewAccount(@RequestBody CreateAccountDTO createAccountDTO){
        restTemplate.postForEntity(serverone+"createaccount",createAccountDTO,null);

    }
    public void createNewAccountFallBack(CreateAccountDTO createAccountDTO){
        restTemplate.postForEntity(servertwo+"createaccount",createAccountDTO,null);

    }
}
