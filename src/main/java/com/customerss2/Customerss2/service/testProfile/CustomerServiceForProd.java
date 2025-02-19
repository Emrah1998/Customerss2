package com.customerss2.Customerss2.service.testProfile;

import com.customerss2.Customerss2.model.request.CreateCustomerRequest;
import com.customerss2.Customerss2.service.CustomerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class CustomerServiceForProd implements CustomerService {
    @Override
    public void saveCustomer(CreateCustomerRequest customer) {
        System.out.println(customer);
    }
}
