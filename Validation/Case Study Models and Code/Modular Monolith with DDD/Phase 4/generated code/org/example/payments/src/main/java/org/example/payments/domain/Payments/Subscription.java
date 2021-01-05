package org.example.payments.domain.Payments;

import java.util.Date;

public class Subscription {

    public Subscription() {
    }

    private SubscriberId _subscriberId;

    private SubscriptionPeriod subscriptionperiod;

    private SubscriptionStatus subscriptionstatus;

    private String _countryCode;

    private Date ExpirationDate;

    public Subscription(SubscriberId _subscriberId, SubscriptionPeriod subscriptionperiod, SubscriptionStatus subscriptionstatus, String _countryCode, Date ExpirationDate) {
        this._subscriberId = _subscriberId;
        this.subscriptionperiod = subscriptionperiod;
        this.subscriptionstatus = subscriptionstatus;
        this._countryCode = _countryCode;
        this.ExpirationDate = ExpirationDate;
    }

    public void renew(SubscriptionRenewalPaymentSnapshot subscriptionRenewalPayment) {
    }

    public void expire() {
    }

    public Subscription create(SubscriptionPaymentSnapshot subscriptionPayment) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void whenSubscriptionCreated(SubscriptionCreatedDomainEvent event) {
    }

    private void whenSubscriptionRenewed(SubscriptionRenewedDomainEvent event) {
    }

    private void whenSubscriptionExpired(SubscriptionExpiredDomainEvent event) {
    }
}
