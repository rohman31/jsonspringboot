package com.infosys.demo.springboot.controller;

import com.infosys.demo.springboot.EmployeeRequest;
import com.infosys.demo.springboot.EmployeeRespond;
import com.infosys.demo.springboot.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/LoginValidation")
public class LoginController {

    @Autowired
    LoginService loginService;
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/Register/{username}/{password}")
    public EmployeeRespond Register(@PathVariable (value = "username") String username, @PathVariable (value = "password") String password){
        EmployeeRequest employeeRequest = new EmployeeRequest();
        employeeRequest.setUsername(username);
        employeeRequest.setPassword(password);
        return loginService.Register(employeeRequest);
    }
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/Login/{username}/{password}")
    public EmployeeRespond Login(@PathVariable (value = "username") String username, @PathVariable (value = "password") String password){
        EmployeeRequest employeeRequest = new EmployeeRequest ();
        employeeRequest.setUsername(username);
        employeeRequest.setPassword(password);
        return loginService.Login(employeeRequest   );
    }
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @GetMapping (value = "/Logout/{username}")
    public EmployeeRespond Logout(@PathVariable (value = "username") String username)
    {
        EmployeeRequest employeeRequest = new EmployeeRequest();
        employeeRequest.setUsername(username);

        return  loginService.Logout(employeeRequest);
    }
}
