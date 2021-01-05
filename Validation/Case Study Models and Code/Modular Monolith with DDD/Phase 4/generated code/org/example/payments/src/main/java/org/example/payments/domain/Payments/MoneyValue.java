package org.example.payments.domain.Payments;

public class MoneyValue {

    public MoneyValue() {
    }

    private double value;

    public double getValue() {
        return value;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public MoneyValue(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public MoneyValue of(double value, String currency) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean greaterThanValue(double left, MoneyValue right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean lessThanValue(double left, MoneyValue right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean greaterEqualsValue(double left, MoneyValue right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean lessEqualsValue(double left, MoneyValue right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean greaterThan(MoneyValue left, double right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean lessThan(MoneyValue left, double right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean greaterEquals(MoneyValue left, double right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean lessEquals(MoneyValue left, double right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
