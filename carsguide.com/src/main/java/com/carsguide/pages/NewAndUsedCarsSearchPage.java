package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewAndUsedCarsSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarsSearchPage.class.getName());

    @CacheLookup
    @FindBy(id = "makes")
    WebElement make;

    @CacheLookup
    @FindBy(id = "models")
    WebElement model;

    @CacheLookup
    @FindBy(id = "locations")
    WebElement location;

    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement price;

    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement nextCarButton;

    public void selectMakersOfCars(String car) {
        selectByVisibleTextFromDropDown(make, car);
        log.info("Selecting maker from dropdown : " + make.toString());

    }

    public void selectModelOfCars(String carModel) {
        selectByVisibleTextFromDropDown(model, carModel);
        log.info("Selecting model from dropdown : " + model.toString());

    }

    public void selectLocation(String carLocation) {
        selectByVisibleTextFromDropDown(location, carLocation);
        log.info("Selecting location from dropdown : " + location.toString());

    }

    public void selectPriceOfCars(String carPrice) {
        selectByVisibleTextFromDropDown(price, carPrice);
        log.info("Selecting price from dropdown : " + price.toString());

    }

    public void clickOnMyNextCarButton() {
        mouseHoverToElementAndClick(nextCarButton);
        log.info("Clicking on my next car button : " + nextCarButton.toString());

    }
}
