package org.example.administration.domain.Administration;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingGroupProposal {

    public MeetingGroupProposal() {
    }

    private String _name;

    private String _description;

    private MeetingGroupLocation _location;

    private Date _proposalDate;

    private UserId _proposalUserId;

    private MeetingGroupProposalId id;

    public MeetingGroupProposalId getId() {
        return id;
    }

    private MeetingGroupProposalDecision meetinggroupproposaldecision;

    private MeetingGroupProposalStatus meetinggroupproposalstatus;

    public MeetingGroupProposal(String _name, String _description, MeetingGroupLocation _location, Date _proposalDate, UserId _proposalUserId, MeetingGroupProposalId id, MeetingGroupProposalDecision meetinggroupproposaldecision, MeetingGroupProposalStatus meetinggroupproposalstatus) {
        this._name = _name;
        this._description = _description;
        this._location = _location;
        this._proposalDate = _proposalDate;
        this._proposalUserId = _proposalUserId;
        this.id = id;
        this.meetinggroupproposaldecision = meetinggroupproposaldecision;
        this.meetinggroupproposalstatus = meetinggroupproposalstatus;
    }

    private void MeetingGroupProposal(MeetingGroupProposalId id, String name, String decision, MeetingGroupLocation location, UserId proposalUserId, Date proposalDate) {
    }

    public void accept(UserId userId) {
    }

    public void reject(UserId userId, String rejectReason) {
    }

    public MeetingGroupProposal createToVerify(String meetingGroupProposalId, String name, String description, MeetingGroupLocation location, UserId proposalUserId, Date proposalDate) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
