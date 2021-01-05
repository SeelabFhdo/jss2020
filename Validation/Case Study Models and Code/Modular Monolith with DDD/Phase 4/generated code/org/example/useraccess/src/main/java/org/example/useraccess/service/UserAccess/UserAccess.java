package org.example.useraccess.service.UserAccess;

import de.fhdo.lemma.msa.services.LemmaMicroservice;
import de.fhdo.lemma.msa.services.LemmaMicroserviceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LemmaMicroservice(type = LemmaMicroserviceType.FUNCTIONAL)
@SpringBootApplication(scanBasePackages = "org.example.useraccess")
public class UserAccess {

    public static void main(String[] args) {
        SpringApplication.run(UserAccess.class, args);
    }
}
