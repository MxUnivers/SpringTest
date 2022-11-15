package com.ensias.srpingbooinit.service;

import com.ensias.srpingbooinit.models.Module;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ModuleService {

    private List<Module> modules = Arrays.asList(
                new Module(
                        1,"Aymar 1","description du trire 1"
                ),
                new Module(
                        2,"Aymar 2","description du trire 2"
                ),
                new Module(
                        3,"Aymar 3","description du trire 3"
                )
        );

    public List<Module> getModules(){
        return modules ;
    }

    public Module getModule(Integer id){
        for (Module module:modules){
            if(id.equals(module.getId())){
                return  module;
            }
        }
        return null;
    }
}
