package com.briteERP.pages;


import com.briteERP.utils.BriteUtils;
import com.briteERP.utils.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id="login")
    public WebElement userNameLocator;

    @FindBy(id="password")
    public WebElement passwordLocator;

    @FindBy(css = "button[class='btn btn-primary']")
    public WebElement logInButton;

    @FindBy(linkText = "Don't have an account?")
    public WebElement noAccountLocator;

    @FindBy(linkText = "Reset Password")
    public WebElement resetPasswordLocator;

    @FindBy(css = "div[class='form-group field-password']+p")
    public WebElement errorMessageLocator;

    @FindBy(css = "div[class='clearfix oe_login_buttons']>button")
    public  WebElement confirmButtonLocator;

    public void login(String username, String password){
        userNameLocator.sendKeys(username);
        passwordLocator.sendKeys(password);
        logInButton.click();
        BriteUtils.waitForPageToLoad(5);
    }

    public String getErrorMessage(){
        return errorMessageLocator.getText();
    }

    public void resetPassword(String newPassword){
        resetPasswordLocator.click();
        userNameLocator.sendKeys(newPassword);
        confirmButtonLocator.click();
    }

}
