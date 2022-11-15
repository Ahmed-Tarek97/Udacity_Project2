package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D08_WishlistStepDef {
    
    P03_homePage homePage = new P03_homePage();

    @When("user clicks on wishlist button on this product {string}")
    public void userClicksOnWishlistButtonOnThisProduct(String arg0) {
        homePage.homepageProductWishlist().click();
    }

    @Then("success message will appear")
    public void successMessageWillAppear() {
        Assert.assertTrue(homePage.homepageWishlistAddedSucceedMessageColor().getText().contains("The product has been added to your wishlist"));
        Assert.assertEquals(Color.fromString(homePage.homepageWishlistAddedSucceedMessageBackgroundColor().getCssValue("background-color")).asHex(),"#4bb07a");
    }

    @When("user clicks on wishlist tab")
    public void userClicksOnWishlistTab() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(homePage.homepageWishlistAddedSucceedMessageColor()));
        homePage.homepageWishlistTab().click();
    }
}