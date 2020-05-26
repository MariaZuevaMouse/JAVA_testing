package ru.geek.mz.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.cssSelector;

@Disabled
public class NavigationTest extends BaseTest {
    private String header;
    private WebElement testedElement;


    void checkNavigation(By _byBut, By _byHead, String checkedHeader){
        driver.get(BASE_URL + "/career");
        testedElement = driver.findElement(_byBut);
        testedElement.click();
        if(testedElement==driver.findElement(cssSelector("nav > a[href='/courses']"))){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div/div/button[*]")).click();
        }
        header = driver.findElement(_byHead).getText();
        Assertions.assertEquals(checkedHeader,header);
        System.out.println("Навигационная кнопка " + header + " успешно отработала");
        checkHeadFooter();
    }
    void checkHeadFooter(){
        testedElement = driver.findElement(By.xpath("//footer"));
        Assertions.assertTrue(testedElement.isEnabled());
        testedElement = driver.findElement(By.xpath("//header"));
        Assertions.assertTrue(testedElement.isEnabled());
        System.out.println("Хедер, футер присутствует");
    }


    @Test
    void navCareer(){
        checkNavigation(cssSelector("nav > a[href='/career']"), className("gb-header__title"), "Карьера");
    }
    @Test
    void navTest(){
        checkNavigation(cssSelector("nav > a[href='/tests']"), className("gb-header__title"), "Тесты" );
    }
    @Test
    void navWebinar(){
        checkNavigation(cssSelector("nav > a[href='/events']"),className("gb-header__title"), "Вебинары");
    }
    @Test
    void navForum(){
        checkNavigation(cssSelector("nav > a[href='/topics']"), className("gb-header__title"),"Форум");
    }
    @Test
    void navBlog(){
        checkNavigation(cssSelector("nav > a[href='/posts']"), className("gb-header__title"), "Блог");
    }
    @Test
    void navCourses(){
        checkNavigation(cssSelector("nav > a[href='/courses']"), className("gb-header__title"), "Курсы" );
    }

//    @Test
//    void navCourses(){
//        driver.get(BASE_URL + "/career");
//        driver.findElement(cssSelector("nav > a[href='/courses']")).click();
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div/div/button[*]")).click();
//
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Курсы", header);
//        System.out.println("Навигационная кнопка " + header + " успешно отработала");
//        checkHeadFooter();
//
//    }

//    @Test
//    void navigationPanel() {
//
//        driver.get(BASE_URL + "/career");
//
//        String header;
//
//        WebElement carreeNavButton = driver
//                .findElement(cssSelector("nav > a[href='/career']"));
//        carreeNavButton.click();
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Карьера", header);
//
//        driver.findElement(cssSelector("nav > a[href='/tests']")).click();
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Тесты", header);
//
//        // можно нажимать и на иконку
//        driver.findElement(cssSelector("nav.gb-left-menu__nav .svg-icon.icon-courses")).click();
//        // После нажатия на кнопку Курсы мы помним, что через какое-то время может появиться баннер со скидкой
//        // В любом месте программы мы можем настроить параметры неявного ожидания
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        // Теперь не боимся что тест упадет
//        driver.findElement(By.xpath("//div/div/button[*]")).click();
//
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Курсы", header);
//
//        driver.findElement(cssSelector("nav > a[href='/events']")).click();
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Вебинары", header);
//
//        driver.findElement(cssSelector("nav > a[href='/topics']")).click();
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Форум", header);
//
//        driver.findElement(cssSelector("nav > a[href='/posts']")).click();
//        header = driver.findElement(className("gb-header__title")).getText();
//        Assertions.assertEquals("Блог", header);
//
////      ---------------------
////        WebElement coursesNavButton = driver
////                .findElement(By.cssSelector("nav > a[href='/courses']"));
////        coursesNavButton.click();
////
////        header = driver.findElement(By.className("gb-header__title")).getText();
////        Assertions.assertEquals("Курсы", header);
////
////        carreeNavButton.click();
////        -----------------------
//
//        System.out.println("Test passed");
//
//    }
}
