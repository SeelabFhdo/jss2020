package org.example.customer.service.Customer.interfaces;

import org.example.customer.domain.Customer.CustomerShared;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
@RequestMapping(value = {"customer"})
public class ProvidedTypes {

    @GetMapping(value = "customer")
    protected CustomerShared getCustomer(String name) {
        checkRequiredParametersOfGetCustomer(name);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfGetCustomer(String name) {
        if (name == null)
            throw new IllegalArgumentException("Required parameter \"name\" must not be null");
    }
}
