package org.example.payments.service.Payments.interfaces;

import org.example.payments.domain.Payments.Payer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
public class ProvidedTypes {

    protected Payer getPayer() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
