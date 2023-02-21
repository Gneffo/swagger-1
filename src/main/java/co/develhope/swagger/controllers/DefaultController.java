package co.develhope.swagger.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/welcome")
    @Operation(summary = "say Hello", description = "says hello to user")
    public String welcomeMessage(){
        return "Welcome ";
    }

}