package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.CommonPage;
import org.openqa.selenium.WebDriver;

public class MailinatorEmailPage extends CommonPage {

    private static final String MESSAGE_FRAME = "msg_body";
    private static final String ACTIVATION_LINK = "div.content a[href*='sign']";


    public MailinatorEmailPage(WebDriver driver) {
        super(driver);
    }

    public MailinatorEmailPage openActivationLink() {
        driver.switchTo().frame(MESSAGE_FRAME);
        clickElement(ACTIVATION_LINK);
        return this;
    }
}
