package ru.geek.mz.site.at.pages;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;

import static java.lang.Integer.parseInt;
import static org.hamcrest.Matchers.*;

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

    public int checkedCount(WebElement checkedElement){
        return parseInt(checkedElement.getText().split("・")[1]);
    }
    public Page clickSearch(String input){
        searchBtn.click();
        serachInput.sendKeys(input);
        return new Page(driver);
    }
    public Page checkTab(String tabTitle) {
        switch (tabTitle) {
            case "professionTab": {
//                professionTab.isDisplayed();
                assertThat((checkedCount(professionTab)), allOf(
                        notNullValue(),
                        greaterThan(2)
                        )
                );
//                assertThat(professionTab, notNullValue());
//                assertThat(checkedCount(professionTab), greaterThan(2));
                System.out.println("profess - ok");
                break;
            }
            case "coursesTab": {
//                coursesTab.isDisplayed();
                assertThat(checkedCount(coursesTab), allOf(
                     notNullValue(),
                     greaterThan(15)
                ));
                System.out.println("courses ok");
                break;
            }
            case "webinarsTab": {
//                webinarsTab.isDisplayed();
                assertThat(checkedCount(webinarsTab), allOf(
                        notNullValue(),
                        greaterThan(180),
                        lessThan(300)
                ));
                System.out.println("webinars ok");
                break;
            }
            case "blog": {
//                blogTab.isDisplayed();
                assertThat(checkedCount(blogTab), allOf(
                        notNullValue(),
                        greaterThan(300)
                ));
                System.out.println("blogs ok");
                break;
            }
            case "forum": {
//                forumTab.isDisplayed();
                assertThat(checkedCount(forumTab), allOf(
                        notNullValue(),
                        not(350)
                ));
                System.out.println("forum ok");
                break;
            }
            case "test": {
//                testsTab.isDisplayed();
                assertThat(checkedCount(testsTab), allOf(
                        notNullValue(),
                        not(0)
                ));
                System.out.println("test ok");
                break;
            }
            default: {
                throw new NotFoundException("Element not found " + tabTitle);
            }
        }
        return new Page(driver);
    }

//        if ("professionTab".equals(tabTitle)) {
////            return checkedCount(professionTab);
//        } else if ("coursesTab".equals(tabTitle)) {
//            return checkedCount(coursesTab);
//        } else if ("webinarsTab".equals(tabTitle)) {
//            return checkedCount(webinarsTab);
//        } else if ("blogTab".equals(tabTitle)) {
//            return checkedCount(blogTab);
//        } else if ("forumTab".equals(tabTitle)) {
//            return checkedCount(forumTab);
//        } else if ("testsTab".equals(tabTitle)) {
//            return checkedCount(testsTab);
//        } else {
//            throw new NotFoundException("Element not found " + tabTitle);
//        }





//    public void ClosePopUp(){
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));
//        if((boolean) wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs"))) {
//         driver.findElement(By.xpath("//div/div/button[*]")).click();
//        }
//    }

}
