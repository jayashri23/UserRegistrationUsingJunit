package com.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {@Test
public void givenFirstName_WhenProper_ShouldReturnTrue() {
    UserRegistration userRegistration = new UserRegistration();
    boolean fName = userRegistration.validateFirstName("Jayashri");
    Assert.assertTrue(fName);
}

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lName = userRegistration.validateLastName("Vadde");
        Assert.assertTrue(lName);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(email);
    }
}