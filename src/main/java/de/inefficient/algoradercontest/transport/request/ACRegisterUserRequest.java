package de.inefficient.algoradercontest.transport.request;

/**
 * Created by samuel on 09.02.16.
 * @author samuel
 * @version 0.1
 */
public class ACRegisterUserRequest extends ACRequest {
    private String username;
    private String password;
    private String password2;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}