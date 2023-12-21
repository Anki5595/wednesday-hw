package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//li[@class='uhf-menu-item uhf-dropdown-menu-toggle uhf-menu-buysell']")
    WebElement buyAndSell;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCarList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealer;


    public void mouseHoverOnBuyAndSellOption() {
        mouseHoverToElement(buyAndSell);
        log.info("Clicking on buy and sell option : " + buyAndSell.toString());
    }

    public void ClickOnSearchCarOption() {
        clickOnElement(searchCars);
        log.info("Clicking on search cars option : " + searchCars.toString());
    }

    public void ClickOnUsedCarOption() {
        clickOnElement(usedCarList);
        log.info("Clicking on used cars option : " + usedCarList.toString());
    }

    public void ClickOnFindADealerOption() {
        clickOnElement(findADealer);
        log.info("Clicking on find a dealer option : " + findADealer.toString());
    }

}
