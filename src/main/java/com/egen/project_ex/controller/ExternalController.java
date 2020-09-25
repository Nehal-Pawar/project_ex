package com.egen.project_ex.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bulk")
public class ExternalController {
    @PostMapping(value = "/create_bulk_order", consumes = "application/json")
    public String CreateOrder(){
        return "Create Row in DB";
    }
    @PutMapping(value = "/update_bulk_status")
    public String UpdateStatus(){
        return "Update DB";
    }
}
