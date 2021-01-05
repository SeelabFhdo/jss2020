package org.example.meetings.domain.Meetings;

public class MeetingGroupProposalStatus {

    public MeetingGroupProposalStatus() {
    }

    private String Value;

    public String getValue() {
        return Value;
    }

    public MeetingGroupProposalStatus(String Value) {
        this.Value = Value;
    }

    public MeetingGroupProposalStatus inVerification() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupProposalStatus accepted() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isAccepted() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
