package org.example.payments.domain.Payments;

public class MeetingFeePaymentExpiredDomainEvent {

    public MeetingFeePaymentExpiredDomainEvent() {
    }

    private String meetingFeePaymentId;

    public String getMeetingFeePaymentId() {
        return meetingFeePaymentId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public MeetingFeePaymentExpiredDomainEvent(String meetingFeePaymentId, String status) {
        this.meetingFeePaymentId = meetingFeePaymentId;
        this.status = status;
    }
}
