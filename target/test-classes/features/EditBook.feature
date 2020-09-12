@editBook @smoke
Feature: Edit book

  Scenario: Librarian can edit book
    Given Librarian is logged in and on the Books module
    When Librarian clicks Edit Book icon
    And Librarian changes the book name and clicks save changes
    Then The book has been updated