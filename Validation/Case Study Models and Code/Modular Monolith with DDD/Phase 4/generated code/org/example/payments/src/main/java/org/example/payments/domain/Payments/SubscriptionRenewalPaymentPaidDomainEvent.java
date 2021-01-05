package org.example.payments.domain.Payments;

public class SubscriptionRenewalPaymentPaidDomainEvent {

    public SubscriptionRenewalPaymentPaidDomainEvent() {
    }

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    private String subscriptionRenewalPaymentId;

    public String getSubscriptionRenewalPaymentId() {
        return subscriptionRenewalPaymentId;
    }

    public SubscriptionRenewalPaymentPaidDomainEvent(String subscriptionId, String status, String subscriptionRenewalPaymentId) {
        this.subscriptionId = subscriptionId;
        this.status = status;
        this.subscriptionRenewalPaymentId = subscriptionRenewalPaymentId;
    }
}
