@editBook
Feature: Edit book

  Scenario: Librarian can edit book
    Given Librarian is logged in and on the Books module
    When Librarian clicks Edit Book icon for Harry Potter book
    And Librarian changes the book name to Funny Guy With No Nose and clicks save changes
    Then The book has been updated