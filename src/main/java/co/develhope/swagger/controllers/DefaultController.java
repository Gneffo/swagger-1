package co.develhope.swagger.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/welcome")
    @Operation(summary = "say Hello", description = "says hello to user")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(
            @ApiResponse(responseCode = "400", description = "Data Error"))
    public String welcomeMessage(){
        return "Welcome ";
    }

}