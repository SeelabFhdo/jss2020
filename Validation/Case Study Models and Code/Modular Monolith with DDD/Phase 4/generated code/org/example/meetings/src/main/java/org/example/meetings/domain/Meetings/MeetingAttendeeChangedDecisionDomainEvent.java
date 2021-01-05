package org.example.meetings.domain.Meetings;

public class MeetingAttendeeChangedDecisionDomainEvent {

    public MeetingAttendeeChangedDecisionDomainEvent() {
    }

    private MemberId memberid;

    public MemberId getMemberid() {
        return memberid;
    }

    public void setMemberid(MemberId memberid) {
        this.memberid = memberid;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingAttendeeChangedDecisionDomainEvent(MemberId memberid, MeetingId meetingid) {
        this.memberid = memberid;
        this.meetingid = meetingid;
    }
}
