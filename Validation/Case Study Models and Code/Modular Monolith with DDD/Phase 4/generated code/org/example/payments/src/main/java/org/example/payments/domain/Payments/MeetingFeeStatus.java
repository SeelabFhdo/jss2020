package org.example.payments.domain.Payments;

public class MeetingFeeStatus {

    public MeetingFeeStatus() {
    }

    private String code;

    public String getCode() {
        return code;
    }

    public MeetingFeeStatus(String code) {
        this.code = code;
    }

    public MeetingFeeStatus waitingForPayment() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeeStatus paid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeeStatus expired() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeeStatus canceled() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeeStatus of(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
