package ru.geek.mz.site.at.pages;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Integer.parseInt;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
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
        return this;
    }

    public int checkedCount(WebElement checkedElement){
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


    public Page checkTab(String tabTitle) {
        switch (tabTitle) {
            case "professionTab": {
                assertThat((checkedCount(professionTab)), allOf(
                        notNullValue(),
                        greaterThan(2)
                        )
                );
                System.out.println("profess - ok");
                break;
            }
            case "coursesTab": {
                assertThat(checkedCount(coursesTab), allOf(
                        notNullValue(),
                        greaterThan(15)
                ));
                System.out.println("courses ok");
                break;
            }
            case "webinarsTab": {
                assertThat(checkedCount(webinarsTab), allOf(
                        notNullValue(),
                        greaterThan(180),
                        lessThan(300)
                ));
                System.out.println("webinars ok");
                break;
            }
            case "blogTab": {
                assertThat(checkedCount(blogTab), allOf(
                        notNullValue(),
                        greaterThan(300)
                ));
                System.out.println("blogs ok");
                break;
            }
            case "forumTab": {
                assertThat(checkedCount(forumTab), allOf(
                        notNullValue(),
                        not(350)
                ));
                System.out.println("forum ok");
                break;
            }
            case "testsTab": {
                assertThat(checkedCount(testsTab), allOf(
                        notNullValue(),
                        not(0)
                ));
                System.out.println("test ok");
                break;
            }
            case "companiesTab": {
                assertThat(checkedCount(companiesTab), allOf(
                        notNullValue(),
                        not(0)
                ));
                System.out.println("companies ok");
                break;
            }
            default: {
                throw new NotFoundException("Element not found " + tabTitle);
            }
        }
        return new Page(driver);
    }
}
