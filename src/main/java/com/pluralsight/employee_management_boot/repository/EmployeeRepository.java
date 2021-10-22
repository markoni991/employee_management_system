package com.pluralsight.employee_management_boot.repository;

import com.pluralsight.employee_management_boot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
