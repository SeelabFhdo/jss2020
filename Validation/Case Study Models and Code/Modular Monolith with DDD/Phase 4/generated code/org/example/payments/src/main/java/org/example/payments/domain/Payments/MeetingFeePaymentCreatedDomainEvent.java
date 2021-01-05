package org.example.payments.domain.Payments;

public class MeetingFeePaymentCreatedDomainEvent {

    public MeetingFeePaymentCreatedDomainEvent() {
    }

    private String meetingFeePaymentId;

    public String getMeetingFeePaymentId() {
        return meetingFeePaymentId;
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public MeetingFeePaymentCreatedDomainEvent(String meetingFeePaymentId, String meetingFeeId, String status) {
        this.meetingFeePaymentId = meetingFeePaymentId;
        this.meetingFeeId = meetingFeeId;
        this.status = status;
    }
}
