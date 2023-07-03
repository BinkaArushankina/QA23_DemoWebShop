package com.WebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenHomePageHelper extends BaseHelper{
    public OpenHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".topic-html-content-title"));
    }
}
