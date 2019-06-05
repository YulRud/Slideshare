package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.CommonPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MailinatorInBoxPage extends CommonPage {

    private static final String FIRST_EMAIL = "tr.even.pointer.ng-scope";

    public MailinatorInBoxPage(WebDriver driver) {
        super(driver);
    }

    public MailinatorInBoxPage openFirstEmail() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement(FIRST_EMAIL);
        return this;
    }
}
