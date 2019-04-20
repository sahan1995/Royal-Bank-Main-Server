package lk.royalBank.dto;

public class WidthdrawDTO {
    private
    int widthdrawID;

    private String dateAndTime;

    private double amount;

    private String widthdrawType;

    private String widthdrawerName;

    private BankAccountDTO bankAccountDTO;

    public WidthdrawDTO(String dateAndTime, double amount, String widthdrawType, String widthdrawerName) {
        this.dateAndTime = dateAndTime;
        this.amount = amount;
        this.widthdrawType = widthdrawType;
        this.widthdrawerName = widthdrawerName;
    }

    public WidthdrawDTO() {
    }

    public int getWidthdrawID() {
        return widthdrawID;
    }

    public void setWidthdrawID(int widthdrawID) {
        this.widthdrawID = widthdrawID;
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

    public String getWidthdrawType() {
        return widthdrawType;
    }

    public void setWidthdrawType(String widthdrawType) {
        this.widthdrawType = widthdrawType;
    }

    public String getWidthdrawerName() {
        return widthdrawerName;
    }

    public void setWidthdrawerName(String widthdrawerName) {
        this.widthdrawerName = widthdrawerName;
    }

    public BankAccountDTO getBankAccountDTO() {
        return bankAccountDTO;
    }

    public void setBankAccountDTO(BankAccountDTO bankAccountDTO) {
        this.bankAccountDTO = bankAccountDTO;
    }

    @Override
    public String toString() {
        return "WidthdrawDTO{" +
                "widthdrawID=" + widthdrawID +
                ", dateAndTime='" + dateAndTime + '\'' +
                ", amount=" + amount +
                ", widthdrawType='" + widthdrawType + '\'' +
                ", widthdrawerName='" + widthdrawerName + '\'' +
                ", bankAccountDTO=" + bankAccountDTO +
                '}';
    }
}
