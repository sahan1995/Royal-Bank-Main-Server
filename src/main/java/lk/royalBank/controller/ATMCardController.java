package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.ATMcardDTO;
import lk.royalBank.dto.BankAccountDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("api/v1/atmcards")
public class ATMCardController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";
    public ATMCardController() {

        restTemplate = new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "saveFallBack",commandKey = "save",groupKey = "save")
    @PostMapping
    public void save(@RequestBody ATMcardDTO atMcardDTO){
        restTemplate.postForEntity(serverone+"atmcards",atMcardDTO,null);

    }


    public void saveFallBack( ATMcardDTO atMcardDTO){
        restTemplate.postForEntity(serverthree+"atmcards",atMcardDTO,null);

    }
    @HystrixCommand(fallbackMethod = "atmLoginFallBack",commandKey = "atmLogin",groupKey = "atmLogin")
    @GetMapping(value = "login/{pin}")
    public BankAccountDTO atmLogin(@PathVariable("pin") String pin){
        return restTemplate.getForEntity(serverone+"atmcards/login"+pin,BankAccountDTO.class).getBody();
    }


    public BankAccountDTO atmLoginFallBack(String pin){
        return restTemplate.getForEntity(serverone+"atmcards/login"+pin,BankAccountDTO.class).getBody();
    }
}
