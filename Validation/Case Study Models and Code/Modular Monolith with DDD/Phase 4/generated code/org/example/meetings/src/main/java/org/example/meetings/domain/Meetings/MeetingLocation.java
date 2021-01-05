package org.example.meetings.domain.Meetings;

public class MeetingLocation {

    public MeetingLocation() {
    }

    private String Name;

    public String getName() {
        return Name;
    }

    private String Address;

    public String getAddress() {
        return Address;
    }

    private String PostalCode;

    public String getPostalCode() {
        return PostalCode;
    }

    private String City;

    public String getCity() {
        return City;
    }

    public MeetingLocation(String Name, String Address, String PostalCode, String City) {
        this.Name = Name;
        this.Address = Address;
        this.PostalCode = PostalCode;
        this.City = City;
    }

    public MeetingLocation createNew(String name, String address, String postalCode, String city) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
