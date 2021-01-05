package org.example.meetings.domain.Meetings;

public class MeetingGroupMemberRole {

    public MeetingGroupMemberRole() {
    }

    private String value;

    public String getValue() {
        return value;
    }

    public MeetingGroupMemberRole(String value) {
        this.value = value;
    }

    public MeetingGroupMemberRole Organizer() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupMemberRole Member() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupMemberRole of(String roleCode) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
