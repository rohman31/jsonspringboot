package com.infosys.demo.springboot.model;


import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Data
@EntityScan

public class Employee {
    private String username, password;


    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @NonNull
    @NotBlank
    @NotEmpty

    private String password1;

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

