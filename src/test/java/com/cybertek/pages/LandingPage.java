package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {



    @FindBy(xpath = "(//span[@class = 'title'])[3]")
    private WebElement booksModuleButton;

    @FindBy(xpath = "//a[@id = 'navbarDropdown']")
    private WebElement userNameDropDown;

    @FindBy(xpath = "//a[@class = 'dropdown-item']")
    private WebElement logOutButton;

    public void clickBooksModule(){
        wait.until(ExpectedConditions.urlContains("dashboard"));
        booksModuleButton.click();
    }

    public void logOut(){
        wait.until(ExpectedConditions.urlContains("dashboard"));
        userNameDropDown.click();
        logOutButton.click();
    }



}
