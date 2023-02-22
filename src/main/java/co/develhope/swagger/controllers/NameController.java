package co.develhope.swagger.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    @Operation(summary = "Print name", description = "print the name of the user")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(
            @ApiResponse(responseCode = "400", description = "Data Error"))
    public String getName(String name){
        return name;
    }

}