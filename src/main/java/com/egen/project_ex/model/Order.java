package com.egen.project_ex.model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Order {
    @Id
    private String order_id;
    private String order_status;
//    private String order_customer_id;
//    private long order_item_list;    //class
////    double order_subtotal;
//    private double order_tax;
//    private Timestamp order_shipping_charges;
//    private double order_total;
//    private long order_payment_id;  //class
//    private long order_shipping_id; //class
//    public Order(){
//        this.order_id= UUID.randomUUID().toString();
//    }

}
