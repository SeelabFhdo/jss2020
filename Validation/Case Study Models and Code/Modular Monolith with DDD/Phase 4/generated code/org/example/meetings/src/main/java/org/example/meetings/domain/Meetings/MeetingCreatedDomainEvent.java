package org.example.meetings.domain.Meetings;

public class MeetingCreatedDomainEvent {

    public MeetingCreatedDomainEvent() {
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingCreatedDomainEvent(MeetingId meetingid) {
        this.meetingid = meetingid;
    }
}
