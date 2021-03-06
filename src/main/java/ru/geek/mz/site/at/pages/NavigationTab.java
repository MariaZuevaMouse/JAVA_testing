package ru.geek.mz.site.at.pages;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.SecureRandom;

import static org.openqa.selenium.By.cssSelector;

public class NavigationTab extends BasePage {



    public NavigationTab(WebDriver driver) {
        super(driver);
    }

    public Page getPage(){
        return new Page(driver);
    }

    @FindBy(css = "nav > a[href='/career']")
    private WebElement careerNavButton;

    @FindBy(css = "nav > a[href='/tests']")
    private WebElement testNavButton;

    @FindBy(css = "nav > a[href='/posts']")
    private WebElement blogNavButton;

    @FindBy(css = "nav > a[href='/topics']")
    private WebElement forumNavButton;

    @FindBy(css = "nav > a[href='/events']")
    private WebElement webinarNavButton;

    @FindBy(css = "nav > a[href='/courses']")
    private WebElement coursesNavButton;



    @Step("проверка открытия страницы {buttonTitle}")
    public Page clickButton(String buttonTitle){
        switch (buttonTitle){
            case "Карьера":{
                careerNavButton.click();
                break;
            }
            case "Тесты":{
                testNavButton.click();
                break;
            }
            case "Блог":{
                blogNavButton.click();
                break;
            }
            case "Форум":{
                forumNavButton.click();
                break;
            }
            case "Вебинары":{
                webinarNavButton.click();
                break;
            }
            case "Курсы":{
                coursesNavButton.click();
                break;
            }
            default:{
                throw new NotFoundException("Element not found " + buttonTitle);
            }
        }
        return new Page(driver);
    }


//    public static By careerNavSelector =By.cssSelector("nav > a[href='/career']");



}
