package com.briteERP.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    //we don't want to access these variables outside
    private static final Logger logger = LogManager.getLogger();


    public PageBase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
