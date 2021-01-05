package org.example.payments.domain.Payments;

import java.util.Date;

public class MeetingFeePaidIntegrationEvent {

    public MeetingFeePaidIntegrationEvent() {
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Date occuredOn;

    public Date getOccuredOn() {
        return occuredOn;
    }

    public void setOccuredOn(Date occuredOn) {
        this.occuredOn = occuredOn;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    private String meetingId;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public MeetingFeePaidIntegrationEvent(String id, Date occuredOn, String payerId, String meetingId) {
        this.id = id;
        this.occuredOn = occuredOn;
        this.payerId = payerId;
        this.meetingId = meetingId;
    }
}
