@ui @db @us5 @mousa
Feature: As a data consumer, I want UI and DB book information are match.
  Scenario: verify book information with DB
    Given I am in the homepage of library app-MA
    When I navigate to Books page-MA
    And I open a book called “Harry Potter”-MA
    When I established DB connection-MA
    And I execute query to get the book information from books table-MA
    Then verify book DB and UI information must match-MA
      | name | author | year |
      | Harry Potter | Djoan Rowling | 2000 |