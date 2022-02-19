package com.ylkj.springbootmybaties.services;

import com.ylkj.springbootmybaties.bean.Customer;

/**
 * @author : WR
 * @date:2022/2/9 13:46
 */
public interface  CustomerService {

    public Customer selectCustomerById(int id);

}
