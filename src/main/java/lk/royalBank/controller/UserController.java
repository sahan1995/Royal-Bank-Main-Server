package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.LoginDTO;
import lk.royalBank.dto.LoginUserDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {


    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public UserController() {

        restTemplate = new RestTemplate();
    }
    @HystrixCommand(fallbackMethod = "loginFallBack", commandKey = "login", groupKey = "login")
    @PostMapping(path = "/login")
    public LoginUserDTO login(@RequestBody LoginDTO loginDTO){
        System.out.println(loginDTO.getUserName());
       return restTemplate.postForEntity(servertwo+"users/login",loginDTO,LoginUserDTO.class).getBody();
    }
    public LoginUserDTO loginFallBack(@RequestBody LoginDTO loginDTO){
        System.out.println(loginDTO.getUserName());
        return restTemplate.postForEntity(serverthree+"users/login",loginDTO,LoginUserDTO.class).getBody();
    }

}
