package ru.geek.mz.site.at.pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geek.mz.site.at.pages.base.BaseTest;

public class CoursesCheckBoxesTest extends BaseTest {
    @BeforeEach
    public void OpenLoginPage(){
        driver.get(BASE_URL + "/login");
    }

    @Test
    public void CoursesCheckBox(){
        new Login(driver).LoginSite()
                .checkHeader("Главная")
                .getNavigationTab()
                .clickButton("Курсы")
                .openCourses()
                .getCoursesCheckBoxes()
                .clickFilter("Тестирование")  //getCoursesCheckBoxes
                .getCoursesCheckBoxes().clickFilter("Бесплатные")
                .getAllCourses()
                .checkCourseAppeared("Тестирование ПО. Уровень 2");
    }
}
