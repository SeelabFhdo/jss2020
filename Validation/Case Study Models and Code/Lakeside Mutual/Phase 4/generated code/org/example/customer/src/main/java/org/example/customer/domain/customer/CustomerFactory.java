package org.example.customer.domain.customer;

import org.springframework.stereotype.Service;

@Service()
public class CustomerFactory {

    public CustomerFactory() {
    }

    private CustomerRepository customerRepository;

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerFactory(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerAggregateRoot create(CustomerProfileEntity profile) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void formatPhoneNumber(String phoneNumberStr) {
    }
}
