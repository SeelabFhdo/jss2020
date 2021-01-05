package org.example.payments.domain.Payments;

public class SubscriptionPaymentCreatedDomainEvent {

    public SubscriptionPaymentCreatedDomainEvent() {
    }

    private String subscriptionPaymentId;

    public String getSubscriptionPaymentId() {
        return subscriptionPaymentId;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    private String subscriptionPeriodCode;

    public String getSubscriptionPeriodCode() {
        return subscriptionPeriodCode;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    private double value;

    public double getValue() {
        return value;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public SubscriptionPaymentCreatedDomainEvent(String subscriptionPaymentId, String payerId, String countryCode, String subscriptionPeriodCode, String status, double value, String currency) {
        this.subscriptionPaymentId = subscriptionPaymentId;
        this.payerId = payerId;
        this.countryCode = countryCode;
        this.subscriptionPeriodCode = subscriptionPeriodCode;
        this.status = status;
        this.value = value;
        this.currency = currency;
    }
}
