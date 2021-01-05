package org.example.meetings.domain.Meetings;

public class MeetingCommentEditedDomainEvent {

    public MeetingCommentEditedDomainEvent() {
    }

    private String editedComment;

    public String getEditedComment() {
        return editedComment;
    }

    private MeetingCommentId meetingcommentid;

    public MeetingCommentId getMeetingcommentid() {
        return meetingcommentid;
    }

    public void setMeetingcommentid(MeetingCommentId meetingcommentid) {
        this.meetingcommentid = meetingcommentid;
    }

    public MeetingCommentEditedDomainEvent(String editedComment, MeetingCommentId meetingcommentid) {
        this.editedComment = editedComment;
        this.meetingcommentid = meetingcommentid;
    }
}
