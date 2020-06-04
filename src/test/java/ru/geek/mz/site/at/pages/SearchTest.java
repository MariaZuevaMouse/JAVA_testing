package ru.geek.mz.site.at.pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.geek.mz.site.at.pages.base.BaseTest;

import java.util.concurrent.TimeUnit;

@Disabled
public class SearchTest extends BaseTest {

    @BeforeEach
    public void OpenSite(){
        driver.get(BASE_URL +"/courses");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    void searchJavaTest() {

        new SearchOnPage(driver).clickSearch("java")
                .checkTab("professionTab")
                .checkTab("coursesTab")
                .checkTab("webinarsTab")
                .checkTab("blogTab")
                .checkTab("forumTab")
                .checkTab("testsTab")
                .checkTab("companiesTab");

        System.out.println("Test passed");
    }
}
