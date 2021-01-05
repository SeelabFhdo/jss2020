package org.example.meetings.domain.Meetings;

public class MemberSignedOffFromMeetingWaitlistDomainEvent {

    public MemberSignedOffFromMeetingWaitlistDomainEvent() {
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

    public MemberSignedOffFromMeetingWaitlistDomainEvent(MeetingId meetingid, MemberId memberid) {
        this.meetingid = meetingid;
        this.memberid = memberid;
    }
}
