package com.WebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends BaseHelper{
    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnLogOutButton() {click(By.cssSelector("[href='/logout']"));}

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public boolean isSignOutButtonPresent() {return isElementPresent(By.cssSelector("[href='/logout']"));}


}
