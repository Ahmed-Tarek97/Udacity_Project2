package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.registerGenderSelect().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.registerFirstName().sendKeys(arg0);
        register.registerLastName().sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        register.registerBirthDateDay().click();
        register.registerBirthDateMonth().click();
        register.registerBirthDateYear().click();
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.registerEmail().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        register.registerPassword().sendKeys(arg0);
        register.registerPasswordConfirmation().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerRegisterButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        String registerSucceededMessage = register.registerSucceededMessage().getText();
        System.out.println(registerSucceededMessage);
        Assert.assertTrue(registerSucceededMessage.contains("Your registration completed"));
        Assert.assertEquals(Color.fromString(register.registerSucceededMessage().getCssValue("color")).asHex(),"#4cb17c");
    }
}