package org.example.payments.domain.Payments;

import java.util.Date;
import org.springframework.stereotype.Service;

@Service()
public class SubscriptionDateExpirationCalculator {

    public SubscriptionDateExpirationCalculator() {
    }

    public Date calculateForNew(SubscriptionPeriod period) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Date calculateForRenewal(Date expirationDate, SubscriptionPeriod period) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
