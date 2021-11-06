@db
Feature: As a data consumer, I want the user informations are stored in mySql DB
  correctly in users table

  Scenario: verify users has unique IDs
    Given Establish the database connection
    When Execute query to get all IDs from users
    Then verify the result set
