package lk.royalBank.dto;

public class DepositDTO {

    private int depositID;

    private String dateAndTime;

    private double amount;

    private String depositerName;

    private String depositType;


    private BankAccountDTO bankAccountDTO;
    public DepositDTO(String dateAndTime, double amount, String depositerName, String depositType) {
        this.dateAndTime = dateAndTime;
        this.amount = amount;
        this.depositerName = depositerName;
        this.depositType = depositType;
    }

    public DepositDTO(int depositID, String dateAndTime, double amount, String depositerName, String depositType, BankAccountDTO bankAccountDTO) {
        this.depositID = depositID;
        this.dateAndTime = dateAndTime;
        this.amount = amount;
        this.depositerName = depositerName;
        this.depositType = depositType;
        this.bankAccountDTO = bankAccountDTO;
    }

    public DepositDTO() {
    }

    public int getDepositID() {
        return depositID;
    }

    public void setDepositID(int depositID) {
        this.depositID = depositID;
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

    public String getDepositerName() {
        return depositerName;
    }

    public void setDepositerName(String depositerName) {
        this.depositerName = depositerName;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public BankAccountDTO getBankAccountDTO() {
        return bankAccountDTO;
    }

    public void setBankAccountDTO(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = bankAccountDTO;
    }

    @Override
    public String toString() {
        return "DepositDTO{" +
                "depositID=" + depositID +
                ", dateAndTime='" + dateAndTime + '\'' +
                ", amount=" + amount +
                ", depositerName='" + depositerName + '\'' +
                ", depositType='" + depositType + '\'' +
                ", bankAccountDTO=" + bankAccountDTO +
                '}';
    }
}
