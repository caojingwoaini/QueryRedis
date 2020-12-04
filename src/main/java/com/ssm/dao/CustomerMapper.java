package com.ssm.dao;

import com.ssm.entity.Customer;

import java.util.List;

public interface CustomerMapper {
    public List<Customer> quertAllCustomer();
    public void insertCustomer(Customer customer);
}
