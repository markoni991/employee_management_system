package com.pluralsight.employee_management_boot.controller;

import com.pluralsight.employee_management_boot.model.Directors;
import com.pluralsight.employee_management_boot.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dir")
public class DirectorController {

    private DirectorService directorService;

    @Autowired
    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @PostMapping("/addDir")
    public Directors addOneDirector(@RequestBody Directors director){
        return directorService.addDirector(director);
    }

    @GetMapping("/getAllDir")
    public List<Directors> getAll(){
        return directorService.getAll();
    }

}
