package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user clicks on facebook link")
    public void userClicksOnFacebookLink() {
        homePage.homepageFacebookLogo().click();
    }

    @Then("user is redirected to facebook page")
    public void userIsRedirectedToFacebookPage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(homePage.homepageURL(),"https://www.facebook.com/nopCommerce");
    }

    @When("user clicks on twitter link")
    public void userClicksOnTwitterLink() {
        homePage.homepageTwitterLogo().click();
    }

    @Then("user is redirected to twitter page")
    public void userIsRedirectedToTwitterPage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(homePage.homepageURL(),"https://twitter.com/nopCommerce");
    }

    @When("user clicks on rss link")
    public void userClicksOnRssLink() {
        homePage.homepageRssLogo().click();

    }
    
    @Then("user is redirected to rss page")
    public void userIsRedirectedToRssPage() {
        //ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(homePage.homepageURL(),"https://demo.nopcommerce.com/new-online-store-is-open");    }

    @When("user clicks on youtube link")
    public void userClicksOnYoutubeLink() {
        homePage.homepageYoutubeLogo().click();
    }

    @Then("user is redirected to youtube page")
    public void userIsRedirectedToYoutubePage() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(homePage.homepageURL(),"https://www.youtube.com/user/nopCommerce");
    }
}
