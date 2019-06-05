package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RegistrationPage extends CommonPage {

    private static final String FIRST_NAME = "input[name='firstName']";
    private static final String LAST_NAME = "input[name='lastName']";
    private static final String COMPANY_SIZE = "div[class='jss290 jss297']";
    private static final String COMPANY_SIZE_SELECTION = "ul.jss90.jss91 li";
    private static final String PASSWORD = "input[name='password']";
    private static final String PASSWORD_CONFIRMATION = "input[name='passwordConfirmation']";
    private static final String SUBMIT_BUTTON = "div.jss173.jss212 button";


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    //TODO
    public RegistrationPage switchToAnotherTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        return this;
    }

    public RegistrationPage enterFirstName(String firstName) {
        enterText(FIRST_NAME, firstName);
        return this;
    }

    public RegistrationPage enterLastName(String lastName) {
        enterText(LAST_NAME, lastName);
        return this;
    }

    public RegistrationPage enterCompanySize(int optionNumber) {
        clickElement(COMPANY_SIZE);
        List<WebElement> options = driver.findElements(By.cssSelector(COMPANY_SIZE_SELECTION));
        options.get(optionNumber).click();
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        enterText(PASSWORD, password);
        enterText(PASSWORD_CONFIRMATION, password);
        return this;
    }

    public RegistrationPage clickSubmit() {
        clickElement(SUBMIT_BUTTON);
        return this;
    }
}
