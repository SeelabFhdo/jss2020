package org.example.customer.domain.Customer;

import org.springframework.stereotype.Repository;

@Repository()
public class CustomerRepository {

    public CustomerRepository() {
    }

    private ListCustomer customer;

    public ListCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ListCustomer customer) {
        this.customer = customer;
    }

    public CustomerRepository(ListCustomer customer) {
        this.customer = customer;
    }

    public ListCustomer findbyname(String nameSelector) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public ListCustomer findbyCustomerID(String customerIDSelector) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
