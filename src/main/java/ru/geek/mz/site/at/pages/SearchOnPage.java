package ru.geek.mz.site.at.pages;

import org.hamcrest.Matcher;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Integer.parseInt;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchOnPage extends BasePage {
    public SearchOnPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "ul > li > .show-search-form")
    private WebElement searchBtn;

    @FindBy(css = ".search-panel__search-field")
    private WebElement serachInput;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='professions']")
    private WebElement closePopUp;

    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button']")
    private WebElement buttonPopUpClosed;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='professions']")
    private WebElement professionTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='courses']")
    private WebElement coursesTab;

    @FindBy(css="ul.search-page-tabs > li > a[data-tab='webinars']" )
    private WebElement webinarsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='blogs']")
    protected WebElement blogTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='forums']")
    private WebElement forumTab;

    @FindBy(css ="ul.search-page-tabs > li > a[data-tab='tests']" )
    private WebElement testsTab;

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='companies']")
    private WebElement companiesTab;


    public SearchOnPage clickSearch(String input){
        searchBtn.click();
        serachInput.sendKeys(input);
        return this;
    }

//    ---------
    public int checkedCount(WebElement checkedElement){
    return parseInt(checkedElement.getText().split("・")[1]);
    }

    public SearchOnPage closePopUp (WebDriver driver){
        wait30seconds.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if(buttonPopUpClosed.isDisplayed()){
            this.buttonPopUpClosed.click();
        }
        return new SearchOnPage(driver);
    }
    public SearchOnPage checkTabCount(String tabTitle, Matcher<Integer> matcher){
        assertThat(checkedCount(checkTabQty(tabTitle)), matcher);
        System.out.println("check passed");
        return new SearchOnPage(driver);
    }

    public WebElement checkTabQty(String tabTitle) {
        switch (tabTitle) {
            case "professionTab": {
                return professionTab;
            }
            case "coursesTab": {
                return coursesTab;
            }
            case "webinarsTab": {
                return  webinarsTab;
            }
            case "blogTab": {
                return blogTab;
            }
            case "forumTab": {
                return forumTab;
            }
            case "testsTab": {
                return testsTab;
            }
            case "companiesTab": {
                return companiesTab;
            }
            default: {
                throw new NotFoundException("Element not found " + tabTitle);
            }
        }
    }



}
