package com.lxy.controller;

import com.lxy.service.CustomerService;

public class CustomerController {

    private CustomerService customerService;

    // 依赖注入
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void save() {
        customerService.save();
    }

}
