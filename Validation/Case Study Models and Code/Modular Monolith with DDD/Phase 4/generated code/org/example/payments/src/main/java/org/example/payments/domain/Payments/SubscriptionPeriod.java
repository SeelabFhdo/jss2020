package org.example.payments.domain.Payments;

public class SubscriptionPeriod {

    public SubscriptionPeriod() {
    }

    private String Code;

    public String getCode() {
        return Code;
    }

    public SubscriptionPeriod(String Code) {
        this.Code = Code;
    }

    public SubscriptionPeriod month() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionPeriod halfYear() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public SubscriptionPeriod of(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getName(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getMonthsNumber() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
