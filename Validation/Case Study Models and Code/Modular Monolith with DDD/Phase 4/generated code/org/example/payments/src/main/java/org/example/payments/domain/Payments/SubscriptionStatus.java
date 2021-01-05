package org.example.payments.domain.Payments;

public class SubscriptionStatus {

    public SubscriptionStatus() {
    }

    private String Code;

    public String getCode() {
        return Code;
    }

    public SubscriptionStatus(String Code) {
        this.Code = Code;
    }

    public SubscriptionStatus active() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionStatus expired() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionStatus of(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
