package com.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String fName = userRegistration.validateFirstName("Jayashri");
        Assert.assertEquals("Happy", fName);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String fName = userRegistration.validateFirstName("jay");
        Assert.assertEquals("SAD", fName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String lName = userRegistration.validateLastName("vadde");
        Assert.assertEquals("Happy", lName);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String lName = userRegistration.validateLastName("vad");
        Assert.assertEquals("SAD", lName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String email = userRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertEquals("Happy", email);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String email = userRegistration.validateEmail(".abc@yahoo.com");
        Assert.assertEquals("SAD", email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String phoneNumber = userRegistration.validatePhoneNumber("91 7822503725");
        Assert.assertEquals("Happy", phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String phoneNumber = userRegistration.validatePhoneNumber("vad");
        Assert.assertEquals("SAD", phoneNumber);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.validatePassword("jaya23@23");
        Assert.assertEquals("Happy", password);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnSad() {
        UserRegistration userRegistration = new UserRegistration();
        String password = userRegistration.validatePassword("vad");
        Assert.assertEquals("SAD", password);
    }
}