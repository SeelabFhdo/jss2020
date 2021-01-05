package org.example.payments.domain.Payments;

public class SubscriptionPaymentPaidDomainEvent {

    public SubscriptionPaymentPaidDomainEvent() {
    }

    private String subscriptionPaymentId;

    public String getSubscriptionPaymentId() {
        return subscriptionPaymentId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public SubscriptionPaymentPaidDomainEvent(String subscriptionPaymentId, String status) {
        this.subscriptionPaymentId = subscriptionPaymentId;
        this.status = status;
    }
}
