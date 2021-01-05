package org.example.payments.domain.Payments;

import java.util.Date;

public class SubscriptionExpirationDateChangedIntegrationEvent {

    public SubscriptionExpirationDateChangedIntegrationEvent() {
    }

    private Date occuredOn;

    public Date getOccuredOn() {
        return occuredOn;
    }

    public void setOccuredOn(Date occuredOn) {
        this.occuredOn = occuredOn;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    private Date expirationDate;

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SubscriptionExpirationDateChangedIntegrationEvent(Date occuredOn, String id, String payerId, Date expirationDate) {
        this.occuredOn = occuredOn;
        this.id = id;
        this.payerId = payerId;
        this.expirationDate = expirationDate;
    }
}
