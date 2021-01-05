package org.example.meetings.domain.Meetings;

public class MeetingGroupCreatedDomainEvent {

    public MeetingGroupCreatedDomainEvent() {
    }

    private MeetingGroupId meetinggroupid;

    public MeetingGroupId getMeetinggroupid() {
        return meetinggroupid;
    }

    public void setMeetinggroupid(MeetingGroupId meetinggroupid) {
        this.meetinggroupid = meetinggroupid;
    }

    private MemberId creatorId;

    public MemberId getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(MemberId creatorId) {
        this.creatorId = creatorId;
    }

    public MeetingGroupCreatedDomainEvent(MeetingGroupId meetinggroupid, MemberId creatorId) {
        this.meetinggroupid = meetinggroupid;
        this.creatorId = creatorId;
    }
}
