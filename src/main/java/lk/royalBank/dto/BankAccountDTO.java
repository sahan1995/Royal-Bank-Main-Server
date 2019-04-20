package lk.royalBank.dto;

import java.util.List;

public class BankAccountDTO {

    private
    String accountNumber;
    private double amount;
    private String createdAt;
    private String accountType;


    private ClientDTO clientDTO;
    private EmployeeDTO employeeDTO;
    private ATMcardDTO atMcardDTO;
    private List<DepositDTO> depositDTOS;
    private List<WidthdrawDTO> widthdrawDTOS;
    private List<SendMoneyDTO> sendMoneyDTOS;


    public BankAccountDTO(String accountNumber, double amount, String createdAt, String accountType) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.createdAt = createdAt;
        this.accountType = accountType;
    }

    public BankAccountDTO(String accountNumber, double amount, String createdAt, String accountType, ClientDTO clientDTO, EmployeeDTO employeeDTO) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.createdAt = createdAt;
        this.accountType = accountType;
        this.clientDTO = clientDTO;
        this.employeeDTO = employeeDTO;
    }

    public BankAccountDTO(String accountNumber, double amount, String createdAt, String accountType, ClientDTO clientDTO) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.createdAt = createdAt;
        this.accountType = accountType;
        this.clientDTO = clientDTO;
    }

    public BankAccountDTO() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ClientDTO getClientDTO() {
        return clientDTO;
    }

    public void setClientDTO(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public ATMcardDTO getAtMcardDTO() {
        return atMcardDTO;
    }

    public void setAtMcardDTO(ATMcardDTO atMcardDTO) {
        this.atMcardDTO = atMcardDTO;
    }

    public List<DepositDTO> getDepositDTOS() {
        return depositDTOS;
    }

    public void setDepositDTOS(List<DepositDTO> depositDTOS) {
        this.depositDTOS = depositDTOS;
    }

    public List<WidthdrawDTO> getWidthdrawDTOS() {
        return widthdrawDTOS;
    }

    public void setWidthdrawDTOS(List<WidthdrawDTO> widthdrawDTOS) {
        this.widthdrawDTOS = widthdrawDTOS;
    }

    public List<SendMoneyDTO> getSendMoneyDTOS() {
        return sendMoneyDTOS;
    }

    public void setSendMoneyDTOS(List<SendMoneyDTO> sendMoneyDTOS) {
        this.sendMoneyDTOS = sendMoneyDTOS;
    }

    @Override
    public String toString() {
        return "BankAccountDTO{" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                ", createdAt='" + createdAt + '\'' +
                ", accountType='" + accountType + '\'' +
                ", clientDTO=" + clientDTO +
                ", employeeDTO=" + employeeDTO +
                ", atMcardDTO=" + atMcardDTO +
                ", depositDTOS=" + depositDTOS +
                ", widthdrawDTOS=" + widthdrawDTOS +
                ", sendMoneyDTOS=" + sendMoneyDTOS +
                '}';
    }
}
