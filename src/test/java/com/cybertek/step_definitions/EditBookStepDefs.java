package com.cybertek.step_definitions;

import com.cybertek.pages.BooksModulePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EditBookStepDefs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    BooksModulePage booksModulePage = new BooksModulePage();

    @When("Librarian clicks Edit Book icon for Harry Potter book")
    public void librarianClicksEditBookIconForHarryPotterBook() throws InterruptedException {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //  Thread.sleep(4000);

      WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@type = 'search']"));

        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath("//input[@type = 'search']"))));
       searchBox.sendKeys("Harry Potter");

        Thread.sleep(1000);

        WebElement editBookIcon = Driver.getDriver().findElement(By.xpath("//a[@onclick = 'Books.edit_book(1730)']"));
        editBookIcon.click();

        Thread.sleep(2000);


        booksModulePage.EditBookInfo();

    }

    @And("Librarian changes the book name to Funny Guy With No Nose and clicks save changes")
    public void librarianChangesTheBookNameToFunnyGuyWithNoNoseAndClicksSaveChanges() {
    }

    @Then("The book has been updated")
    public void theBookHasBeenUpdated() {
    }
}
