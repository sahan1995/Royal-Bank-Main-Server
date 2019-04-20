package lk.royalBank.dto;

import java.util.List;

public class EmployeeDTO {
    private String empID;
    private String fname;
    private String mname;
    private String lname;
    private String dob;
    private String nic;
    private String country;
    private String city;
    private String address;
    private Double salary;
    private String gender;
    private String tel;
    private String role;
    private boolean isBlocked;

    private String userName;

    private String password;

    private String brachid;
    private BranchDTO branchDTO;

    private List<BankAccountDTO> bankAccountDTOS;

    private List<ClientDTO> clientDTOS;

    public EmployeeDTO(String empID, String fname, String mname, String lname, String dob, String nic, String country, String city, String address, Double salary, String gender, String tel, String role, boolean isBlocked, String userName, String password, String brachid) {
        this.empID = empID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.dob = dob;
        this.nic = nic;
        this.country = country;
        this.city = city;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
        this.tel = tel;
        this.role = role;
        this.isBlocked = isBlocked;
        this.userName = userName;
        this.password = password;
        this.brachid = brachid;
    }

    public EmployeeDTO(String empID, String fname, String mname, String lname, String dob, String nic, String country, String city, String address, Double salary, String gender, String tel, String role, boolean isBlocked, String userName, String password) {
        this.empID = empID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.dob = dob;
        this.nic = nic;
        this.country = country;
        this.city = city;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
        this.tel = tel;
        this.role = role;
        this.isBlocked = isBlocked;
        this.userName = userName;
        this.password = password;
    }

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empID, String fname, String mname, String lname, String dob, String nic, String country, String city, String address, Double salary, String gender, String tel, String role, boolean isBlocked, String userName, String password, BranchDTO branchDTO) {
        this.empID = empID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.dob = dob;
        this.nic = nic;
        this.country = country;
        this.city = city;
        this.address = address;
        this.salary = salary;
        this.gender = gender;
        this.tel = tel;
        this.role = role;
        this.isBlocked = isBlocked;
        this.userName = userName;
        this.password = password;
        this.branchDTO = branchDTO;
    }

    public String getBrachid() {
        return brachid;
    }

    public void setBrachid(String brachid) {
        this.brachid = brachid;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNic() {
        return nic;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public List<BankAccountDTO> getBankAccountDTOS() {
        return bankAccountDTOS;
    }

    public void setBankAccountDTOS(List<BankAccountDTO> bankAccountDTOS) {
        this.bankAccountDTOS = bankAccountDTOS;
    }

    public List<ClientDTO> getClientDTOS() {
        return clientDTOS;
    }

    public void setClientDTOS(List<ClientDTO> clientDTOS) {
        this.clientDTOS = clientDTOS;
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
        return "EmployeeDTO{" +
                "empID='" + empID + '\'' +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob='" + dob + '\'' +
                ", nic='" + nic + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", role='" + role + '\'' +
                ", isBlocked=" + isBlocked +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", brachid='" + brachid + '\'' +
                ", branchDTO=" + branchDTO +
                ", bankAccountDTOS=" + bankAccountDTOS +
                ", clientDTOS=" + clientDTOS +
                '}';
    }
}
