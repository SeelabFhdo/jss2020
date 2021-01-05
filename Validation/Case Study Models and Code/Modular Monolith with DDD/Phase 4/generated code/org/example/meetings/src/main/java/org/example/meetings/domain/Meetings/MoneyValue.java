package org.example.meetings.domain.Meetings;

public class MoneyValue {

    public MoneyValue() {
    }

    private double value;

    public double getValue() {
        return value;
    }

    private String Currency;

    public String getCurrency() {
        return Currency;
    }

    public MoneyValue(double value, String Currency) {
        this.value = value;
        this.Currency = Currency;
    }

    public MoneyValue undefined() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MoneyValue Of(double value, String currency) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MoneyValue multiply(int left, MoneyValue right) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
