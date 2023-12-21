package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CarDealerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealerPage.class.getName());
    @CacheLookup
    @FindBy(id = "cgsearch")
    WebElement getDealers;

    public void enterDealersInSearchBoxToFindDealer(String dealer) {
        sendTextToElement(getDealers, dealer);
        log.info("Enter password :" + dealer + " in password field " + getDealers.toString());

    }


}
