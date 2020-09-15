package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LandingPage extends BasePage {



    @FindBy(xpath = "(//span[@class = 'title'])[3]")
    private WebElement booksModuleButton;

    @FindBy(xpath = "//a[@id = 'navbarDropdown']")
    private WebElement userNameDropDown;

    @FindBy(xpath = "//a[@class = 'dropdown-item']")
    private WebElement logOutButton;

    public void clickBooksModule() throws InterruptedException {

        booksModuleButton.click();
        Thread.sleep(5000);
    }

    public void logOut() throws InterruptedException {

        Thread.sleep(10000);

        userNameDropDown.click();
        logOutButton.click();

        Thread.sleep(1000);
    }



}
