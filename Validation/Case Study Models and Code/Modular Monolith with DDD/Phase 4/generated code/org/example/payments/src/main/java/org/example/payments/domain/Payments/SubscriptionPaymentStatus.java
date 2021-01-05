package org.example.payments.domain.Payments;

public class SubscriptionPaymentStatus {

    public SubscriptionPaymentStatus() {
    }

    private String Code;

    public String getCode() {
        return Code;
    }

    public SubscriptionPaymentStatus(String Code) {
        this.Code = Code;
    }

    public SubscriptionPaymentStatus waitingForPayment() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionPaymentStatus paid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionPaymentStatus expired() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionPaymentStatus of(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
