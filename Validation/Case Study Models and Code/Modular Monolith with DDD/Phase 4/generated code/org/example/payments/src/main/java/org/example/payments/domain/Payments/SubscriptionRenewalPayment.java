package org.example.payments.domain.Payments;

import javax.persistence.Entity;

@Entity()
public class SubscriptionRenewalPayment {

    public SubscriptionRenewalPayment() {
    }

    private PayerId _payerId;

    private SubscriptionId _subscriptionId;

    private SubscriptionPeriod subscriptionperiod;

    private String _countryCode;

    private SubscriptionRenewalPaymentStatus subscriptionrenewalpaymentstatus;

    private MoneyValue _value;

    public SubscriptionRenewalPayment(PayerId _payerId, SubscriptionId _subscriptionId, SubscriptionPeriod subscriptionperiod, String _countryCode, SubscriptionRenewalPaymentStatus subscriptionrenewalpaymentstatus, MoneyValue _value) {
        this._payerId = _payerId;
        this._subscriptionId = _subscriptionId;
        this.subscriptionperiod = subscriptionperiod;
        this._countryCode = _countryCode;
        this.subscriptionrenewalpaymentstatus = subscriptionrenewalpaymentstatus;
        this._value = _value;
    }

    public SubscriptionRenewalPayment buy(PayerId payerId, SubscriptionId subscriptionId, SubscriptionPeriod period, String countryCode, MoneyValue priceOffer, PriceList priceList) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionRenewalPaymentSnapshot getSnapshot() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void MarkRenewalAsPaid() {
    }

    private void whenSubscriptionRenewalPaymentCreated(SubscriptionRenewalPaymentCreatedDomainEvent event) {
    }

    private void whenSubscriptionRenewalPaymentPaid(SubscriptionRenewalPaymentPaidDomainEvent event) {
    }
}
