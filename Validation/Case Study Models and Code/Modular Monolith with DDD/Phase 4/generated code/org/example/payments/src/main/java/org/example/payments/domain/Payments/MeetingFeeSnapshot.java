package org.example.payments.domain.Payments;

public class MeetingFeeSnapshot {

    public MeetingFeeSnapshot() {
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    private String payerId;

    public String getPayerId() {
        return payerId;
    }

    private String meetingId;

    public String getMeetingId() {
        return meetingId;
    }

    public MeetingFeeSnapshot(String meetingFeeId, String payerId, String meetingId) {
        this.meetingFeeId = meetingFeeId;
        this.payerId = payerId;
        this.meetingId = meetingId;
    }
}
