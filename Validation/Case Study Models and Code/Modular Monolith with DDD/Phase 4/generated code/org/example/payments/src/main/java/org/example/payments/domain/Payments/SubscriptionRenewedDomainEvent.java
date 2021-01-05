package org.example.payments.domain.Payments;

import java.util.Date;

public class SubscriptionRenewedDomainEvent {

    public SubscriptionRenewedDomainEvent() {
    }

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    private Date expirationDate;

    public Date getExpirationDate() {
        return expirationDate;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    private String subscriptionPeriodCode;

    public String getSubscriptionPeriodCode() {
        return subscriptionPeriodCode;
    }

    public SubscriptionRenewedDomainEvent(String subscriptionId, Date expirationDate, String payerId, String status, String subscriptionPeriodCode) {
        this.subscriptionId = subscriptionId;
        this.expirationDate = expirationDate;
        this.payerId = payerId;
        this.status = status;
        this.subscriptionPeriodCode = subscriptionPeriodCode;
    }
}
