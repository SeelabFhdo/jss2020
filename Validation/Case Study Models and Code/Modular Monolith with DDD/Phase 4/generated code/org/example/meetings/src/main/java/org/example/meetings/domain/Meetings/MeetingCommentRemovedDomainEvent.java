package org.example.meetings.domain.Meetings;

public class MeetingCommentRemovedDomainEvent {

    public MeetingCommentRemovedDomainEvent() {
    }

    private MeetingCommentId meetingcommentid;

    public MeetingCommentId getMeetingcommentid() {
        return meetingcommentid;
    }

    public void setMeetingcommentid(MeetingCommentId meetingcommentid) {
        this.meetingcommentid = meetingcommentid;
    }

    public MeetingCommentRemovedDomainEvent(MeetingCommentId meetingcommentid) {
        this.meetingcommentid = meetingcommentid;
    }
}
