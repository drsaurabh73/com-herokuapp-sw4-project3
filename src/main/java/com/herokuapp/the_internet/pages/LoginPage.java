package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameLink = By.id("username");
    By passwordLink = By.name("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By actualMessage = By.xpath("//body/div[2]/div[1]/div[1]/h2[1]");
    By errorMessage = By.xpath("//div[@class='flash error']");
    By errorMessage1 = By.xpath("//div[@class='flash error']");



    public void enterEmailId(String username) {
        sendTextToElement(usernameLink,username);
    }
    public void enterPassword(String password) {
        sendTextToElement(passwordLink,password);
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String verifyTextSourceArea() {
        return getTextFromElement(actualMessage);
    }
    public String verifyErrorMessage() {
        return getTextFromElement(errorMessage);
    }
public String verifyErrorMessage1() {
        return getTextFromElement(errorMessage1);
}



}
