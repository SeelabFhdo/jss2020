package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingGroupMember {

    public MeetingGroupMember() {
    }

    private MeetingGroupId MeetingGroupId;

    public MeetingGroupId getMeetingGroupId() {
        return MeetingGroupId;
    }

    private MemberId MemberId;

    public MemberId getMemberId() {
        return MemberId;
    }

    private MeetingGroupMemberRole _role;

    private Date JoinedDate;

    public Date getJoinedDate() {
        return JoinedDate;
    }

    private boolean _isActive;

    private Date _leaveDate;

    public MeetingGroupMember(MeetingGroupId MeetingGroupId, MemberId MemberId, MeetingGroupMemberRole _role, Date JoinedDate, boolean _isActive, Date _leaveDate) {
        this.MeetingGroupId = MeetingGroupId;
        this.MemberId = MemberId;
        this._role = _role;
        this.JoinedDate = JoinedDate;
        this._isActive = _isActive;
        this._leaveDate = _leaveDate;
    }

    private void MeetingGroupMember(MeetingGroupId meetingGroupId, MemberId memberId, MeetingGroupMemberRole role) {
    }

    public MeetingGroupMember createNew(MeetingGroupId meetingGroupId, MemberId memberId, MeetingGroupMemberRole role) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void leave() {
    }

    public boolean isMember(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean IsOrganizer(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
