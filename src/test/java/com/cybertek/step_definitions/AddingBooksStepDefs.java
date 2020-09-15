package com.cybertek.step_definitions;

import com.cybertek.pages.BooksModulePage;
import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingBooksStepDefs {

    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();
    BooksModulePage booksModulePage = new BooksModulePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("Librarian is logged in and on the Books module")
    public void librarian_is_logged_in_and_on_the_books_module() throws InterruptedException {

        loginPage.LoginMethod();

        landingPage.clickBooksModule();
    }


    @When("Librarian clicks add book icon")
    public void librarian_clicks_add_book_icon() {
      //see below
    }


    @When("Librarian enters book information and clicks save changes")
    public void librarian_enters_book_information_and_clicks_save_changes() throws InterruptedException {

       booksModulePage.clickAddBookButton();

       booksModulePage.inputBookInfo();


    }


    @Then("Book is displayed")
    public void book_is_displayed() throws InterruptedException {
        booksModulePage.confirmBookDisplayed();

        landingPage.logOut();

    }


    @Then("Librarian enters book {string} and {string} and {string} and {string} and {string} and clicks save changes")
    public void librarianEntersBookAndAndAndAndAndClicksSaveChanges(String book, String author, String desc, String isbn, String year) throws InterruptedException {


        booksModulePage.clickAddBookButton();


        booksModulePage.inputBookInfoDDT(book,author,desc,isbn,year);


        landingPage.logOut();


    }
}
