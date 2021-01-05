package org.example.payments.domain.Payments;

public class SubscriptionExpiredDomainEvent {

    public SubscriptionExpiredDomainEvent() {
    }

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public SubscriptionExpiredDomainEvent(String subscriptionId, String status) {
        this.subscriptionId = subscriptionId;
        this.status = status;
    }
}
