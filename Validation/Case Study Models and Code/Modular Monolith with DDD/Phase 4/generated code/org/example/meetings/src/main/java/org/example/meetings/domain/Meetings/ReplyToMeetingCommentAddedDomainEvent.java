package org.example.meetings.domain.Meetings;

public class ReplyToMeetingCommentAddedDomainEvent {

    public ReplyToMeetingCommentAddedDomainEvent() {
    }

    private String reply;

    public String getReply() {
        return reply;
    }

    private MeetingCommentId meetingcommentid;

    public MeetingCommentId getMeetingcommentid() {
        return meetingcommentid;
    }

    public void setMeetingcommentid(MeetingCommentId meetingcommentid) {
        this.meetingcommentid = meetingcommentid;
    }

    private MeetingCommentId inReplyToCommentId;

    public MeetingCommentId getInReplyToCommentId() {
        return inReplyToCommentId;
    }

    public void setInReplyToCommentId(MeetingCommentId inReplyToCommentId) {
        this.inReplyToCommentId = inReplyToCommentId;
    }

    public ReplyToMeetingCommentAddedDomainEvent(String reply, MeetingCommentId meetingcommentid, MeetingCommentId inReplyToCommentId) {
        this.reply = reply;
        this.meetingcommentid = meetingcommentid;
        this.inReplyToCommentId = inReplyToCommentId;
    }
}
