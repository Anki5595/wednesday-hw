package com.carsguide.steps;

import com.carsguide.pages.CarDealerPage;
import com.carsguide.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class FindDealerSteps {
    @And("I click ‘Find a Dealer’")
    public void iClickFindADealer() {
        new HomePage().ClickOnFindADealerOption();
    }

    @Then("I navigate to ‘car-dealers’ page")
    public void iNavigateToCarDealersPage() {
    }

    @And("I should see the dealer names {string} are display on page")
    public void iShouldSeeTheDealerNamesAreDisplayOnPage(DataTable dataTable, String dealerName) {
        new CarDealerPage().enterDealersInSearchBoxToFindDealer(dealerName);
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> list : userList) {
            System.out.println(list.get(Integer.parseInt(dealerName)));
        }
    }
}
