package com.skillup.slidepresenter;

import com.skillup.slidepresenter.shared.EmailRandomGenerator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest extends TestRunner {

    private MainPage mainPage;
    private SignUpPage signUpPage;
    private MailinatorMainPage mailinatorMainPage;
    private MailinatorInBoxPage mailinatorInBoxPage;
    private MailinatorEmailPage mailinatorEmailPage;
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void before() {
        mainPage = new MainPage(this.driver);
        signUpPage = new SignUpPage(this.driver);
        mailinatorMainPage = new MailinatorMainPage(this.driver);
        mailinatorInBoxPage = new MailinatorInBoxPage(this.driver);
        mailinatorEmailPage = new MailinatorEmailPage(this.driver);
        registrationPage = new RegistrationPage(this.driver);
    }

    @Test
    public void openSignUpPage() {
        mainPage
                .open()
                .clickSignUpButton();
        signUpPage
                .AssertInOnPage();
    }

    @Test
    public void registerEmail() {
        String randomEmail = EmailRandomGenerator.generateEmailMailanator();
        mainPage
                .open()
                .clickSignUpButton();
        signUpPage
                .inputEmail(randomEmail)
                .setiAgreeCheckbox()
                .clickSignUpButton();
        mailinatorMainPage
                .open()
                .inputEmail(randomEmail)
                .clickGo();
        mailinatorInBoxPage
                .openFirstEmail();
        mailinatorEmailPage
                .openActivationLink();
        registrationPage
                .switchToAnotherTab()
                .enterFirstName("FirstNameTest")
                .enterLastName("LastNameTest")
                .enterCompanySize(1)
                .enterPassword("MyTestPass")
                .clickSubmit();
    }

    @Test
    public void testMailanatorInput() {
        mailinatorMainPage
                .open()
                .inputEmail("ttt@mailinator.com")
                .clickGo();
    }


}
