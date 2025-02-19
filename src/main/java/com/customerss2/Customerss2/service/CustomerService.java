package com.customerss2.Customerss2.service;

import com.customerss2.Customerss2.model.request.CreateCustomerRequest;
import org.springframework.context.annotation.Profile;

@Profile("!prod")
public interface CustomerService {
    void saveCustomer(CreateCustomerRequest customer);
}
