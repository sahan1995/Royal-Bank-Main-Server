package lk.royalBank.dto;

public class SendMoneyDTO {
    private
    int sendMoneyID;

    private String dateAndTime;

    private double amount;

    private String depositAccount;

    private BankAccountDTO bankAccountDTO;

    public SendMoneyDTO(String dateAndTime, double amount, String depositAccount) {
        this.dateAndTime = dateAndTime;
        this.amount = amount;
        this.depositAccount = depositAccount;
    }

    public SendMoneyDTO(int sendMoneyID, String dateAndTime, double amount, String depositAccount, BankAccountDTO bankAccountDTO) {
        this.sendMoneyID = sendMoneyID;
        this.dateAndTime = dateAndTime;
        this.amount = amount;
        this.depositAccount = depositAccount;
        this.bankAccountDTO = bankAccountDTO;
    }

    public SendMoneyDTO() {
    }

    public int getSendMoneyID() {
        return sendMoneyID;
    }

    public void setSendMoneyID(int sendMoneyID) {
        this.sendMoneyID = sendMoneyID;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDepositAccount() {
        return depositAccount;
    }

    public void setDepositAccount(String depositAccount) {
        this.depositAccount = depositAccount;
    }

    public BankAccountDTO getBankAccountDTO() {
        return bankAccountDTO;
    }

    public void setBankAccountDTO(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = bankAccountDTO;
    }

    @Override
    public String toString() {
        return "SendMoneyDTO{" +
                "sendMoneyID=" + sendMoneyID +
                ", dateAndTime='" + dateAndTime + '\'' +
                ", amount=" + amount +
                ", depositAccount='" + depositAccount + '\'' +
                ", bankAccountDTO=" + bankAccountDTO +
                '}';
    }
}
