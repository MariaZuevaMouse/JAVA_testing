package ru.geek.mz.site.at.pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.geek.mz.site.at.pages.base.BaseTest;

public class LoginTest extends BaseTest {
    @BeforeEach
    @Step
    public void OpenLoginPage(){
        driver.get(BASE_URL + "/login");
    }

    //@Disabled
    @Test
    public void Login(){
        new Login(driver).LoginSite().checkHeader("Главная");
    }
}
