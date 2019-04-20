package lk.royalBank.dto;

public class ATMcardDTO {
    private String code;

    private String pin;

    private BankAccountDTO bankAccountDTO;

    public ATMcardDTO(String code, String pin) {
        this.code = code;
        this.pin = pin;
    }

    public ATMcardDTO() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public BankAccountDTO getBankAccountDTO() {
        return bankAccountDTO;
    }

    public void setBankAccountDTO(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = bankAccountDTO;
    }

    @Override
    public String toString() {
        return "ATMcardDTO{" +
                "code='" + code + '\'' +
                ", pin='" + pin + '\'' +
                ", bankAccountDTO=" + bankAccountDTO +
                '}';
    }
}
