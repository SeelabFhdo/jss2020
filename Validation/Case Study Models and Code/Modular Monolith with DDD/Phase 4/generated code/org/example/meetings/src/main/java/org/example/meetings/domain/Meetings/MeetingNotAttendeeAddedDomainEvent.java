package org.example.meetings.domain.Meetings;

public class MeetingNotAttendeeAddedDomainEvent {

    public MeetingNotAttendeeAddedDomainEvent() {
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

    public MeetingNotAttendeeAddedDomainEvent(MemberId memberid, MeetingId meetingid) {
        this.memberid = memberid;
        this.meetingid = meetingid;
    }
}
