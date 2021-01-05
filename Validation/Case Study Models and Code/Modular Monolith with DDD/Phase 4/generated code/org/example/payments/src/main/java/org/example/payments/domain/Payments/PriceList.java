package org.example.payments.domain.Payments;

public class PriceList {

    public PriceList() {
    }

    private ListPriceListItem pricelistitem;

    public ListPriceListItem getPricelistitem() {
        return pricelistitem;
    }

    public PriceList(ListPriceListItem pricelistitem) {
        this.pricelistitem = pricelistitem;
    }

    public PriceList createFromItems(ListPriceListItem items) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MoneyValue getPrice(String countryCode, SubscriptionPeriod subscriptionPeriod, PriceListItemCategory category) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
