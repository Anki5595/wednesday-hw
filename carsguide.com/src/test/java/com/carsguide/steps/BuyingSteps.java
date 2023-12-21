package com.carsguide.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarsSearchPage;
import com.carsguide.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyingSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on “buy+sell” tab")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellOption();
    }

    @And("I click ‘Search Cars’ link")
    public void iClickSearchCarsLink() {
        new HomePage().ClickOnSearchCarOption();
    }

    @Then("I navigate to ‘new and used car search’ page")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }

    @And("I select make {string}")
    public void iSelectMake(String make) {
        new NewAndUsedCarsSearchPage().selectMakersOfCars(make);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new NewAndUsedCarsSearchPage().selectModelOfCars(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new NewAndUsedCarsSearchPage().selectLocation(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new NewAndUsedCarsSearchPage().selectPriceOfCars(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarsSearchPage().clickOnMyNextCarButton();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String resultText) {
        new ResultPage().verifyTheResulTextOnResultPage(resultText);
    }

    @And("I click ‘Used’ link")
    public void iClickUsedLink() {
        new HomePage().ClickOnUsedCarOption();
    }

    @Then("I navigate to ‘Used Cars For Sale’ page")
    public void iNavigateToUsedCarsForSalePage() {
    }
}
