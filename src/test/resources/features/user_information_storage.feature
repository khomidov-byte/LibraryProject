@db @us1 @mousa
Feature: As a data consumer, I want the user information to be stored in mySql DB
  correctly in users table.

  Background:
    Given Establish the database connection-MA

  Scenario: verify the users have unique IDs
    When Execute query to get all IDs from users-MA
    Then verify the result set-MA

  Scenario: verify users table columns
    When Execute query to get all columns-MA
    Then verify the below columns are listed in result-MA
      | id            |
      | full_name     |
      | email         |
      | password      |
      | user_group_id |
      | image         |
      | extra_data    |
      | status        |
      | is_admin      |
      | start_date    |
      | end_date      |
      | address       |