package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Home page")
    public void iAmOnHomePage() {
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I enter distance {string}")
    public void iEnterDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on search more option link")
    public void iClickOnSearchMoreOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salary minimum {string}")
    public void iEnterSalaryMinimum(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter salary maximum {string}")
    public void iEnterSalaryMaximum(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find Jobs")
    public void iClickOnFindJobs() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        new ResultPage().verifyTheResulTextOnResultPage(result);
    }

}
