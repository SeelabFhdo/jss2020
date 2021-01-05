package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingAttendee {

    public MeetingAttendee() {
    }

    private MemberId AttendeeId;

    public MemberId getAttendeeId() {
        return AttendeeId;
    }

    private MeetingId MeetingId;

    public MeetingId getMeetingId() {
        return MeetingId;
    }

    private Date _decisionDate;

    private MeetingAttendeeRole _role;

    private int _guestsNumber;

    private boolean _decisionChanged;

    private Date _decisionChangeDate;

    private Date _removedDate;

    private MemberId _removingMemberId;

    private String _removingReason;

    private boolean _isRemoved;

    private MoneyValue _fee;

    private boolean _isFeePaid;

    public MeetingAttendee(MemberId AttendeeId, MeetingId MeetingId, Date _decisionDate, MeetingAttendeeRole _role, int _guestsNumber, boolean _decisionChanged, Date _decisionChangeDate, Date _removedDate, MemberId _removingMemberId, String _removingReason, boolean _isRemoved, MoneyValue _fee, boolean _isFeePaid) {
        this.AttendeeId = AttendeeId;
        this.MeetingId = MeetingId;
        this._decisionDate = _decisionDate;
        this._role = _role;
        this._guestsNumber = _guestsNumber;
        this._decisionChanged = _decisionChanged;
        this._decisionChangeDate = _decisionChangeDate;
        this._removedDate = _removedDate;
        this._removingMemberId = _removingMemberId;
        this._removingReason = _removingReason;
        this._isRemoved = _isRemoved;
        this._fee = _fee;
        this._isFeePaid = _isFeePaid;
    }

    public MeetingAttendee createNew(MeetingId meetingId, MemberId attendeeId, Date decisionDate, MeetingAttendeeRole role, int guestsNumber, MoneyValue eventFee) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void MeetingAttendee(MeetingId meetingId, MemberId attendeeId, Date decisionDate, MeetingAttendeeRole role, int guestsNumber, MoneyValue eventFee) {
    }

    public void ChangeDecision() {
    }

    public boolean isActiveAttendee(MemberId attendeeId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isActive() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isActiveHost() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int getAttendeeWithGuestsNumber() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setAsHost() {
    }

    public void setAsAttendee() {
    }

    public void remove(MemberId removingMemberId, String reason) {
    }

    public void markFeeAsPayed() {
    }
}
