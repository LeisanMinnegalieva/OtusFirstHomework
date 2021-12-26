package com.otus.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class OtusHomeworkTest extends BaseTest{

    @Test
    public void otusTest(){
        EventFiringWebDriver driver = new EventFiringWebDriver(setUpDriver());
        driver.register(new MarkBeforeClickListener());

        driver.get(MainPage.URL);

        var page = new MainPage(driver);
        Actions actions = new Actions(driver);

        page.acceptCookieCollecting.click();
        page.discountClose.click();

        List<WebElement> coursesListFiltered = page.coursesList.stream().filter(s->s.getText().contains("Java")).collect(Collectors.toList());

        actions
                .moveToElement(coursesListFiltered.get(1))
                .pause(3000)
                .moveToElement(coursesListFiltered.get(2))
                .pause(3000)
                .click()
                .build()
                .perform();

        driver.get(MainPage.URL);
    }
}
