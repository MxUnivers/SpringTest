package com.ensias.srpingbooinit.controller;

import com.ensias.srpingbooinit.models.Module;
import com.ensias.srpingbooinit.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class ModuleController {


    @Autowired
    private ModuleService moduleService;

    @RequestMapping("/modules")
    public List<Module> getModules(){
        return moduleService.getModules();
    }

    @RequestMapping("/modules/{id}")
    public Module getModule(@PathVariable Integer id){
        return moduleService.getModule(id);
    }

}
