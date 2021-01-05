package org.example.payments.domain.Payments;

import javax.persistence.Entity;

@Entity()
public class MeetingFee {

    public MeetingFee() {
    }

    private PayerId _payerId;

    private MeetingId _meetingId;

    private MoneyValue _fee;

    private MeetingFeeStatus _status;

    public MeetingFee(PayerId _payerId, MeetingId _meetingId, MoneyValue _fee, MeetingFeeStatus _status) {
        this._payerId = _payerId;
        this._meetingId = _meetingId;
        this._fee = _fee;
        this._status = _status;
    }

    public MeetingFee create(PayerId payerId, MeetingId meetingId, MoneyValue fee) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void markAsPaid() {
    }

    public MeetingFeeSnapshot getSnapshot() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void whenMeetingFeeCreated(MeetingFeeCreatedDomainEvent meetingFeeCreated) {
    }

    private void whenMeetingFeeCanceled(MeetingFeeCanceledDomainEvent meetingFeeCanceled) {
    }

    private void whenMeetingFeeExpired(MeetingFeeExpiredDomainEvent meetingFeeExpired) {
    }

    private void whenMeetingFeePaid(MeetingFeePaidDomainEvent meetingFeePaid) {
    }
}
