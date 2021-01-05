package org.example.administration.domain.Administration;

public class MeetingGroupProposalStatus {

    public MeetingGroupProposalStatus() {
    }

    private String value;

    public String getValue() {
        return value;
    }

    public MeetingGroupProposalStatus(String value) {
        this.value = value;
    }

    public MeetingGroupProposalStatus toVerify() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupProposalStatus verified() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupProposalStatus create(String value) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
