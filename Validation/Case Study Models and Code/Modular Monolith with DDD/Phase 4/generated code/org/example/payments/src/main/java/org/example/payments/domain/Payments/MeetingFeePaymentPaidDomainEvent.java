package org.example.payments.domain.Payments;

public class MeetingFeePaymentPaidDomainEvent {

    public MeetingFeePaymentPaidDomainEvent() {
    }

    private String meetingFeePaymentId;

    public String getMeetingFeePaymentId() {
        return meetingFeePaymentId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public MeetingFeePaymentPaidDomainEvent(String meetingFeePaymentId, String status) {
        this.meetingFeePaymentId = meetingFeePaymentId;
        this.status = status;
    }
}
