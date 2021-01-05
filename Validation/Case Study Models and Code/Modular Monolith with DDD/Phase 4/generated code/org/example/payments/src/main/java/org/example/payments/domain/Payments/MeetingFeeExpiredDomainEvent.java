package org.example.payments.domain.Payments;

public class MeetingFeeExpiredDomainEvent {

    public MeetingFeeExpiredDomainEvent() {
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public MeetingFeeExpiredDomainEvent(String meetingFeeId, String status) {
        this.meetingFeeId = meetingFeeId;
        this.status = status;
    }
}
