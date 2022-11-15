package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user clicks on currency dropdown list")
    public void clickCurrencyList()
    {
        homePage.homepageList().click();

    }

    @And("user select Euro currency")
    public void userSelectEuroCurrency() {
        homePage.homepageSelectEuro().click();
    }

    @Then("Euro currency is applied")
    public void euroCurrencyIsApplied() {
        for (int i = 0; i < 4; i++) {
            Assert.assertTrue(homePage.homepageCheckCurrency().get(i).getText().contains("€"));
        }
    }

}
