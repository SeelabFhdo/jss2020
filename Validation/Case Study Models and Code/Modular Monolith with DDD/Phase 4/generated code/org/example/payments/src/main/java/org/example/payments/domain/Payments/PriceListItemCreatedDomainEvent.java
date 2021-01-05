package org.example.payments.domain.Payments;

public class PriceListItemCreatedDomainEvent {

    public PriceListItemCreatedDomainEvent() {
    }

    private long price;

    public long getPrice() {
        return price;
    }

    private String subscriptionPeriodCode;

    public String getSubscriptionPeriodCode() {
        return subscriptionPeriodCode;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    private String categoryCode;

    public String getCategoryCode() {
        return categoryCode;
    }

    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    private String priceListItemId;

    public String getPriceListItemId() {
        return priceListItemId;
    }

    private boolean isActive;

    public boolean getIsActive() {
        return isActive;
    }

    public PriceListItemCreatedDomainEvent(long price, String subscriptionPeriodCode, String currency, String categoryCode, String countryCode, String priceListItemId, boolean isActive) {
        this.price = price;
        this.subscriptionPeriodCode = subscriptionPeriodCode;
        this.currency = currency;
        this.categoryCode = categoryCode;
        this.countryCode = countryCode;
        this.priceListItemId = priceListItemId;
        this.isActive = isActive;
    }
}
