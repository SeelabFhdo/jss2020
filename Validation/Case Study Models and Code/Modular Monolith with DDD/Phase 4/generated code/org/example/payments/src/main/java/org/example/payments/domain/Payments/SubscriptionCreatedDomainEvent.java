package org.example.payments.domain.Payments;

import java.util.Date;

public class SubscriptionCreatedDomainEvent {

    public SubscriptionCreatedDomainEvent() {
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    private String subscriptionPaymentId;

    public String getSubscriptionPaymentId() {
        return subscriptionPaymentId;
    }

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    private String subscriptionPeriodCode;

    public String getSubscriptionPeriodCode() {
        return subscriptionPeriodCode;
    }

    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    private Date expirationDate;

    public Date getExpirationDate() {
        return expirationDate;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public SubscriptionCreatedDomainEvent(String payerId, String subscriptionPaymentId, String subscriptionId, String subscriptionPeriodCode, String countryCode, Date expirationDate, String status) {
        this.payerId = payerId;
        this.subscriptionPaymentId = subscriptionPaymentId;
        this.subscriptionId = subscriptionId;
        this.subscriptionPeriodCode = subscriptionPeriodCode;
        this.countryCode = countryCode;
        this.expirationDate = expirationDate;
        this.status = status;
    }
}
