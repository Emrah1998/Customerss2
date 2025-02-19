package com.customerss2.Customerss2.service;

import com.customerss2.Customerss2.dao.entity.CustomerEntity;
import com.customerss2.Customerss2.dao.repository.CustomerRepository;
import com.customerss2.Customerss2.model.request.CreateCustomerRequest;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceHandle implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CreateCustomerRequest customer){
        customerRepository.save(
                CustomerEntity.builder()
                        .firstname(customer.getFirstname())
                        .lastname(customer.getLastname())
                        .build()
        );
    }
}
