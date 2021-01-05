package org.example.payments.domain.Payments;

public class PriceListItemActivatedDomainEvent {

    public PriceListItemActivatedDomainEvent() {
    }

    private String priceListItemId;

    public String getPriceListItemId() {
        return priceListItemId;
    }

    public PriceListItemActivatedDomainEvent(String priceListItemId) {
        this.priceListItemId = priceListItemId;
    }
}
