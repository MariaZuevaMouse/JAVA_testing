package ru.geek.mz.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class AllCourses extends BasePage {
    public AllCourses(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "div[data-id='84']" )
    private WebElement testing01;

    @FindBy(css= "div[data-id='85']")
    private WebElement testting02;

    public Page checkCourseAppeared(String courseName){
        switch (courseName){
            case "Тестирование ПО. Уровень 2":{
                assertThat(testting02, notNullValue());
                break;}
            case "Тестирование ПО. Уровень 1":{
                assertThat(testing01,notNullValue());
                break;
            }
        }
        return new Page(driver);
    }
}
