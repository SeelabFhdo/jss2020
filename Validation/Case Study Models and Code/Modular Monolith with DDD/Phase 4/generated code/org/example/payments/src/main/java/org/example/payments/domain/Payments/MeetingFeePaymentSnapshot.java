package org.example.payments.domain.Payments;

public class MeetingFeePaymentSnapshot {

    public MeetingFeePaymentSnapshot() {
    }

    private String meetingFeePaymentId;

    public String getMeetingFeePaymentId() {
        return meetingFeePaymentId;
    }

    private String meetingFeeId;

    public String getMeetingFeeId() {
        return meetingFeeId;
    }

    public MeetingFeePaymentSnapshot(String meetingFeePaymentId, String meetingFeeId) {
        this.meetingFeePaymentId = meetingFeePaymentId;
        this.meetingFeeId = meetingFeeId;
    }
}
