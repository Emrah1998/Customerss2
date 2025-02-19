package com.customerss2.Customerss2.controller;

import com.customerss2.Customerss2.model.request.CreateCustomerRequest;
import com.customerss2.Customerss2.service.CustomerService;
import com.customerss2.Customerss2.service.CustomerServiceHandle;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/customerss2")
public class CustomerController {
    private final CustomerService customerServiceHandle;

    @PostMapping
    public void saveCustomer(@RequestBody CreateCustomerRequest customer){
        customerServiceHandle.saveCustomer(customer);
    }

}
