package com.skillup.slidepresenter.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPage {

    protected WebDriver driver;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(String locator) {
        WebElement element = driver.findElement(findBy(locator));
        element.click();

    }

    public void enterText(String locator, String text) {
        WebElement input = driver.findElement(findBy(locator));
        input.clear();
        input.sendKeys(text);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void selectCheckBoxTrue(String locator) {
        WebElement checkBox = driver.findElement(findBy(locator));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
    }

    protected By findBy(String loctor) {
        if (loctor.startsWith("//") || loctor.startsWith("./")) {
            return By.xpath(loctor);
        } else {
            return By.cssSelector(loctor);
        }
    }


}
