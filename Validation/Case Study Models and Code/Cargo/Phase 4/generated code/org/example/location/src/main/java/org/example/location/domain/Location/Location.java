package org.example.location.domain.Location;

import javax.persistence.Entity;

@Entity()
public class Location {

    public Location() {
    }

    private String portcode;

    public String getPortcode() {
        return portcode;
    }

    public void setPortcode(String portcode) {
        this.portcode = portcode;
    }

    public Location(String portcode) {
        this.portcode = portcode;
    }
}
