package uk.co.library.pages;

import io.cucumber.datatable.DataTable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

import java.util.List;


public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(className = "search-header__title")
    WebElement resultText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealer-heading row']")
    WebElement findDealersPageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListings--name']")
    List<WebElement> dealersName;

    public void verifyTheResulTextOnResultPage(String result) {
        verifyThatTextIsDisplayed(resultText, result);
        log.info("Get result : " + resultText.toString());
        System.out.println(result);
    }


    public String navigateToFindDealersPageTitle() {
        log.info("Navigate to a Find Dealers Page Title" + findDealersPageTitle.toString());
        return getTextFromElement(findDealersPageTitle);
    }

    public void seeDealerNamesAreDisplayOnPage(DataTable dataTable) {
        List<List<String>> dealersName = dataTable.asLists(String.class);
        for (List<String> name : dealersName) {
            System.out.println(name);
        }
    }
}