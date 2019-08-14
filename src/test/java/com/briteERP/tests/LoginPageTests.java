package com.briteERP.tests;

import com.briteERP.utils.ConfigurationReader;
import com.briteERP.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {

    @Test(description = "positive login test")
    public void loginTest1(){
        extentLogger = report.createTest("Login as event manager");
        pages.loginPage().login(ConfigurationReader.getProperty("username"),
            ConfigurationReader.getProperty("password"));
    }

    @Test(description = "negative login test")
    public void loginTest2(){
        extentLogger = report.createTest("Negative login test");
        extentLogger.info("Login with wrong username and wrong password");
        pages.loginPage().login("username", "invalidPassword");
        String msg = pages.loginPage().getErrorMessage();
        Assert.assertEquals(msg,"Wrong login/password");
        extentLogger.pass("Verified that Message present: " + pages.loginPage().getErrorMessage());
    }
}
