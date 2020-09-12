package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);



}
