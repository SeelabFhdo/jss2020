package org.example.meetings.domain.Meetings;

public class MeetingCommentAddedDomainEvent {

    public MeetingCommentAddedDomainEvent() {
    }

    private String comment;

    public String getComment() {
        return comment;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    private MeetingCommentId meetingcommentid;

    public MeetingCommentId getMeetingcommentid() {
        return meetingcommentid;
    }

    public void setMeetingcommentid(MeetingCommentId meetingcommentid) {
        this.meetingcommentid = meetingcommentid;
    }

    public MeetingCommentAddedDomainEvent(String comment, MeetingId meetingid, MeetingCommentId meetingcommentid) {
        this.comment = comment;
        this.meetingid = meetingid;
        this.meetingcommentid = meetingcommentid;
    }
}
