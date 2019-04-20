package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.ClientDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/clients")
public class ClientController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public ClientController() {

        restTemplate = new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "findByIDFallBack", commandKey = "findByID", groupKey = "findByID")
    @GetMapping(value = "/{ID}")
    public ClientDTO findByID(@PathVariable("ID") String clientID){
        return  restTemplate.getForEntity(serverone+"clients/"+clientID,ClientDTO.class).getBody();

    }

    public ClientDTO findByIDFallBack(String clientID){
        return  restTemplate.getForEntity(servertwo+"clients/"+clientID,ClientDTO.class).getBody();

    }
}
