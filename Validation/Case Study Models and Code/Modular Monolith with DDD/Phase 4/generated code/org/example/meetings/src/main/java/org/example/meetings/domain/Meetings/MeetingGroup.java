package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class MeetingGroup {

    public MeetingGroup() {
    }

    private MeetingGroupId Id;

    public MeetingGroupId getId() {
        return Id;
    }

    private String _name;

    private String _description;

    private MeetingGroupLocation _location;

    private MemberId _creatorId;

    private MeetingGroupMembers _members;

    private Date _createDate;

    private Date _paymentDateTo;

    public MeetingGroup(MeetingGroupId Id, String _name, String _description, MeetingGroupLocation _location, MemberId _creatorId, MeetingGroupMembers _members, Date _createDate, Date _paymentDateTo) {
        this.Id = Id;
        this._name = _name;
        this._description = _description;
        this._location = _location;
        this._creatorId = _creatorId;
        this._members = _members;
        this._createDate = _createDate;
        this._paymentDateTo = _paymentDateTo;
    }

    public MeetingGroup createBasedOnProposal(MeetingGroupProposalId meetingGroupProposalId, String name, String description, MeetingGroupLocation location, MemberId creatorId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void MeetingGroup(MeetingGroupProposalId meetingGroupProposalId, String name, String description, MeetingGroupLocation location, MemberId creatorId) {
    }

    public void editGeneralAttributes(String name, String description, MeetingGroupLocation location) {
    }

    public void joinToGroupMember(MemberId memberId) {
    }

    public void leaveGroup(MemberId memberId) {
    }

    public void setExpirationDate(Date dateTo) {
    }

    public Meeting createMeeting(String title, MeetingTerm term, String description, MeetingLocation location, int attendeesLimit, int guestsLimit, Term rsvpTerm, MoneyValue eventFee, MemberIds hostsMembersIds, MemberId creatorId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isMemberOfGroup(MemberId attendeeId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isOrganizer(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
