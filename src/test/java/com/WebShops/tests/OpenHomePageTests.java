package com.WebShops.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenHomePageTests extends TestBase{
    @Test
    public void openHomePageTest() {
        Assert.assertTrue(app.getHomepage().isHomeComponentPresent());
    }
}
