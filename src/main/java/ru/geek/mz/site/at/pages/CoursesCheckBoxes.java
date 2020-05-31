package ru.geek.mz.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursesCheckBoxes extends BasePage {
    public CoursesCheckBoxes(WebDriver driver) {
        super(driver);
    }
    @FindBy(css= "input[value='free'")
    private WebElement free;

    @FindBy(css = "input[value='beginner'")
    private WebElement beginner;

    @FindBy(css ="input[value='web'" )
    private WebElement webDeveloper;

    @FindBy(css = "input[value='soft'")
    private WebElement programmingDeveloper;

    @FindBy(css ="input[value='design'" )
    private WebElement webDesign;

    @FindBy(css = "input[value='mob'")
    private WebElement mobileDeveloper;

    @FindBy(css="input[value='game'")
    private WebElement gameDeveloper;

    @FindBy(css = "input[value='ib'" )
    private WebElement itSecurity;

    @FindBy(css = "input[value='data_science'")
    private WebElement dataScience;

    @FindBy(css = "input[value='tester'")
    private WebElement testing;

    @FindBy(css = "input[value='smm'")
    private  WebElement marketing;

    @FindBy(css = "input[value='admin'" )
    private  WebElement itAdmin;

    @FindBy(css = "input[value='geekclub'" )
    private  WebElement geekClub;

    @FindBy(css = "input[value='esport'")
    private  WebElement eSports;

    public Page clickFilter(String filterName){
        switch (filterName){
            case "Бесплатные": {free.click(); break;}
            case "Для начинающих": {beginner.click(); break;}
            case "Веб-разработка": {webDeveloper.click(); break;}
            case "Разработка программ": {programmingDeveloper.click(); break;}
            case "Веб-дезайнер": {webDeveloper.click(); break;}
            case "Мобильная разработка": {mobileDeveloper.click(); break;}
            case "Разработка игр": {gameDeveloper.click(); break;}
            case "Информационная безопасность": {itSecurity.click(); break;}
            case "Data Science": {dataScience.click(); break;}
            case "Тестирование": {testing.click(); break;}
            case "Интернет маркетинг": {marketing.click(); break;}
            case "Системное администрирование": {itAdmin.click(); break;}
            case "GeekClub": {geekClub.click(); break;}
            case "Киберспорт": {eSports.click(); break;}
            default:
                System.out.println( filterName +"фильтр не найден");
        }

        return new Page(driver);
    }


}
