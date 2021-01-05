package org.example.payments.domain.Payments;

import javax.persistence.Entity;

@Entity()
public class SubscriptionPayment {

    public SubscriptionPayment() {
    }

    private PayerId _payerId;

    public PayerId get_payerId() {
        return _payerId;
    }

    public void set_payerId(PayerId _payerId) {
        this._payerId = _payerId;
    }

    private SubscriptionPeriod subscriptionperiod;

    private String _countryCode;

    public String get_countryCode() {
        return _countryCode;
    }

    public void set_countryCode(String _countryCode) {
        this._countryCode = _countryCode;
    }

    private SubscriptionPaymentStatus subscriptionpaymentstatus;

    public SubscriptionPaymentStatus getSubscriptionpaymentstatus() {
        return subscriptionpaymentstatus;
    }

    public void setSubscriptionpaymentstatus(SubscriptionPaymentStatus subscriptionpaymentstatus) {
        this.subscriptionpaymentstatus = subscriptionpaymentstatus;
    }

    private MoneyValue _value;

    public SubscriptionPayment(PayerId _payerId, SubscriptionPeriod subscriptionperiod, String _countryCode, SubscriptionPaymentStatus subscriptionpaymentstatus, MoneyValue _value) {
        this._payerId = _payerId;
        this.subscriptionperiod = subscriptionperiod;
        this._countryCode = _countryCode;
        this.subscriptionpaymentstatus = subscriptionpaymentstatus;
        this._value = _value;
    }

    public SubscriptionPayment buy(PayerId payerId, SubscriptionPeriod period, String countryCode, MoneyValue priceOffer, PriceList priceList) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionPaymentSnapshot getSnapshot() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void markAsPaid() {
    }

    public void expire() {
    }

    private void whenSubscriptionPaymentPaid(SubscriptionPaymentPaidDomainEvent event) {
    }

    private void whenSubscriptionPaymentCreated(SubscriptionPaymentCreatedDomainEvent event) {
    }

    private void whenSubscriptionPaymentExpired(SubscriptionPaymentExpiredDomainEvent event) {
    }
}
