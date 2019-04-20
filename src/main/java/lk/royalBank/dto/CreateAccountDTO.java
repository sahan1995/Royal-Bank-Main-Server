package lk.royalBank.dto;

public class CreateAccountDTO {
    private ClientDTO  clientDTO;

    private BankAccountDTO bankAccountDTO;

    public CreateAccountDTO(ClientDTO clientDTO, BankAccountDTO bankAccountDTO) {
        this.clientDTO = clientDTO;
        this.bankAccountDTO = bankAccountDTO;
    }

    public CreateAccountDTO() {
    }

    public ClientDTO getClientDTO() {
        return clientDTO;
    }

    public void setClientDTO(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
    }

    public BankAccountDTO getBankAccountDTO() {
        return bankAccountDTO;
    }

    public void setBankAccountDTO(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = bankAccountDTO;
    }

    @Override
    public String toString() {
        return "CreateAccountDTO{" +
                "clientDTO=" + clientDTO +
                ", bankAccountDTO=" + bankAccountDTO +
                '}';
    }
}
