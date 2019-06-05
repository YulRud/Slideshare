package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.CommonPage;
import com.skillup.slidepresenter.shared.Urls;
import org.openqa.selenium.WebDriver;

public class MainPage extends CommonPage {
    private static final String SIGNUP_BUTTON = "a.btn.btn--sm.btn--primary.type--uppercase.btn-signup";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open() {
        driver.get(Urls.SLIDEPRESENTOR_MAIN);
        return this;
    }

    public MainPage clickSignUpButton() {
        clickElement(SIGNUP_BUTTON);
        return this;
    }

}
