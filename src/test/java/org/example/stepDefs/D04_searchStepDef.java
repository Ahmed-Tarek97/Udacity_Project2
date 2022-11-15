package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D04_searchStepDef {
    P03_homePage homepage = new P03_homePage();

    @When("user enter product name as {string}")
    public void userEnterProductNameAs(String arg0) {
        homepage.searchKeyword().sendKeys(arg0);
    }

    @Then("user is redirected to name search page")
    public void userIsRedirectedToNameSearchPage() {
        Assert.assertTrue(homepage.searchURL().contains("https://demo.nopcommerce.com/search?q="));
    }

    @When("user enter sku as {string}")
    public void userEnterSkuAs(String arg0) {
        homepage.searchKeyword().sendKeys(arg0);
    }

    @Then("user is redirected to sku search page")
    public void loginIsRedirectedToSkuSearchPage() {
    }

    @And("user clicks on search button")
    public void userClicksOnSearchButton() {
        homepage.searchClickSearchButton().click();
    }

}