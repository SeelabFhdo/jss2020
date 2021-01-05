package org.example.payments.domain.Payments;

public class MeetingFeePaidDomainEvent {

    public MeetingFeePaidDomainEvent() {
    }

    private String status;

    public String getStatus() {
        return status;
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    public MeetingFeePaidDomainEvent(String status, String meetingFeeId) {
        this.status = status;
        this.meetingFeeId = meetingFeeId;
    }
}
