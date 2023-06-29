package com.WebShop.fw;

import com.WebShop.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton() {
        click(By.cssSelector(".ico-register"));
    }

    public void fillLoginRegistrationForm(User user) {
        click(By.cssSelector("#gender-female"));
        type(By.id("FirstName"), user.getFirstname() );
        type(By.id("LastName"), user.getLastname());
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getPassword());

    }
    public void clickOnLoginRegistrationButton() {
        click(By.id("register-button"));
    }
}

