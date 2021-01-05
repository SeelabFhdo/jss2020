package org.example.useraccess.service.UserAccess.interfaces;

import org.example.useraccess.domain.UserAccess.RegisterNewUserCommand;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
@RequestMapping(value = {"users"})
public class Commands {

    @PutMapping(value = "registerNewUser")
    protected void registerNewUser(@RequestBody() RegisterNewUserCommand commandInfo) {
        checkRequiredParametersOfRegisterNewUser(commandInfo);
    }

    private void checkRequiredParametersOfRegisterNewUser(RegisterNewUserCommand commandInfo) {
        if (commandInfo == null)
            throw new IllegalArgumentException("Required parameter \"commandInfo\" must not be null");
    }
}
