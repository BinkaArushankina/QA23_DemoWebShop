package com.WebShops.tests;

import com.WebShop.fw.AppManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    protected static AppManager app = new AppManager
            (System.getProperty("browser", Browser.CHROME.browserName()));



    @BeforeSuite(enabled = true)
    public void setUp() {
        app.init();
    }
    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}
