package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;


    public static WebDriver getDriver(){
        if(driver==null){
            String browser = ConfigurationReader.getProperty("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("chrome-headless".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            } else if ("chrome-remote".equals(browser)) {
                try {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    URL url = new URL("http://18.206.13.27:4444/wd/hub");
                    driver = new RemoteWebDriver(url, chromeOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if ("firefox-remote".equals(browser)) {
                try {
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    URL url = new URL("http://18.206.13.27:4444/wd/hub");
                    driver = new RemoteWebDriver(url, firefoxOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if ("firefox-headless".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
            }
        }
        return driver;
    }



    // closing the browser and re-setting its value to null
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
