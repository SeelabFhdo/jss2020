package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingWaitlistMember {

    public MeetingWaitlistMember() {
    }

    private MemberId MemberId;

    public MemberId getMemberId() {
        return MemberId;
    }

    private MeetingId MeetingId;

    public MeetingId getMeetingId() {
        return MeetingId;
    }

    private Date SignUpDate;

    public Date getSignUpDate() {
        return SignUpDate;
    }

    private boolean _isSignedOff;

    private Date _signOffDate;

    private boolean _isMovedToAttendees;

    private Date _movedToAttendeesDate;

    public MeetingWaitlistMember(MemberId MemberId, MeetingId MeetingId, Date SignUpDate, boolean _isSignedOff, Date _signOffDate, boolean _isMovedToAttendees, Date _movedToAttendeesDate) {
        this.MemberId = MemberId;
        this.MeetingId = MeetingId;
        this.SignUpDate = SignUpDate;
        this._isSignedOff = _isSignedOff;
        this._signOffDate = _signOffDate;
        this._isMovedToAttendees = _isMovedToAttendees;
        this._movedToAttendeesDate = _movedToAttendeesDate;
    }

    private void MeetingWaitlistMember(MeetingId meetingId, MemberId memberId) {
    }

    public MeetingWaitlistMember createNew(MeetingId meetingId, MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void markIsMovedToAttendees() {
    }

    public boolean isActiveOnWaitList(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isActive() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void signOff() {
    }
}
