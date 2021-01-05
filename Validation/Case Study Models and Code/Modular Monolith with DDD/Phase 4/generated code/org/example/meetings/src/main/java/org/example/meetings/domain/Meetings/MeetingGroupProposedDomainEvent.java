package org.example.meetings.domain.Meetings;

import java.util.Date;

public class MeetingGroupProposedDomainEvent {

    public MeetingGroupProposedDomainEvent() {
    }

    private String name;

    public String getName() {
        return name;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    private String locationCity;

    public String getLocationCity() {
        return locationCity;
    }

    private String locationCountryCode;

    public String getLocationCountryCode() {
        return locationCountryCode;
    }

    private Date proposalDate;

    public Date getProposalDate() {
        return proposalDate;
    }

    private MeetingGroupProposalId meetinggroupproposalid;

    public MeetingGroupProposalId getMeetinggroupproposalid() {
        return meetinggroupproposalid;
    }

    public void setMeetinggroupproposalid(MeetingGroupProposalId meetinggroupproposalid) {
        this.meetinggroupproposalid = meetinggroupproposalid;
    }

    private MemberId proposalUserId;

    public MemberId getProposalUserId() {
        return proposalUserId;
    }

    public void setProposalUserId(MemberId proposalUserId) {
        this.proposalUserId = proposalUserId;
    }

    public MeetingGroupProposedDomainEvent(String name, String description, String locationCity, String locationCountryCode, Date proposalDate, MeetingGroupProposalId meetinggroupproposalid, MemberId proposalUserId) {
        this.name = name;
        this.description = description;
        this.locationCity = locationCity;
        this.locationCountryCode = locationCountryCode;
        this.proposalDate = proposalDate;
        this.meetinggroupproposalid = meetinggroupproposalid;
        this.proposalUserId = proposalUserId;
    }
}
