package com.ylkj.springbootswagger.controller;

import com.ylkj.springbootswagger.pojo.Customer;
import com.ylkj.springbootswagger.pojo.User;
import com.ylkj.springbootswagger.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : WR
 * @date:2022/2/16 11:55
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";

    }

    @PostMapping("/user")
    public User user() {

        return new User();
    }

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/selectCustomerById")
    @ResponseBody
    // defaultValue = "1", required=false
    public Customer selectCustomerInfoById(@RequestParam(value = "id", required = false) int id) {
        Customer customer = customerService.selectCustomerById(id);
        if (customer != null) {
            return customer;
        }
        return null;
    }
}
