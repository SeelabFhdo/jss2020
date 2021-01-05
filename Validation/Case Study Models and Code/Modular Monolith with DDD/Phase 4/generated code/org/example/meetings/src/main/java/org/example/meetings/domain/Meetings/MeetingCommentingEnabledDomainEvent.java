package org.example.meetings.domain.Meetings;

public class MeetingCommentingEnabledDomainEvent {

    public MeetingCommentingEnabledDomainEvent() {
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingCommentingEnabledDomainEvent(MeetingId meetingid) {
        this.meetingid = meetingid;
    }
}
