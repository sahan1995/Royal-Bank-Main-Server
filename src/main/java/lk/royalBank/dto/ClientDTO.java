package lk.royalBank.dto;

import java.util.List;

public class ClientDTO {
    private
    String clientID;
    private String fname;
    private String mname;
    private String lname;
    private String gender;
    private String dob;
    private String nic;
    private String country;
    private String city;
    private String address;
    private String tel;
    private String email;
    private String occupation;
    private boolean isBlocked;

    private String userName;

    private String password;
    private String branchid;
    private String empid;
    private BranchDTO branchDTO;

    private EmployeeDTO employeeDTO;

    private List<BankAccountDTO> bankAccountDTOS;


    public ClientDTO(String clientID, String fname, String mname, String lname, String gender, String dob, String nic, String country, String city, String address, String tel, String email, String occupation, boolean isBlocked, String userName, String password, String branchid, String empid) {
        this.clientID = clientID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.dob = dob;
        this.nic = nic;
        this.country = country;
        this.city = city;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.occupation = occupation;
        this.isBlocked = isBlocked;
        this.userName = userName;
        this.password = password;
        this.branchid = branchid;
        this.empid = empid;
    }


    public ClientDTO(String clientID, String fname, String mname, String lname, String gender, String dob, String nic, String country, String city, String address, String tel, String email, String occupation, boolean isBlocked, String userName, String password, BranchDTO branchDTO) {
        this.clientID = clientID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.dob = dob;
        this.nic = nic;
        this.country = country;
        this.city = city;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.occupation = occupation;
        this.isBlocked = isBlocked;
        this.userName = userName;
        this.password = password;
        this.branchDTO = branchDTO;
    }

    public ClientDTO() {
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNic() {
        return nic;
    }

    public String getBranchid() {
        return branchid;
    }

    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public BranchDTO getBranchDTO() {
        return branchDTO;
    }

    public void setBranchDTO(BranchDTO branchDTO) {
        this.branchDTO = branchDTO;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public List<BankAccountDTO> getBankAccountDTOS() {
        return bankAccountDTOS;
    }

    public void setBankAccountDTOS(List<BankAccountDTO> bankAccountDTOS) {
        this.bankAccountDTOS = bankAccountDTOS;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "clientID='" + clientID + '\'' +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", nic='" + nic + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", occupation='" + occupation + '\'' +
                ", isBlocked=" + isBlocked +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", branchid='" + branchid + '\'' +
                ", branchDTO=" + branchDTO +
                ", employeeDTO=" + employeeDTO +
                ", bankAccountDTOS=" + bankAccountDTOS +
                '}';
    }
}
