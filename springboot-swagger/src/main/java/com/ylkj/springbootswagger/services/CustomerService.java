package com.ylkj.springbootswagger.services;

import com.ylkj.springbootswagger.pojo.Customer;

/**
 * @author : WR
 * @date:2022/2/16 13:46
 */
public interface  CustomerService {

    public Customer selectCustomerById(int id);

}
