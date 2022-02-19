package com.ylkj.springbootswagger.services.impl;

import com.ylkj.springbootswagger.pojo.Customer;
import com.ylkj.springbootswagger.dao.CustomerDao;
import com.ylkj.springbootswagger.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : WR
 * @date:2022/2/16 13:49
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;


    @Override
    public Customer selectCustomerById(int id) {
        if (id > 0) {
            Customer customer = customerDao.selectCustomerById(id);
            if (customer != null) {
                return customer;
            }
        }
        return null;
    }
}
