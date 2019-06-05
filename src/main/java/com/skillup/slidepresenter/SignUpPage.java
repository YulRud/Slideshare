package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.CommonPage;
import com.skillup.slidepresenter.shared.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends CommonPage {
    private static final String LOGIN_EMAIL_INPUT = "input.jss290.jss303.jss293[name='email']";
    private static final String I_AGREE_CHECKBOX = "div._2acBv7QIbHRq3CADXh7smJ i";
    private static final String SIGNUP_FOR_FREE_BUTTON =
            "button.jss45.jss21.jss320.jss30.jss31.jss33.jss323.jss34.jss324.jss44";

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage AssertInOnPage() {
        Assert.assertTrue(getCurrentURL().contains(Urls.SLIDEPRESENTOR_SIGNUP_PAGE), "The wrong page was opened: " +
                getCurrentURL() + " but the next page is expected: " + Urls.SLIDEPRESENTOR_SIGNUP_PAGE);
        return this;
    }

    public SignUpPage inputEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(findBy(LOGIN_EMAIL_INPUT)));
        enterText(LOGIN_EMAIL_INPUT, email);
        return this;
    }

    public SignUpPage setiAgreeCheckbox() {
        selectCheckBoxTrue(I_AGREE_CHECKBOX);
        return this;
    }

    public SignUpPage clickSignUpButton() {
        clickElement(SIGNUP_FOR_FREE_BUTTON);
        return this;
    }
}
