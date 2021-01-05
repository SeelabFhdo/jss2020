package org.example.meetings.domain.Meetings;

public class NewMeetingHostSetDomainEvent {

    public NewMeetingHostSetDomainEvent() {
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    private MemberId hostId;

    public MemberId getHostId() {
        return hostId;
    }

    public void setHostId(MemberId hostId) {
        this.hostId = hostId;
    }

    public NewMeetingHostSetDomainEvent(MeetingId meetingid, MemberId hostId) {
        this.meetingid = meetingid;
        this.hostId = hostId;
    }
}
