package com.otus.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {
    final static String URL= "https://otus.ru/";

    @FindBy(css = ".lessons__new-item-title.lessons__new-item-title_with-bg")
    List<WebElement> coursesList;

    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div/button")
    WebElement acceptCookieCollecting;

    @FindBy(xpath = "/html/body/div[8]/div/div[2]/div")
    WebElement discountClose;

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
