package com.pluralsight.employee_management_boot.service;

import com.pluralsight.employee_management_boot.model.Directors;
import com.pluralsight.employee_management_boot.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    private DirectorRepository directorRepository;

    @Autowired
    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    //to add director
    public Directors addDirector(Directors director){
        return directorRepository.save(director);
    }

    //to get all
    public List<Directors> getAll(){
        return directorRepository.findAll();
    }

}
