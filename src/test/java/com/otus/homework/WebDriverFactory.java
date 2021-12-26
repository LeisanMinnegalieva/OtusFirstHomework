package com.otus.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
    public static String driverType = System.getProperty("browser");

    public static WebDriver setupDriver(String driverType) {
        switch (driverType) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "OPERA":
                WebDriverManager.operadriver().setup();
                return new OperaDriver();
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                throw new WebDriverException("тип драйвера не найден, необходимо добавить");
        }
    }
}
