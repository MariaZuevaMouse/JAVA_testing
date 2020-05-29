package ru.geek.mz.site.at.pages.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected final String BASE_URL = "https://geekbrains.ru";


    @BeforeEach
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "E:\\JAVA_2\\mz-site-at\\src\\test\\resources\\chromedriver");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
