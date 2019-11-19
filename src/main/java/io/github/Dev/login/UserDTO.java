package io.github.Dev.login;

public class UserDTO {
    private String email;

    public UserDTO(User user)
    {
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


}
