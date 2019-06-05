package com.skillup.slidepresenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestRunner {
    protected WebDriver driver = null;

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver_win32/chromedriver.exe");

    }

    @BeforeMethod
    public void beforeMethod() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void thisMethod() {
        this.driver.quit();
    }

}
