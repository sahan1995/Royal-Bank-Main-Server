package lk.royalBank.dto;

import java.util.List;

public class BranchDTO {
    private int branchID;
    private String branchName;
    private String country;
    private String city;
    private String address;
    private String tel;

    private List<EmployeeDTO> employeeDTOS;

    private List<ClientDTO> clientDTOS;

    public BranchDTO(String branchName, String country, String city, String address, String tel) {
        this.branchName = branchName;
        this.country = country;
        this.city = city;
        this.address = address;
        this.tel = tel;
    }

    public BranchDTO() {
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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

    public List<EmployeeDTO> getEmployeeDTOS() {
        return employeeDTOS;
    }

    public void setEmployeeDTOS(List<EmployeeDTO> employeeDTOS) {
        this.employeeDTOS = employeeDTOS;
    }

    public List<ClientDTO> getClientDTOS() {
        return clientDTOS;
    }

    public void setClientDTOS(List<ClientDTO> clientDTOS) {
        this.clientDTOS = clientDTOS;
    }

    @Override
    public String toString() {
        return "BranchDTO{" +
                "branchID=" + branchID +
                ", branchName='" + branchName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", employeeDTOS=" + employeeDTOS +
                ", clientDTOS=" + clientDTOS +
                '}';
    }
}
