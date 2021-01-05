package org.example.customer.domain.customer;

import org.springframework.stereotype.Repository;

@Repository()
public class CustomerRepository {

    public CustomerRepository() {
    }

    private ListCustomerAggregateRoot customerAggregateRoot;

    public ListCustomerAggregateRoot getCustomerAggregateRoot() {
        return customerAggregateRoot;
    }

    public void setCustomerAggregateRoot(ListCustomerAggregateRoot customerAggregateRoot) {
        this.customerAggregateRoot = customerAggregateRoot;
    }

    public CustomerRepository(ListCustomerAggregateRoot customerAggregateRoot) {
        this.customerAggregateRoot = customerAggregateRoot;
    }

    public CustomerId nextId() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
