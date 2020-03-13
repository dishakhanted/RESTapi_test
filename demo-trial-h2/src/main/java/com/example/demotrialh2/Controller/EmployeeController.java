package com.example.demotrialh2.Controller;

import com.example.demotrialh2.Model.Employee;
import com.example.demotrialh2.Repository.EmployeeRepository;
import com.example.demotrialh2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmp")
    public int saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmp(employee);
        //return 1;
    }

    @GetMapping("/getEmp")
    public List<Employee> findEmployee() {
        return employeeService.findEmployee();
    }


}
