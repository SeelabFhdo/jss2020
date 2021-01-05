package org.example.payments.domain.Payments;

public class PriceListItemDeactivatedDomainEvent {

    public PriceListItemDeactivatedDomainEvent() {
    }

    private String priceListItemId;

    public String getPriceListItemId() {
        return priceListItemId;
    }

    public PriceListItemDeactivatedDomainEvent(String priceListItemId) {
        this.priceListItemId = priceListItemId;
    }
}
