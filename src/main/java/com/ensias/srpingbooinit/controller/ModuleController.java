package com.ensias.srpingbooinit.controller;

import com.ensias.srpingbooinit.models.Module;
import com.ensias.srpingbooinit.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @RequestMapping(method = RequestMethod.POST ,  value = "/modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);

    }
}
