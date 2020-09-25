package com.egen.project_ex.controller;

import com.egen.project_ex.model.Order;
import com.egen.project_ex.service.InternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Component
@RequestMapping("/user")
public class InternalController {
    //service injection
    private InternalService internalService;
    //cnstructor based injection pattern
    @Autowired//anotation
    public InternalController(InternalService internalService){
        this.internalService=internalService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String mySimpleGetMethod(){
        return "MY simple method";
    }

    @GetMapping("/getorder/{id}")
    public String getOrderbyID(@PathVariable String id){
        System.out.println(id);
        internalService.getOrderByID(id);
        return id;
    }

    @PostMapping("/create_order")
    public String createOrder(@RequestBody Order order){
        System.out.println(order);
        internalService.createOrder(order);
        return "Create Row in DB in controler";
    }

    @PutMapping("/cancel_order/{id}")
    public String cancelOrder(@PathVariable String id){
        internalService.cancelOrder(id);
        return "Update DB in controler";
    }
}
