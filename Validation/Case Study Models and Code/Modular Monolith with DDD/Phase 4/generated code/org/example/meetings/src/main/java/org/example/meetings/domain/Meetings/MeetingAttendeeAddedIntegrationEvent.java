package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MeetingAttendeeAddedIntegrationEvent {

    public MeetingAttendeeAddedIntegrationEvent() {
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

    private String meetingId;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    private String attendeeId;

    public String getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    private double feeValue;

    public double getFeeValue() {
        return feeValue;
    }

    public void setFeeValue(double feeValue) {
        this.feeValue = feeValue;
    }

    private String feeCurrency;

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    public MeetingAttendeeAddedIntegrationEvent(String id, Date occuredOn, String meetingId, String attendeeId, double feeValue, String feeCurrency) {
        this.id = id;
        this.occuredOn = occuredOn;
        this.meetingId = meetingId;
        this.attendeeId = attendeeId;
        this.feeValue = feeValue;
        this.feeCurrency = feeCurrency;
    }
}
