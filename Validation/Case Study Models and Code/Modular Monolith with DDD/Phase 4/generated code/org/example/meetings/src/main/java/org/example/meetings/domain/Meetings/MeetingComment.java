package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingComment {

    public MeetingComment() {
    }

    private MeetingCommentId Id;

    public MeetingCommentId getId() {
        return Id;
    }

    private MeetingId _meetingId;

    private MemberId _authorId;

    private MeetingCommentId _inReplyToCommentId;

    private String _comment;

    private Date _createDate;

    private Date _editDate;

    private boolean _isRemoved;

    private String _removedByReason;

    public MeetingComment(MeetingCommentId Id, MeetingId _meetingId, MemberId _authorId, MeetingCommentId _inReplyToCommentId, String _comment, Date _createDate, Date _editDate, boolean _isRemoved, String _removedByReason) {
        this.Id = Id;
        this._meetingId = _meetingId;
        this._authorId = _authorId;
        this._inReplyToCommentId = _inReplyToCommentId;
        this._comment = _comment;
        this._createDate = _createDate;
        this._editDate = _editDate;
        this._isRemoved = _isRemoved;
        this._removedByReason = _removedByReason;
    }

    private void MeetingComment(MeetingId meetingId, MemberId authorId, String comment, MeetingCommentId inReplyToCommentId, MeetingCommentingConfiguration meetingCommentingConfiguration, MeetingGroup meetingGroup) {
    }

    public void edit(MemberId editorId, String editedComment, MeetingCommentingConfiguration meetingCommentingConfiguration) {
    }

    public void remove(MemberId removingMemberId, MeetingGroup meetingGroup, String reason) {
    }

    public MeetingComment reply(MemberId replierId, String reply, MeetingGroup meetingGroup, MeetingCommentingConfiguration meetingCommentingConfiguration) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingId getMeetingId() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingComment create(MeetingId meetingId, MemberId authorId, String comment, MeetingGroup meetingGroup, MeetingCommentingConfiguration meetingCommentingConfiguration) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
