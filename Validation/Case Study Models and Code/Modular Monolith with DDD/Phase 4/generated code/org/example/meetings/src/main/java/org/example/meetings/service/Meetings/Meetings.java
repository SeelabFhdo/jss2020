package org.example.meetings.service.Meetings;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "org.example.meetings")
public class Meetings {

    public static void main(String[] args) {
        SpringApplication.run(Meetings.class, args);
    }
}
