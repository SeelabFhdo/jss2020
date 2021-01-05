package org.example.payments.domain.Payments;

public class SubscriptionPaymentExpiredDomainEvent {

    public SubscriptionPaymentExpiredDomainEvent() {
    }

    private String status;

    public String getStatus() {
        return status;
    }

    private String subscriptionPaymentId;

    public String getSubscriptionPaymentId() {
        return subscriptionPaymentId;
    }

    public SubscriptionPaymentExpiredDomainEvent(String status, String subscriptionPaymentId) {
        this.status = status;
        this.subscriptionPaymentId = subscriptionPaymentId;
    }
}
