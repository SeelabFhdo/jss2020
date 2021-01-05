package org.example.meetings.domain.Meetings;

public class MeetingCommentingDisabledDomainEvent {

    public MeetingCommentingDisabledDomainEvent() {
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingCommentingDisabledDomainEvent(MeetingId meetingid) {
        this.meetingid = meetingid;
    }
}
