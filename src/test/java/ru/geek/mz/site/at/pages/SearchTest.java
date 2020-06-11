package ru.geek.mz.site.at.pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.geek.mz.site.at.pages.base.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

//@Disabled
public class SearchTest extends BaseTest {

    @BeforeEach
    public void OpenSite(){
        driver.get(BASE_URL +"/career");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
//    @Disabled
//    @Test
//    void searchJavaTest() {
//
//        new SearchOnPage(driver)
//                .clickSearch("java")
//                .checkTab("professionTab")
//                .checkTab("coursesTab")
//                .checkTab("webinarsTab")
//                .checkTab("blogTab")
//                .checkTab("forumTab")
//                .checkTab("testsTab")
//                .checkTab("companiesTab");
//
//        System.out.println("Test passed");
//    }
    @Test
    void searchJavaTest2() {

        new SearchOnPage(driver)
//                .closePopUp(driver)
                .clickSearch("java")
                .checkTabCount("professionTab", not(0))
                .checkTabCount("professionTab", greaterThan(2))
                .checkTabCount("coursesTab", greaterThan(15))
                .checkTabCount("webinarsTab", greaterThan(180))
                .checkTabCount("webinarsTab", lessThan(300))
                .checkTabCount("blogTab", greaterThan(300))
                .checkTabCount("forumTab", not(350))
                .checkTabCount("companiesTab", not(0) )
                .checkTabCount("testsTab", not(0));

        System.out.println("Test passed");
    }
    @Test
    void searchJavaTest3() {
        new Page(driver).getNavigationTab().clickButton("Курсы")
//                .closePopUp(driver)
                .getSearchOnPage().clickSearch("java")
                .checkTabCount("professionTab", not(0))
                .checkTabCount("professionTab", greaterThan(2))
                .checkTabCount("coursesTab", greaterThan(15))
                .checkTabCount("webinarsTab", greaterThan(180))
                .checkTabCount("webinarsTab", lessThan(300))
                .checkTabCount("blogTab", greaterThan(300))
                .checkTabCount("forumTab", not(350))
                .checkTabCount("companiesTab", not(0) )
                .checkTabCount("testsTab", not(0));

        System.out.println("Test passed");
    }
}
