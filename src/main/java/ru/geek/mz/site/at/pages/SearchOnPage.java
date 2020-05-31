package ru.geek.mz.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


    public Page clickSearch(String input){
        searchBtn.click();
        serachInput.sendKeys(input);
        return new Page(driver);
    }


//    public void ClosePopUp(){
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));
//        if((boolean) wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs"))) {
//         driver.findElement(By.xpath("//div/div/button[*]")).click();
//        }
//    }

}
