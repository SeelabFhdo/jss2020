package org.example.meetings.domain.Meetings;

public class MeetingEditedDomainEvent {

    public MeetingEditedDomainEvent() {
    }

    private String meetingId;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public MeetingEditedDomainEvent(String meetingId) {
        this.meetingId = meetingId;
    }
}
