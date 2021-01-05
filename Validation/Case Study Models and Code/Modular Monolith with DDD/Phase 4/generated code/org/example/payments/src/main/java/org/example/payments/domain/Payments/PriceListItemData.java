package org.example.payments.domain.Payments;

public class PriceListItemData {

    public PriceListItemData() {
    }

    private String CountryCode;

    public String getCountryCode() {
        return CountryCode;
    }

    private SubscriptionPeriod SubscriptionPeriod;

    public SubscriptionPeriod getSubscriptionPeriod() {
        return SubscriptionPeriod;
    }

    private MoneyValue Value;

    public MoneyValue getValue() {
        return Value;
    }

    private PriceListItemCategory Category;

    public PriceListItemCategory getCategory() {
        return Category;
    }

    public PriceListItemData(String CountryCode, SubscriptionPeriod SubscriptionPeriod, MoneyValue Value, PriceListItemCategory Category) {
        this.CountryCode = CountryCode;
        this.SubscriptionPeriod = SubscriptionPeriod;
        this.Value = Value;
        this.Category = Category;
    }
}
