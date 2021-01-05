package org.example.meetings.domain.Meetings;

import javax.persistence.Entity;

@Entity()
public class MeetingCommentingConfiguration {

    public MeetingCommentingConfiguration() {
    }

    private MeetingCommentingConfigurationId Id;

    public MeetingCommentingConfigurationId getId() {
        return Id;
    }

    private MeetingId _meetingId;

    private boolean _isCommentingEnabled;

    public MeetingCommentingConfiguration(MeetingCommentingConfigurationId Id, MeetingId _meetingId, boolean _isCommentingEnabled) {
        this.Id = Id;
        this._meetingId = _meetingId;
        this._isCommentingEnabled = _isCommentingEnabled;
    }

    public void enableCommenting(MemberId enablingMemberId, MeetingGroup meetingGroup) {
    }

    public void disableCommenting(MemberId disablingMemberId, MeetingGroup meetingGroup) {
    }

    public boolean getIsCommentingEnabled() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingCommentingConfiguration create(MeetingId meetingId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
