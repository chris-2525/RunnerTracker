package com.example.demo.model;


import com.example.demo.services.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedUserManagementService;

    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {this.loggedUserManagementService = loggedUserManagementService;}

    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();
        boolean loginResult = false;
        if("christine".equals(username) && "password".equals(password)) {
            loginResult=true;
            loggedUserManagementService.setUsername(username);
        }

        return loginResult;
    }

    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}




}
