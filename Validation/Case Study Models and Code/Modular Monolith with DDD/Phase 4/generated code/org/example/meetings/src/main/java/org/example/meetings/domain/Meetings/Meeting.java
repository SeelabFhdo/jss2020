package org.example.meetings.domain.Meetings;

import java.util.Date;
import javax.persistence.Entity;

@Entity()
public class Meeting {

    public Meeting() {
    }

    private MeetingId Id;

    public MeetingId getId() {
        return Id;
    }

    private MeetingGroupId _meetingGroupId;

    private String _title;

    private MeetingTerm _term;

    private String _description;

    private MeetingLimits _meetingLimits;

    private Term _rsvpTerm;

    private MoneyValue _eventFee;

    private MemberId _creatorId;

    private Date _createDate;

    private MemberId _changeMemberId;

    private Date _changeDate;

    private Date _cancelDate;

    private MemberId _cancelMemberId;

    private boolean _isCanceled;

    private ListMeetingAttendee meetingattendee;

    private ListMeetingNotAttendee meetingnotattendee;

    private ListMeetingWaitlistMember meetingwaitlistmember;

    private MeetingLocation meetinglocation;

    public Meeting(MeetingId Id, MeetingGroupId _meetingGroupId, String _title, MeetingTerm _term, String _description, MeetingLimits _meetingLimits, Term _rsvpTerm, MoneyValue _eventFee, MemberId _creatorId, Date _createDate, MemberId _changeMemberId, Date _changeDate, Date _cancelDate, MemberId _cancelMemberId, boolean _isCanceled, ListMeetingAttendee meetingattendee, ListMeetingNotAttendee meetingnotattendee, ListMeetingWaitlistMember meetingwaitlistmember, MeetingLocation meetinglocation) {
        this.Id = Id;
        this._meetingGroupId = _meetingGroupId;
        this._title = _title;
        this._term = _term;
        this._description = _description;
        this._meetingLimits = _meetingLimits;
        this._rsvpTerm = _rsvpTerm;
        this._eventFee = _eventFee;
        this._creatorId = _creatorId;
        this._createDate = _createDate;
        this._changeMemberId = _changeMemberId;
        this._changeDate = _changeDate;
        this._cancelDate = _cancelDate;
        this._cancelMemberId = _cancelMemberId;
        this._isCanceled = _isCanceled;
        this.meetingattendee = meetingattendee;
        this.meetingnotattendee = meetingnotattendee;
        this.meetingwaitlistmember = meetingwaitlistmember;
        this.meetinglocation = meetinglocation;
    }

    public Meeting createNew(MeetingGroupId meetingGroupId, String title, MeetingTerm term, String description, MeetingLocation location, MeetingLimits meetingLimits, Term rsvpTerm, MoneyValue eventFee, MemberIds hostsMembersIds, MemberId creatorId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void Meeting(MeetingGroupId meetingGroupId, String title, MeetingTerm term, String description, MeetingLocation location, MeetingLimits meetingLimits, Term rsvpTerm, MoneyValue eventFee, MemberIds hostsMembersIds, MemberId creatorId) {
    }

    public void changeMainAttributes(String title, MeetingTerm term, String description, MeetingLocation location, MeetingLimits meetingLimits, Term rsvpTerm, MoneyValue eventFee, MemberId modifyUserId) {
    }

    public void addAttendee(MeetingGroup meetingGroup, MemberId attendeeId, int guestsNumber) {
    }

    public void addNotAttendee(MemberId memberId) {
    }

    public void changeNotAttendeeDecision(MemberId memberId) {
    }

    public void signUpMemberToWaitlist(MeetingGroup meetingGroup, MemberId memberId) {
    }

    public void signOffMemberFromWaitlist(MemberId memberId) {
    }

    public void setHostRole(MeetingGroup meetingGroup, MemberId settingMemberId, MemberId newOrganizerId) {
    }

    public void setAttendeeRole(MeetingGroup meetingGroup, MemberId settingMemberId, MemberId newOrganizerId) {
    }

    public MeetingGroupId getMeetingGroupId() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void cancel(MemberId cancelMemberId) {
    }

    public void removeAttendee(MemberId attendeeId, MemberId removingPersonId, String reason) {
    }

    public void markAttendeeFeeAsPayed(MemberId memberId) {
    }

    public MeetingComment addComment(MemberId authorId, String comment, MeetingGroup meetingGroup, MeetingCommentingConfiguration meetingCommentingConfiguration) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public MeetingCommentingConfiguration createCommentingConfiguration() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private MeetingWaitlistMember getActiveMemberOnWaitlist(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private MeetingAttendee getActiveAttendee(MemberId attendeeId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private MeetingNotAttendee getActiveNotAttendee(MemberId memberId) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private int GetAllActiveAttendeesWithGuestsNumber() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void setRsvpTerm(Term rsvpTerm, MeetingTerm meetingTerm) {
    }
}
