package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.CommonPage;
import com.skillup.slidepresenter.shared.Urls;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MailinatorMainPage extends CommonPage {

    private static final String emailInput = "input#inboxfield";
    private static final String goButton = "input#inboxfield + span button";


    public MailinatorMainPage(WebDriver driver) {
        super(driver);
    }

    public MailinatorMainPage open() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(Urls.MAILLANATOR_MAIN);
        return this;
    }

    public MailinatorMainPage inputEmail(String email) {
        enterText(emailInput, email);
        return this;
    }

    public MailinatorMainPage clickGo() {
        clickElement(goButton);
        return this;
    }

}
