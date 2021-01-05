package org.example.payments.domain.Payments;

import javax.persistence.Entity;

@Entity()
public class MeetingFeePayment {

    public MeetingFeePayment() {
    }

    private MeetingFeeId _meetingFeeId;

    private MeetingFeePaymentStatus meetingfeepaymentstatus;

    public MeetingFeePayment(MeetingFeeId _meetingFeeId, MeetingFeePaymentStatus meetingfeepaymentstatus) {
        this._meetingFeeId = _meetingFeeId;
        this.meetingfeepaymentstatus = meetingfeepaymentstatus;
    }

    public MeetingFeePayment create(MeetingFeeId meetingFeeId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void expire() {
    }

    public void markAsPaid() {
    }

    public MeetingFeePaymentSnapshot getSnapshot() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void whenPaymentCreated(MeetingFeePaymentCreatedDomainEvent event) {
    }

    private void whenPaymentExpired(MeetingFeePaymentExpiredDomainEvent event) {
    }

    private void whenPaymentPaid(MeetingFeePaymentPaidDomainEvent event) {
    }
}
