package ru.geek.mz.site.at.pages;

import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Page extends BasePage {
    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;


    private NavigationTab navigationTab;

    private SearchOnPage searchOnPage;

    public SearchOnPage getSearchOnPage() {
        return searchOnPage;
    }

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
        searchOnPage = new SearchOnPage(driver);
    }


    public Page checkHeader(String expected){
        assertEquals(expected, pageHeader.getText());
//        assertEquals(expected, driver.findElement(headerSelector).getText());
        return this;
    }

    public int checkCount(WebElement checkedElement){
        return parseInt(checkedElement.getText().split("・")[1]);
    }




    public NavigationTab getNavigationTab(){
        return navigationTab;
    }

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

    public Page checkTabs(String tabTitle) {
        switch (tabTitle) {
            case "professionTab": {
                professionTab.isDisplayed();
                break;
            }
            case "coursesTab": {
                coursesTab.isDisplayed();
                break;
            }
            case "webinarsTab": {
                webinarsTab.isDisplayed();
                break;
            }
            case "blog": {
                blogTab.isDisplayed();
                break;
            }
            case "forum": {
                forumTab.isDisplayed();
                break;
            }
            case "test": {
                testsTab.isDisplayed();
                break;
            }
            default: {
                throw new NotFoundException("Element not found " + tabTitle);
            }
        }
        return new Page(driver);
    }
}
