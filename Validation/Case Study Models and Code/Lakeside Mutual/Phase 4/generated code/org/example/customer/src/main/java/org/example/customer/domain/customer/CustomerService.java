package org.example.customer.domain.customer;

import org.springframework.stereotype.Service;

@Service()
public class CustomerService {

    public CustomerService() {
    }

    public CustomerAggregateRoot updateAddress(CustomerId customerId, Address unspecified1) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public CustomerAggregateRoot updateCustomerProfile(CustomerId customerId, CustomerProfileEntity unspecified1) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public CustomerAggregateRoot createCustomer(CustomerProfileEntity profile) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ListCustomerAggregateRoot getCustomers(String ids) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
