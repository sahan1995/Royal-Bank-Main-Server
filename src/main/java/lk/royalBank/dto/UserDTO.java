package lk.royalBank.dto;

public class UserDTO {
    private String userName;

    private String password;

    private String role;

    private String ID;

    public UserDTO(String userName, String password, String role, String ID) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.ID = ID;
    }

    public UserDTO() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
