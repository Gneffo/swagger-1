package co.develhope.swagger.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    @Operation(summary = "Print name", description = "print the name of the user")
    public String getName(String name){
        return name;
    }

}