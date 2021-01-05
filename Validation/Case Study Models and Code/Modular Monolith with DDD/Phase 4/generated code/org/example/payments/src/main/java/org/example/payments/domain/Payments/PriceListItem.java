package org.example.payments.domain.Payments;

public class PriceListItem {

    public PriceListItem() {
    }

    private String _countryCode;

    private SubscriptionPeriod _subscriptionPeriod;

    private PriceListItemCategory pricelistitemcategory;

    private MoneyValue _price;

    private boolean _isActive;

    public PriceListItem(String _countryCode, SubscriptionPeriod _subscriptionPeriod, PriceListItemCategory pricelistitemcategory, MoneyValue _price, boolean _isActive) {
        this._countryCode = _countryCode;
        this._subscriptionPeriod = _subscriptionPeriod;
        this.pricelistitemcategory = pricelistitemcategory;
        this._price = _price;
        this._isActive = _isActive;
    }

    public PriceListItem create(String countryCode, SubscriptionPeriod subscriptionPeriod, PriceListItemCategory category, MoneyValue price) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void activate() {
    }

    public void deactivate() {
    }

    public void changeAttributes(String countryCode, SubscriptionPeriod subscriptionPeriod, PriceListItemCategory category, MoneyValue price) {
    }

    private void whenPriceListItemActivated(PriceListItemActivatedDomainEvent event) {
    }

    private void whenPriceListItemCreated(PriceListItemCreatedDomainEvent event) {
    }

    private void whenPriceListItemDeactivated(PriceListItemDeactivatedDomainEvent event) {
    }

    private void whenPriceListItemAttributesChanged(PriceListItemAttributesChangedDomainEvent event) {
    }
}
