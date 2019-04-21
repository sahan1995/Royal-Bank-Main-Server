package lk.royalBank.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lk.royalBank.dto.ATMcardDTO;
import lk.royalBank.dto.BankAccountDTO;
import lk.royalBank.dto.UserDTO;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/accounts")
public class BankAccountController {

    RestTemplate restTemplate;
    private String serverone = "http://192.168.1.101:8080/api/v1/";
    private String servertwo = "http://192.168.1.101:8082/api/v1/";
    private String serverthree = "http://192.168.1.101:8083/api/v1/";
    public BankAccountController() {

        restTemplate = new RestTemplate();
    }

    @HystrixCommand(fallbackMethod = "createAccountFallBack",commandKey = "createAccount",groupKey = "createAccount")
    @PostMapping(value = "/{id}")
    public void createAccount(@PathVariable("id") String accountNumber, @RequestBody BankAccountDTO bankAccountDTO){
        restTemplate.postForEntity(serverone+"account/"+accountNumber,bankAccountDTO,null);
    }

    public void createAccountFallBack( String accountNumber, BankAccountDTO bankAccountDTO){
        System.out.println(bankAccountDTO);
        restTemplate.postForEntity(serverthree+"account/"+accountNumber,bankAccountDTO,null);
    }


    @HystrixCommand(fallbackMethod = "checkBalanceFallBack",commandKey = "checkBalance",groupKey = "checkBalance")
    @GetMapping(path = "/checkBalance")
    public double checkBalance(@RequestParam("accountNumber")String accountNumber){
        Double balance = restTemplate.getForEntity(serverone+"account/checkBalance" + accountNumber, Double.class).getBody();
        return balance;

    }


    public double checkBalanceFallBack(String accountNumber){
        Double balance = restTemplate.getForEntity(servertwo+"account/checkBalance" + accountNumber, Double.class).getBody();
        return balance;
    }

    @HystrixCommand(fallbackMethod = "accountByIDFallBack",commandKey = "accountByID",groupKey = "accountByID")
    @GetMapping(value = {"/{accNO}"})
    public BankAccountDTO accountByID(@PathVariable("accNO") String accno){

         return restTemplate.getForEntity(serverone+"account/"+accno,BankAccountDTO.class).getBody();
    }

    public BankAccountDTO accountByIDFallBack(String accno){

        return restTemplate.getForEntity(serverthree+"account/"+accno,BankAccountDTO.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "doTransactionFallBack",commandKey = "doTransaction",groupKey = "doTransaction")
    @PutMapping(path = "/doTransaction")
    public void doTransaction(@RequestParam("type") String type,@RequestParam("accno") String accno, @RequestParam("amount") Double amount){
        restTemplate.postForEntity(serverone+"account/doTransaction?type="+type+"&accno"+accno+"&amount"+amount,null,null);
    }

    public void doTransactionFallBack(String type,String accno, Double amount){
        restTemplate.postForEntity(serverthree+"account/doTransaction?type="+type+"&accno"+accno+"&amount"+amount,null,null);
    }



}
