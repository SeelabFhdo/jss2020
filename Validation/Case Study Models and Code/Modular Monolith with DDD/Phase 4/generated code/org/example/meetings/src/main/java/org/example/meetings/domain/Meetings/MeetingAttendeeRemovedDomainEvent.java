package org.example.meetings.domain.Meetings;

public class MeetingAttendeeRemovedDomainEvent {

    public MeetingAttendeeRemovedDomainEvent() {
    }

    private String reason;

    public String getReason() {
        return reason;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    private MemberId memberid;

    public MemberId getMemberid() {
        return memberid;
    }

    public void setMemberid(MemberId memberid) {
        this.memberid = memberid;
    }

    public MeetingAttendeeRemovedDomainEvent(String reason, MeetingId meetingid, MemberId memberid) {
        this.reason = reason;
        this.meetingid = meetingid;
        this.memberid = memberid;
    }
}
