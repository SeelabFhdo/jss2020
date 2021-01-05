package org.example.meetings.domain.Meetings;

public class MeetingMainAttributesChangedDomainEvent {

    public MeetingMainAttributesChangedDomainEvent() {
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingMainAttributesChangedDomainEvent(MeetingId meetingid) {
        this.meetingid = meetingid;
    }
}
