package com.infosys.demo.springboot.service;

import com.infosys.demo.springboot.EmployeeRequest;
import com.infosys.demo.springboot.EmployeeRespond;
import com.infosys.demo.springboot.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    String username, password, key;
    int code;
    Employee employee = new Employee(username,password);


    public EmployeeRespond Register(EmployeeRequest employeeRequest){

        EmployeeRespond employeeRespond = new EmployeeRespond(code, key);
        this.key=null;
        this.code=00;
        employee.setUsername(employeeRequest.getUsername());
        employee.setPassword(employeeRequest.getPassword());

        return employeeRespond;
    }

    public EmployeeRespond Login(EmployeeRequest employeeRequest){

        EmployeeRespond employeeRespond = new EmployeeRespond(code, key);

        this.key="123@an";
        this.code=01;

        if (employee.getUsername().equals(employeeRequest.getUsername())&& employee.getPassword().equals(employeeRequest.getPassword())){
            this.code=00;
        }else{
            this.key=null;
        }

        return employeeRespond;

    }

    public  EmployeeRespond Logout(EmployeeRequest employeeRequest){
        EmployeeRespond employeeRespond = new EmployeeRespond(code,key);
        this.key="234@cn";
        this.code=01;
        if (employee.getUsername().equals(employeeRequest.getUsername())){
            this.code=00;
        }else{
            this.key=null;
        }
        return employeeRespond;
    }

}
