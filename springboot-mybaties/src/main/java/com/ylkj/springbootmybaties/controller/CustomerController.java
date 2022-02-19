package com.ylkj.springbootmybaties.controller;

import com.ylkj.springbootmybaties.bean.Customer;
import com.ylkj.springbootmybaties.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : WR
 * @date:2022/2/9 14:14
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/selectCustomerById")
    @ResponseBody
    // defaultValue = "1", required=false
    public Customer selectCustomerInfoById(@RequestParam(value = "id", defaultValue = "1", required=false) int id) {
        Customer customer = customerService.selectCustomerById(id);
        if (customer != null) {
            return customer;
        }
        return null;
    }

}
