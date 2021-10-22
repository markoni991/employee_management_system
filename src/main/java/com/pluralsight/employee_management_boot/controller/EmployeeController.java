package com.pluralsight.employee_management_boot.controller;

import com.pluralsight.employee_management_boot.model.Employee;
import com.pluralsight.employee_management_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //to add employee
    @PostMapping("/addEmployee")
    public Employee addOneEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    //add a list of emps

    @PostMapping("/addEmps")
    public List<Employee> addListEmployees(@RequestBody List<Employee>employees){
        return employeeService.addEmployees(employees);
    }

    //get all
    @GetMapping("/getAll")
    public List<Employee>getAll(){
        return employeeService.getEmployees();
    }
    //get by Id
    @GetMapping("/emp/{id}")
    public Employee findById(@PathVariable(name = "id") int id){
        return employeeService.getById(id);
    }

    //delete
    @DeleteMapping("/delete/{id}")
    public String deleteOne(@PathVariable(name = "id") int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
}
