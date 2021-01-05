package org.example.payments.domain.Payments;

public class PriceListItemAttributesChangedDomainEvent {

    public PriceListItemAttributesChangedDomainEvent() {
    }

    private String priceListItemId;

    public String getPriceListItemId() {
        return priceListItemId;
    }

    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    private String subscriptionPeriodCode;

    public String getSubscriptionPeriodCode() {
        return subscriptionPeriodCode;
    }

    private String categoryCode;

    public String getCategoryCode() {
        return categoryCode;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    private long price;

    public long getPrice() {
        return price;
    }

    public PriceListItemAttributesChangedDomainEvent(String priceListItemId, String countryCode, String subscriptionPeriodCode, String categoryCode, String currency, long price) {
        this.priceListItemId = priceListItemId;
        this.countryCode = countryCode;
        this.subscriptionPeriodCode = subscriptionPeriodCode;
        this.categoryCode = categoryCode;
        this.currency = currency;
        this.price = price;
    }
}
