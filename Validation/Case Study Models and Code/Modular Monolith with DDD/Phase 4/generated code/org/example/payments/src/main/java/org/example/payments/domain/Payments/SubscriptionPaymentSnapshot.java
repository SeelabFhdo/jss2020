package org.example.payments.domain.Payments;

public class SubscriptionPaymentSnapshot {

    public SubscriptionPaymentSnapshot() {
    }

    private PayerId PayerId;

    public PayerId getPayerId() {
        return PayerId;
    }

    private SubscriptionPeriod SubscriptionPeriod;

    public SubscriptionPeriod getSubscriptionPeriod() {
        return SubscriptionPeriod;
    }

    private String CountryCode;

    public String getCountryCode() {
        return CountryCode;
    }

    private SubscriptionPaymentId Id;

    public SubscriptionPaymentId getId() {
        return Id;
    }

    public SubscriptionPaymentSnapshot(PayerId PayerId, SubscriptionPeriod SubscriptionPeriod, String CountryCode, SubscriptionPaymentId Id) {
        this.PayerId = PayerId;
        this.SubscriptionPeriod = SubscriptionPeriod;
        this.CountryCode = CountryCode;
        this.Id = Id;
    }
}
