package org.example.administration.domain.Administration;

import java.util.Date;

public class MeetingGroupProposalDecision {

    public MeetingGroupProposalDecision() {
    }

    private Date date;

    public Date getDate() {
        return date;
    }

    private UserId userId;

    public UserId getUserId() {
        return userId;
    }

    private String code;

    public String getCode() {
        return code;
    }

    private String rejectReason;

    public String getRejectReason() {
        return rejectReason;
    }

    public MeetingGroupProposalDecision(Date date, UserId userId, String code, String rejectReason) {
        this.date = date;
        this.userId = userId;
        this.code = code;
        this.rejectReason = rejectReason;
    }

    public MeetingGroupProposalDecision noDecision() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private boolean isAccepted() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private boolean isRejected() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupProposalDecision acceptDecision() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupProposalDecision rejectDecision() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingGroupProposalStatus getStatusForDecision() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
