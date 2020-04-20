package com.infosys.demo.springboot;

import java.io.Serializable;

public class EmployeeRequest {

    private static final long serialVersionUID = -3316369696436157236L;
    private String username;
    private String password;

    public EmployeeRequest() {
        this.username = username;
        this.password = password;
    }

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

}
