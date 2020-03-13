package com.example.demotrialh2.Service;

import com.example.demotrialh2.Model.Employee;
import com.example.demotrialh2.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public int saveEmp(Employee employee)
    {
        employeeRepository.save(employee);
        return 1;
    }

    public List<Employee> findEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> findEmployeeByDept(String dept) {
        return employeeRepository.findByDept(dept);
    }

    public List<Employee> getsal() {
        List<Employee> emp = employeeRepository.findAll();
        return emp.stream().filter(p -> p.getSalary() > 100000).collect(Collectors.toList());
    }

    public void updateEmp(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmp(int id) {
        employeeRepository.deleteById(id);
    }

//    public List<Employee> orderBYSalary() {
//        return employeeRepository.orderBySalary();
//    }
//
//    public List<Employee> getLike(String name) {
//        return employeeRepository.findByNameContaining(name);
//    }
}