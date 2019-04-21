package lk.royalBank.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/employees")
public class EmployeeController {
    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";

    public EmployeeController() {

        restTemplate = new RestTemplate();
    }
    @HystrixCommand(fallbackMethod = "addEmployeeFallBack", commandKey = "addEmployee", groupKey = "addEmployee")
    @PostMapping(value = "/{id}")
    public void addEmployee(@PathVariable("id") String empID, @RequestBody EmployeeDTO employeeDTO) {
        restTemplate.postForEntity(servertwo+"employees/"+empID,employeeDTO,null);
    }

    public void addEmployeeFallBack(String empID, EmployeeDTO employeeDTO) {
        restTemplate.postForEntity(serverone+"employees/"+empID,employeeDTO,null);
    }

    @HystrixCommand(fallbackMethod = "findbyIDFallBack", commandKey = "findbyID", groupKey = "findbyID")
    @GetMapping(value = "/{empID}")
    public EmployeeDTO findbyID(@PathVariable("empID") String empID){
        return restTemplate.getForEntity(servertwo+"employees/"+empID,EmployeeDTO.class).getBody();
    }

    public EmployeeDTO findbyIDFallBack( String empID){
        return restTemplate.getForEntity(serverone+"employees/"+empID,EmployeeDTO.class).getBody();
    }
}
