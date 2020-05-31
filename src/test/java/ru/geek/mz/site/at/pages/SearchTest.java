package ru.geek.mz.site.at.pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geek.mz.site.at.pages.base.BaseTest;

import java.util.concurrent.TimeUnit;
import static java.lang.Integer.parseInt;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTest extends BaseTest {
//    private int parsCount(WebElement elem){
//        String[] arr = elem.getText().split("・");
//        int checkCount = parseInt(arr[1]);
//        return checkCount;
//    }
    @BeforeEach
    public void OpenSite(){
        driver.get(BASE_URL +"/courses");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @ParameterizedTest
    @ValueSource(strings = {"professionTab","coursesTab","webinarsTab", "blogTab", "forumTab", "testsTab", "companiesTab"})
    void searchJavaTest(String searchResult) {

        new SearchOnPage(driver).clickSearch("java").checkTabs(searchResult);








//        driver.findElement(By.xpath("//div/div/button[*]")).click();




//        WebElement searchButton = driver.findElement(By.cssSelector("ul > li > .show-search-form"));
//        searchButton.click();
//
//        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
//        searchInput.sendKeys("java");
//
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));
//
//        WebElement professionTab = driver
//                .findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions']"));
//        Assertions.assertTrue(professionTab.isDisplayed());
//
//        WebElement coursesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses']"));
//        WebElement webinarsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars']"));
//        WebElement blogsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs']"));
//        WebElement forumsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums']"));
//        WebElement testsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests']"));
//        WebElement companiesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies']"));
//
//
//        Assertions.assertTrue(professionTab.isDisplayed() && parsCount(professionTab)>=2);
//        Assertions.assertTrue(coursesTab.isDisplayed() && parsCount(coursesTab)>15);
//        Assertions.assertTrue(webinarsTab.isDisplayed() && parsCount(webinarsTab)>180 && parsCount(webinarsTab)<300);
//        Assertions.assertTrue(blogsTab.isDisplayed() && parsCount(blogsTab)>300);
//        Assertions.assertTrue(forumsTab.isDisplayed() && parsCount(forumsTab)!=350);
//        Assertions.assertTrue(testsTab.isDisplayed() && parsCount(testsTab)!=0);
//        Assertions.assertTrue(companiesTab.isDisplayed());
//
//        //hamcrest library
//        assertThat(professionTab.isDisplayed()&&parsCount(professionTab)>=2, equalTo(true));
//        assertThat(coursesTab.isDisplayed() && parsCount(coursesTab)>15,equalTo(true));
//        assertThat(webinarsTab.isDisplayed() && parsCount(webinarsTab)>180 && parsCount(webinarsTab)<300, equalTo(true));
//        assertThat(blogsTab.isDisplayed() && parsCount(blogsTab)>300,equalTo(true));
//        assertThat(forumsTab.isDisplayed() && parsCount(forumsTab)!=350,equalTo(true));
//        assertThat(testsTab.isDisplayed() && parsCount(testsTab)!=0,equalTo(true));
//        assertThat(companiesTab.isDisplayed(),equalTo(true));


//        Профессий не менее чем 2
//        Курсов более 15
//        Вебинаров больше чем 180, но меньше 300
//        Блогов более 300
//        Форумов не 350
//        Тестов не 0
        System.out.println("Test passed");
    }
}
