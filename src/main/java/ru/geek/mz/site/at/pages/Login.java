package ru.geek.mz.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
    public Login(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#user_email")
    private WebElement login;

    @FindBy(css ="#user_password" )
    private WebElement password;

    @FindBy(css="input[data-testid='login-submit']")
    private WebElement submit;

    public void TypeLogin(){
        login.sendKeys("hao17583@bcaoo.com");
    }
    public void TypePassword(){
        password.sendKeys("hao17583");
    }
    @Step("login site")
    public Page LoginSite(){
        TypeLogin();
        TypePassword();
        submit.click();
        return new Page(driver);
    }


}
