@db
Feature: As a librarian, I want to know genre of books are being borrowed the most


  Scenario: verify the the common book genre that’s being borrowed
    Given Establish the database connection
    When I execute query to find most popular book genre-BT
    Then verify "Action and Adventure" is the most popular book genre.-BT