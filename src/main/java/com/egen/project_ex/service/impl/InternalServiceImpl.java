package com.egen.project_ex.service.impl;

import com.egen.project_ex.model.Order;
import com.egen.project_ex.repo.InternalRepository;
import com.egen.project_ex.service.InternalService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class InternalServiceImpl implements InternalService {
    
    InternalRepository internalRepository;
    public void InternalService(InternalRepository internalRepository){
        this.internalRepository=internalRepository;
    }

    @Override
    public Order createOrder(Order order) {
        System.out.println(order);
        return internalRepository.save(order);
    }

    @Override
    public Optional<Order> getOrderByID(String id) {
        System.out.println("in service"+id);
//        Optional<Order> order = ;
        return internalRepository.findById(id);
    }

    @Override
    public boolean cancelOrder(String id) {
        return false;
    }
}
