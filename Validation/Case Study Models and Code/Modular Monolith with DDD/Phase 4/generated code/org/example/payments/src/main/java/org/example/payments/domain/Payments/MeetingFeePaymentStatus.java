package org.example.payments.domain.Payments;

public class MeetingFeePaymentStatus {

    public MeetingFeePaymentStatus() {
    }

    private String Code;

    public String getCode() {
        return Code;
    }

    public MeetingFeePaymentStatus(String Code) {
        this.Code = Code;
    }

    public MeetingFeePaymentStatus waitingForPayment() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeePaymentStatus paid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeePaymentStatus expired() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingFeePaymentStatus of(String code) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
