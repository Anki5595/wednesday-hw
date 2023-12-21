package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
//
//    @CacheLookup
//    @FindBy(xpath = "//div[@class = 'resultsGrid']")
//    WebElement resultAfterSearch;
//
//    public String getResultsListAfterSearchBuyCars(String results){
//        String text = getTextFromElement(resultAfterSearch);
//        log.info("Get Title with car name : " + resultAfterSearch.toString());
//        return text;
//    }

    @CacheLookup
    @FindBy(className = "search-header__title")
    WebElement resultText;

    public void verifyTheResulTextOnResultPage(String result) {
        verifyThatTextIsDisplayed(resultText, result);
        System.out.println(result);
    }


}
