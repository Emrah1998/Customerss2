package com.customerss2.Customerss2.service;

import com.customerss2.Customerss2.model.request.CreateCustomerRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerServiceHandle2 implements CustomerService {
    @Override
    public void saveCustomer(CreateCustomerRequest customer) {
        log.info("CustomerServiceHandle2 saveCustomer");
    }
}
