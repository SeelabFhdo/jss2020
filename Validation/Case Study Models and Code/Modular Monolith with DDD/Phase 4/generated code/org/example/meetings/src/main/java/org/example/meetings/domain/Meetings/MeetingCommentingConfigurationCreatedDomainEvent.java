package org.example.meetings.domain.Meetings;

public class MeetingCommentingConfigurationCreatedDomainEvent {

    public MeetingCommentingConfigurationCreatedDomainEvent() {
    }

    private boolean isEnabled;

    public boolean getIsEnabled() {
        return isEnabled;
    }

    private MeetingId meetingid;

    public MeetingId getMeetingid() {
        return meetingid;
    }

    public void setMeetingid(MeetingId meetingid) {
        this.meetingid = meetingid;
    }

    public MeetingCommentingConfigurationCreatedDomainEvent(boolean isEnabled, MeetingId meetingid) {
        this.isEnabled = isEnabled;
        this.meetingid = meetingid;
    }
}
