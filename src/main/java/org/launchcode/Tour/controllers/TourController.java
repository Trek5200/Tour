package org.launchcode.Tour.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourController {
    @GetMapping("/")

    public String intro(){
        return "Welcome to the first page of the Tour";
    }

}
