package com.WebShop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
public class AppManager {
    String browser;
    public WebDriver driver;

    UserHelper user;
    OpenHomePageHelper homepage;
    HeaderHelper header;

    public AppManager(String browser) {
        this.browser = browser;
    }

    public UserHelper getUser() {
        return user;
    }

    public HeaderHelper getHeader() {
        return header;
    }

    public OpenHomePageHelper getHomepage() {
        return homepage;
    }

    public void init() {
        System.err.close();//schtobi wse krasnoe wnisu w outpute ne otobraschalos

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();//initialisazia metodow
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("remote-allow-origins=*");
            driver = new EdgeDriver(options);
        }

        driver.get("https://demowebshop.tricentis.com/"); //sajti
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //dast 10 sec wremeni schtobi sajt uspel sagrusitsa, a potom test
    }

    public void stop() {
        driver.quit();
    }

    //Homework
    //Пожалуйста, автоматизируйте на сайте следующий сценарий:
    //1 Открыть сайт, развернуть браузер на весь экран
    //2 Перейти на страницу регистрации
    //3 Зарегистрироваться
    //4 Убедиться, что вы зарегистрированы
    //Условия:
    //Использовать модель Value Object
    //Использовать сборщик Gradle
}
