package com.ssm.controller;

import com.ssm.dao.CustomerMapper;
import com.ssm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<Customer> query(){
        return customerMapper.quertAllCustomer();
    }

    @RequestMapping("/insert")
    public String insert(Customer customer){
        customerMapper.insertCustomer(customer);
        return "success";
    }
}
