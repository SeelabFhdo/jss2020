package org.example.payments.domain.Payments;

public class SubscriptionRenewalPaymentStatus {

    public SubscriptionRenewalPaymentStatus() {
    }

    private String Code;

    public String getCode() {
        return Code;
    }

    public SubscriptionRenewalPaymentStatus(String Code) {
        this.Code = Code;
    }

    public SubscriptionRenewalPaymentStatus waitingForPayment() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionRenewalPaymentStatus paid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionRenewalPaymentStatus expired() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionRenewalPaymentStatus of(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
