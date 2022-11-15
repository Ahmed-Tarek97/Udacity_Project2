package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user clicks on first slider")
    public void userClicksOnFirstSlider() {
        homePage.homepageClickFirstSlider().click();
    }

    @Then("user should be redirected to first slider page")
    public void userShouldBeRedirectedToFirstSliderPage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlMatches("https://demo.nopcommerce.com/"));
        Assert.assertEquals(homePage.homepageURL(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user clicks on second slider")
    public void userClicksOnSecondSlider() {
        homePage.homepageClickSecondSlider().click();
    }

    @Then("user should be redirected to second slider page")
    public void userShouldBeRedirectedToSecondSliderPage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.urlMatches("https://demo.nopcommerce.com/"));
        Assert.assertEquals(homePage.homepageURL(),"https://demo.nopcommerce.com/iphone-6");
    }
}
