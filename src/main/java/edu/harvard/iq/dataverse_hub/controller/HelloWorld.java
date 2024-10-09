package edu.harvard.iq.dataverse_hub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.harvard.iq.dataverse_hub.service.InstallationService;

@RestController
public class HelloWorld {

    @Autowired
    private InstallationService installationService;

    @GetMapping("/hello")
    String hello() {System.out.println(installationService.findByName("Dataverse"));
        return "Hello, World!";
    }

    

}
