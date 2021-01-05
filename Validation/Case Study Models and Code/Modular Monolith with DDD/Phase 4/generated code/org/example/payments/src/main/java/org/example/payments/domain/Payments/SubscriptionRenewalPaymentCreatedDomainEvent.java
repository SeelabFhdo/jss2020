package org.example.payments.domain.Payments;

public class SubscriptionRenewalPaymentCreatedDomainEvent {

    public SubscriptionRenewalPaymentCreatedDomainEvent() {
    }

    private String subscriptionRenewalPaymentId;

    public String getSubscriptionRenewalPaymentId() {
        return subscriptionRenewalPaymentId;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
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

    private String status;

    public String getStatus() {
        return status;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    private double value;

    public double getValue() {
        return value;
    }

    public SubscriptionRenewalPaymentCreatedDomainEvent(String subscriptionRenewalPaymentId, String payerId, String subscriptionId, String subscriptionPeriodCode, String countryCode, String status, String currency, double value) {
        this.subscriptionRenewalPaymentId = subscriptionRenewalPaymentId;
        this.payerId = payerId;
        this.subscriptionId = subscriptionId;
        this.subscriptionPeriodCode = subscriptionPeriodCode;
        this.countryCode = countryCode;
        this.status = status;
        this.currency = currency;
        this.value = value;
    }
}
