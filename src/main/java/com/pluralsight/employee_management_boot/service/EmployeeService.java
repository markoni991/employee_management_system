package com.pluralsight.employee_management_boot.service;

import com.pluralsight.employee_management_boot.model.Employee;
import com.pluralsight.employee_management_boot.repository.EmployeeRepository;
import org.dom4j.io.ElementModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    //to add an employee
    public Employee addEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> addEmployees(List<Employee>employees){
        return repository.saveAll(employees);
    }

    //to fetch an employee
    public List<Employee> getEmployees(){
        return repository.findAll();
    }
    //find by Id
    public Employee getById(int id){
        return repository.findById(id).orElse(null);
    }

    //delete
    public String deleteEmployee(int id){
        repository.deleteById(id);
        return "Employee is erased!";
    }

    //update
    public Employee update(Employee employee){
        Employee oldEmp = repository.getById(employee.getId());
        oldEmp.setFirstName(employee.getFirstName());
        oldEmp.setLastName(employee.getLastName());
        oldEmp.setEmail(employee.getEmail());
        return repository.save(oldEmp);
    }

}
