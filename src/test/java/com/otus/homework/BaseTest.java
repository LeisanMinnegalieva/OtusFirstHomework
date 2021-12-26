package com.otus.homework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import static com.otus.homework.WebDriverFactory.driverType;

public class BaseTest {
    protected WebDriver driver;

    public  WebDriver setUpDriver() {
        driver = WebDriverFactory.setupDriver(driverType);
        driver.manage().window().maximize();
        return driver;
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
