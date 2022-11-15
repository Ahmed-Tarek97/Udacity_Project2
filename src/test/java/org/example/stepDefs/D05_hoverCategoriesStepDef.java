package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user hover on category {string}")
    public void userHoverOnCategory(String arg0) {
        homePage.homepageHoverCategory();
    }

    @And("user clicks on sub category {string}")
    public void userClicksOnSubCategory(String arg0) {
        homePage.homepageClickSubcategory().click();
    }

    @Then("user is redirected to subcategory page")
    public void userIsRedirectedToSubcategoryPage() {
    }

}
