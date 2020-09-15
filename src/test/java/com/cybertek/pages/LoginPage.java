package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@id = 'inputEmail']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@id = 'inputPassword']")
    private WebElement passwordBox;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement submitButton;


    public void LoginMethod() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        wait.until(ExpectedConditions.urlContains("login"));

        emailBox.sendKeys(ConfigurationReader.getProperty("librarianusername"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("librarianpassword"));
        submitButton.click();

        Thread.sleep(5000);
    }
}
