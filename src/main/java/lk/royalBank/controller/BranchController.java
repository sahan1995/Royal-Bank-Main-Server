package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.BranchDTO;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/branches")
public class BranchController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public BranchController() {

        restTemplate = new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "findAllFallBack", commandKey = "findAll", groupKey = "findAll")
    @GetMapping
    public List<BranchDTO> findAll() {
        ResponseEntity<List<BranchDTO>> exchange = restTemplate.exchange(serverone + "branches", HttpMethod.GET, null, new ParameterizedTypeReference<List<BranchDTO>>() {
        });
        List<BranchDTO> list = exchange.getBody();
        return list;
    }

    public List<BranchDTO> findAllFallBack() {
        ResponseEntity<List<BranchDTO>> exchange = restTemplate.exchange(serverthree + "branches", HttpMethod.GET, null, new ParameterizedTypeReference<List<BranchDTO>>() {
        });
        List<BranchDTO> list = exchange.getBody();
        return list;
    }

    @HystrixCommand(fallbackMethod = "findByIDFallBack", commandKey = "findByID", groupKey = "findByID")
    @GetMapping(value = "/{ID}")
    public BranchDTO findByID(@PathVariable("ID") String Id) {
        return restTemplate.getForEntity(serverthree + "branches/" + Id, BranchDTO.class).getBody();
    }

    public BranchDTO findByIDFallBack(String Id) {
        return restTemplate.getForEntity(serverone + "branches/" + Id, BranchDTO.class).getBody();
    }
}
