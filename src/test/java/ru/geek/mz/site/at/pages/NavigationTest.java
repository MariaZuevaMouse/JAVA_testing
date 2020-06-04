package ru.geek.mz.site.at.pages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geek.mz.site.at.pages.base.BaseTest;

import java.util.stream.Stream;

@Disabled
@Execution(value = ExecutionMode.CONCURRENT)
public class NavigationTest extends BaseTest {
    @BeforeEach
    public void openSite() {
        driver.get(BASE_URL + "/career");
    }

    @ParameterizedTest
    @DisplayName("check navigation items")
    @MethodSource("pageGenerator")
    public void navigationPanelTest(String buttonTitle) {
        new NavigationTab(driver)
                .clickButton(buttonTitle)
                .checkHeader(buttonTitle);
    }

    public static Stream<String> pageGenerator() {
        return Stream.of("Тесты", "Карьера", "Блог", "Форум", "Вебинары", "Курсы");
    }
//    private String header;
//    private WebElement testedElement;
//
//
//    void checkNavigation(By _byBut, By _byHead, String checkedHeader){
//        driver.get(BASE_URL + "/career");
//        testedElement = driver.findElement(_byBut);
//        testedElement.click();
//        if(testedElement==driver.findElement(cssSelector("nav > a[href='/courses']"))){
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.findElement(By.xpath("//div/div/button[*]")).click();
//        }
//        header = driver.findElement(_byHead).getText();
//        Assertions.assertEquals(checkedHeader,header);
//        System.out.println("Навигационная кнопка " + header + " успешно отработала");
//        checkHeadFooter();
//    }
//    void checkHeadFooter(){
//        testedElement = driver.findElement(By.xpath("//footer"));
//        Assertions.assertTrue(testedElement.isEnabled());
//        testedElement = driver.findElement(By.xpath("//header"));
//        Assertions.assertTrue(testedElement.isEnabled());
//        System.out.println("Хедер, футер присутствует");
//    }
//
//    @ParameterizedTest
//    @MethodSource("argumentsStream")
//    public void navigateTest(By _byBut, By _byHead, String checkedHeader){
//        checkNavigation(_byBut, _byHead,checkedHeader);
//    }
//    public static Stream<Arguments> argumentsStream(){
//        return Stream.of(
//                Arguments.of(cssSelector("nav > a[href='/career']"), className("gb-header__title"), "Карьера"),
//                Arguments.of(cssSelector("nav > a[href='/tests']"), className("gb-header__title"), "Тесты" ),
//                Arguments.of(cssSelector("nav > a[href='/events']"),className("gb-header__title"), "Вебинары"),
//                Arguments.of(cssSelector("nav > a[href='/topics']"), className("gb-header__title"),"Форум"),
//                Arguments.of(cssSelector("nav > a[href='/topics']"), className("gb-header__title"),"Форум"),
//                Arguments.of(cssSelector("nav > a[href='/posts']"), className("gb-header__title"), "Блог"),
//                Arguments.of(cssSelector("nav > a[href='/courses']"), className("gb-header__title"), "Курсы")
//        );
//    }
//
//    @Test
//    void navCareer(){
//        checkNavigation(cssSelector("nav > a[href='/career']"), className("gb-header__title"), "Карьера");
//    }
//    @Test
//    void navTest(){
//        checkNavigation(cssSelector("nav > a[href='/tests']"), className("gb-header__title"), "Тесты" );
//    }
//    @Test
//    void navWebinar(){
//        checkNavigation(cssSelector("nav > a[href='/events']"),className("gb-header__title"), "Вебинары");
//    }
//    @Test
//    void navForum(){
//        checkNavigation(cssSelector("nav > a[href='/topics']"), className("gb-header__title"),"Форум");
//    }
//    @Test
//    void navBlog(){
//        checkNavigation(cssSelector("nav > a[href='/posts']"), className("gb-header__title"), "Блог");
//    }
//    @Test
//    void navCourses(){
//        checkNavigation(cssSelector("nav > a[href='/courses']"), className("gb-header__title"), "Курсы" );
//    }

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
//        System.out.println("Test passed");
//
//    }
}
