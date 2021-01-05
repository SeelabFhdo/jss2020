package org.example.payments.domain.Payments;

import java.util.ArrayList;

public class ListPriceListItem extends ArrayList<ListPriceListItem.ListPriceListItemItem> {

    public static class ListPriceListItemItem {

        public ListPriceListItemItem() {
        }

        private PriceListItem priceListItem;

        public PriceListItem getPriceListItem() {
            return priceListItem;
        }

        public void setPriceListItem(PriceListItem priceListItem) {
            this.priceListItem = priceListItem;
        }

        public ListPriceListItemItem(PriceListItem priceListItem) {
            this.priceListItem = priceListItem;
        }
    }
}
