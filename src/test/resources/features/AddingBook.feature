 @smoke
Feature: Adding Books

  @addingOneBook
  Scenario: : Librarian has access to add books into system
  Given Librarian is logged in and on the Books module
  When Librarian clicks add book icon
  And Librarian enters book information and clicks save changes
  Then Book is displayed

    @addingManyBooks
    Scenario Outline: Librarian has access to add books into system
      Given Librarian is logged in and on the Books module
      When Librarian clicks add book icon
      Then Librarian enters book "<BookName>" and "<AuthorName>" and "<Description>" and "<ISBN>" and "<Year>" and clicks save changes
      Examples:
        |BookName|AuthorName|Description|ISBN|Year|
        |Lord of The Rings|JRR Tolkien|Nerdy book about rings|20302010|1999|
        |Becoming Obama|Michelle Obama|A book about a  lady|2939939393|2020|
        |IT|Stephen King|Scary book about clowns and spiders|30209494994|1985|


