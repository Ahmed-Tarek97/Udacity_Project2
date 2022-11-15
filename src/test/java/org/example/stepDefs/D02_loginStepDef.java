package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void goLoginPage()
    {
        login.loginlink().click();
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1, String arg2) {
            login.loginEmail().sendKeys(arg1);
            login.loginPassword().sendKeys(arg2);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        Assert.assertEquals("https://demo.nopcommerce.com/",login.loginURL());
        Assert.assertEquals("My account",login.loginMyAccount().getText());
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        Assert.assertTrue(login.loginErrorMessage().getText().contains("Login was unsuccessful"));
        Assert.assertEquals(Color.fromString(login.loginErrorMessage().getCssValue("color")).asHex(),"#e4434b");
    }
}