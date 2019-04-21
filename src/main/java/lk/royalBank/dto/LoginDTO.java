package lk.royalBank.dto;

public class LoginDTO {
    private String userName;
    private String password;

    public LoginDTO(String userName, String password) {
        this.setUserName(userName);
        this.setPassword(password);
    }

    public LoginDTO() {
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
        return "LoginDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
