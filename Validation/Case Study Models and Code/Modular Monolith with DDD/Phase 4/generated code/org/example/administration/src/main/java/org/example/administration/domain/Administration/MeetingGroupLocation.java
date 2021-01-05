package org.example.administration.domain.Administration;

public class MeetingGroupLocation {

    public MeetingGroupLocation() {
    }

    private String city;

    public String getCity() {
        return city;
    }

    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public MeetingGroupLocation(String city, String countryCode) {
        this.city = city;
        this.countryCode = countryCode;
    }

    public MeetingGroupLocation create(String city, String countryCode) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
