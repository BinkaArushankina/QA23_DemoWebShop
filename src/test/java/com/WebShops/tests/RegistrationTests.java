package com.WebShops.tests;
import com.WebShop.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class RegistrationTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnLogOutButton();
        }
        app.getUser().clickOnRegistrationButton();

        app.getUser().fillLoginRegistrationForm(new User().setEmail("arusha@gmail.com").setPassword("aaaaaaa"));
        app.getUser().clickOnLoginRegistrationButton();

        Assert.assertTrue(app.getHeader().isSignOutButtonPresent());
    }




}
