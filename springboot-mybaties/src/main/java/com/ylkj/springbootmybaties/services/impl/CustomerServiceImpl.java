package com.ylkj.springbootmybaties.services.impl;

import com.ylkj.springbootmybaties.bean.Customer;
import com.ylkj.springbootmybaties.dao.CustomerDao;
import com.ylkj.springbootmybaties.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : WR
 * @date:2022/2/9 13:49
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
