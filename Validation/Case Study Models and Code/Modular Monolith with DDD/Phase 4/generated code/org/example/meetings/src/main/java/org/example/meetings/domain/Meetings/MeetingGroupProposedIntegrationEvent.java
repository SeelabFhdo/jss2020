package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MeetingGroupProposedIntegrationEvent {

    public MeetingGroupProposedIntegrationEvent() {
    }

    private String meetingGroupProposalId;

    public String getMeetingGroupProposalId() {
        return meetingGroupProposalId;
    }

    public void setMeetingGroupProposalId(String meetingGroupProposalId) {
        this.meetingGroupProposalId = meetingGroupProposalId;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String locationCity;

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    private String locationCountryCode;

    public String getLocationCountryCode() {
        return locationCountryCode;
    }

    public void setLocationCountryCode(String locationCountryCode) {
        this.locationCountryCode = locationCountryCode;
    }

    private String proposalUserId;

    public String getProposalUserId() {
        return proposalUserId;
    }

    public void setProposalUserId(String proposalUserId) {
        this.proposalUserId = proposalUserId;
    }

    private Date ProposalDate;

    public Date getProposalDate() {
        return ProposalDate;
    }

    public void setProposalDate(Date ProposalDate) {
        this.ProposalDate = ProposalDate;
    }

    public MeetingGroupProposedIntegrationEvent(String meetingGroupProposalId, String name, String description, String locationCity, String locationCountryCode, String proposalUserId, Date ProposalDate) {
        this.meetingGroupProposalId = meetingGroupProposalId;
        this.name = name;
        this.description = description;
        this.locationCity = locationCity;
        this.locationCountryCode = locationCountryCode;
        this.proposalUserId = proposalUserId;
        this.ProposalDate = ProposalDate;
    }
}
