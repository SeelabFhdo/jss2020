package org.example.payments.domain.Payments;

public class MeetingFeeCreatedDomainEvent {

    public MeetingFeeCreatedDomainEvent() {
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    private double feeValue;

    public double getFeeValue() {
        return feeValue;
    }

    private String feeCurrency;

    public String getFeeCurrency() {
        return feeCurrency;
    }

    private String meetingId;

    public String getMeetingId() {
        return meetingId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    public MeetingFeeCreatedDomainEvent(String meetingFeeId, double feeValue, String feeCurrency, String meetingId, String status, String payerId) {
        this.meetingFeeId = meetingFeeId;
        this.feeValue = feeValue;
        this.feeCurrency = feeCurrency;
        this.meetingId = meetingId;
        this.status = status;
        this.payerId = payerId;
    }
}
