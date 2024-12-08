package com.example.bus_booking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/client")
    public String client() {
        return "entities/Client";
    }
}
