package com.example.art.mapper;

import com.example.art.dto.CustomerRequest;
import com.example.art.entity.Customer;
import com.example.art.dto.CustomerResponse;
import org.springframework.stereotype.Service;
import lombok.Builder;
@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();}
    public CustomerResponse toCustomerResponse(Customer customer) {
            return new CustomerResponse(customer.getFirstName(), customer.getLastName(), customer.getEmail());
        }
    }
