@bookCategories @smoke
Feature: Book categories filter

  Scenario: Librarian uses book categories filter to search for Drama books
    Given Librarian is logged in and on the Books module
    When Librarian selects book categories dropdown and clicks Drama
    Then Books under category Drama will be displayed
