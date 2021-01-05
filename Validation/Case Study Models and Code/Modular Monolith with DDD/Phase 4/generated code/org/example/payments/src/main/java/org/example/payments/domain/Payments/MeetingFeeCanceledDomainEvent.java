package org.example.payments.domain.Payments;

public class MeetingFeeCanceledDomainEvent {

    public MeetingFeeCanceledDomainEvent() {
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public MeetingFeeCanceledDomainEvent(String meetingFeeId, String status) {
        this.meetingFeeId = meetingFeeId;
        this.status = status;
    }
}
