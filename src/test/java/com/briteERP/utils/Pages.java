package com.briteERP.utils;

import com.briteERP.pages.LoginPage;

public class Pages {
    private LoginPage loginPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }



}

