@db @us3 @mousa
Feature: As a librarian, I want to know genre of books are being borrowed the most .

  Scenario: verify the the common book genre that’s being borrowed
    Given Establish the database connection
    When I execute query to left outer inner join books and book_borrow on Book_Id - MA
    Then verify what is the most popular book genre. - MA