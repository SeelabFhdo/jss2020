package org.example.payments.domain.Payments;

public class SubscriptionRenewalPaymentSnapshot {

    public SubscriptionRenewalPaymentSnapshot() {
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

    private SubscriptionRenewalPaymentId Id;

    public SubscriptionRenewalPaymentId getId() {
        return Id;
    }

    public SubscriptionRenewalPaymentSnapshot(PayerId PayerId, SubscriptionPeriod SubscriptionPeriod, String CountryCode, SubscriptionRenewalPaymentId Id) {
        this.PayerId = PayerId;
        this.SubscriptionPeriod = SubscriptionPeriod;
        this.CountryCode = CountryCode;
        this.Id = Id;
    }
}
