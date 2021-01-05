package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingGroupProposal {

    public MeetingGroupProposal() {
    }

    private MeetingGroupProposalId Id;

    public MeetingGroupProposalId getId() {
        return Id;
    }

    private String _name;

    private String _description;

    private MeetingGroupLocation _location;

    private Date _proposalDate;

    private MemberId _proposalUserId;

    private MeetingGroupProposalStatus meetinggroupproposalstatus;

    public MeetingGroupProposal(MeetingGroupProposalId Id, String _name, String _description, MeetingGroupLocation _location, Date _proposalDate, MemberId _proposalUserId, MeetingGroupProposalStatus meetinggroupproposalstatus) {
        this.Id = Id;
        this._name = _name;
        this._description = _description;
        this._location = _location;
        this._proposalDate = _proposalDate;
        this._proposalUserId = _proposalUserId;
        this.meetinggroupproposalstatus = meetinggroupproposalstatus;
    }

    public MeetingGroup createMeetingGroup() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void MeetingGroupProposal(String name, String description, MeetingGroupLocation location, MemberId proposalUserId) {
    }

    public MeetingGroupProposal proposeNew(String name, String description, MeetingGroupLocation location, MemberId proposalMemberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void accept() {
    }
}
