package com.pluralsight.employee_management_boot.repository;

import com.pluralsight.employee_management_boot.model.Directors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Directors, Integer> {

}
