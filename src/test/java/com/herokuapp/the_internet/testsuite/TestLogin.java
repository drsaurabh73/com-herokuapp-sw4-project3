package com.herokuapp.the_internet.testsuite;

import com.herokuapp.the_internet.pages.LoginPage;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {
    LoginPage loginPage = new LoginPage();

@Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterEmailId("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedResult = "Secure Area";
       String actualMessage4 =  loginPage.verifyTextSourceArea();

    Assert.assertEquals(actualMessage4,expectedResult,"");

    }
    @Test
public void verifyTheUsernameErrorMessage() {
    loginPage.enterEmailId("tomsmith1");
    loginPage.enterPassword("SuperSecretPassword!");
    loginPage.clickOnLoginButton();
        String expectedResult1 = "Your username is invalid!\n" +
        "×";
        String actualMessage5 = loginPage.verifyErrorMessage();

        Assert.assertEquals(actualMessage5,expectedResult1,"");
}
@Test
    public void verifyThePasswordErrorMessage() {

    loginPage.enterEmailId("tomsmith");
    loginPage.enterPassword("SuperSecretPassword");
    loginPage.clickOnLoginButton();
    String actualMessage2 = loginPage.verifyErrorMessage1();
    String expectedmessage6 = "Your password is invalid!\n" +
            "×";
Assert.assertEquals(actualMessage2,expectedmessage6,"");

}

}
