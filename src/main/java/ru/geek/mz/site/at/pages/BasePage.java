package ru.geek.mz.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait10seconds;
    protected WebDriverWait wait30seconds;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait10seconds = new WebDriverWait(driver,10);
        this.wait30seconds = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }


}
