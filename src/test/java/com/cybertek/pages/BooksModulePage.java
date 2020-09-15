package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BooksModulePage extends BasePage {

    @FindBy(xpath = "//i[@class = 'fa fa-plus']")
    private WebElement addBooksButton;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement bookNameBox;

    @FindBy(xpath = "//input[@name='author']")

    private WebElement authorNameBox;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement descriptionNameBox;

    @FindBy(xpath = "//input[@name='isbn']")
    private WebElement isbnNameBox;

    @FindBy(xpath = "//input[@name='year']")
    private WebElement yearNameBox;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement saveChangesButton;

    public void clickAddBookButton() throws InterruptedException {

        addBooksButton.click();
        Thread.sleep(1000);
    }


    public void inputBookInfo() {  // try data driven testing
        //Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        wait.until(ExpectedConditions.visibilityOf(bookNameBox));
        bookNameBox.sendKeys(ConfigurationReader.getProperty("bookName"));

        wait.until(ExpectedConditions.elementToBeClickable(authorNameBox));
        authorNameBox.sendKeys("J.K. Rowling");

        wait.until(ExpectedConditions.elementToBeClickable(descriptionNameBox));
        descriptionNameBox.sendKeys("Throughout the series, Harry is described as having his father's perpetually untidy black hair, his mother's bright green eyes, and a lightning bolt-shaped scar on his forehead. ");

        wait.until(ExpectedConditions.elementToBeClickable(isbnNameBox));
        isbnNameBox.sendKeys(ConfigurationReader.getProperty("isbn"));

        wait.until(ExpectedConditions.elementToBeClickable(yearNameBox));
        yearNameBox.sendKeys("2000");

        saveChangesButton.click();
    }



    public void inputBookInfoDDT(String book, String author, String desc, String isbn, String year) throws InterruptedException {  // try data driven testing
       // Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOf(bookNameBox));
        bookNameBox.sendKeys(book);

        wait.until(ExpectedConditions.elementToBeClickable(authorNameBox));
        authorNameBox.sendKeys(author);

        wait.until(ExpectedConditions.elementToBeClickable(descriptionNameBox));
        descriptionNameBox.sendKeys(desc);

        wait.until(ExpectedConditions.elementToBeClickable(isbnNameBox));
        isbnNameBox.sendKeys(isbn);

        wait.until(ExpectedConditions.elementToBeClickable(yearNameBox));
        yearNameBox.sendKeys(year);

        saveChangesButton.click();




    }


    public void EditBookInfo() {  // try data driven testing
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        wait.until(ExpectedConditions.visibilityOf(bookNameBox));
        bookNameBox.clear();
        bookNameBox.sendKeys("Funny Guy With No Nose");

        wait.until(ExpectedConditions.elementToBeClickable(authorNameBox));
        authorNameBox.sendKeys("J.K. Rowling");

        wait.until(ExpectedConditions.elementToBeClickable(descriptionNameBox));
        descriptionNameBox.sendKeys("Throughout the series, Harry is described as having his father's perpetually untidy black hair, his mother's bright green eyes, and a lightning bolt-shaped scar on his forehead. ");

        wait.until(ExpectedConditions.elementToBeClickable(isbnNameBox));
        isbnNameBox.sendKeys(ConfigurationReader.getProperty("isbn"));

        wait.until(ExpectedConditions.elementToBeClickable(yearNameBox));
        yearNameBox.sendKeys("2000");

        saveChangesButton.click();
    }







    @FindBy(xpath = "//input[@type = 'search']")
    private WebElement searchBox;

    public void confirmBookDisplayed() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(searchBox));


        Thread.sleep(5000);
        searchBox.sendKeys(ConfigurationReader.getProperty("bookName"));

        Thread.sleep(1000);


        WebElement  tableISBNNum = Driver.getDriver().findElement(By.xpath("//table[@id = 'tbl_books']//tr[1]//td[2]"));



        System.out.println("tableISBNNum = " + tableISBNNum.getText());
       tableISBNNum.equals(ConfigurationReader.getProperty("isbn"));
    }






}
