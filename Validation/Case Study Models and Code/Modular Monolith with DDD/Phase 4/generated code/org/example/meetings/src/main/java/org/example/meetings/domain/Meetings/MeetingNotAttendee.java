package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingNotAttendee {

    public MeetingNotAttendee() {
    }

    private MemberId MemberId;

    public MemberId getMemberId() {
        return MemberId;
    }

    private MeetingId MeetingId;

    public MeetingId getMeetingId() {
        return MeetingId;
    }

    private Date _decisionDate;

    private boolean _decisionChanged;

    private Date _decisionChangeDate;

    public MeetingNotAttendee(MemberId MemberId, MeetingId MeetingId, Date _decisionDate, boolean _decisionChanged, Date _decisionChangeDate) {
        this.MemberId = MemberId;
        this.MeetingId = MeetingId;
        this._decisionDate = _decisionDate;
        this._decisionChanged = _decisionChanged;
        this._decisionChangeDate = _decisionChangeDate;
    }

    private void MeetingNotAttendee(MeetingId meetingId, MemberId memberId) {
    }

    public MeetingNotAttendee createNew(MeetingId meetingId, MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isActiveNotAttendee(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void changeDecision() {
    }
}
