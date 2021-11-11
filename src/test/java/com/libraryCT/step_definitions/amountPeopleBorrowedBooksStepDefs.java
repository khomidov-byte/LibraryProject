package com.libraryCT.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.libraryCT.utility.DB_Util.*;

public class amountPeopleBorrowedBooksStepDefs {

    @When("I execute query to inner join users and book_borrow on Id")
    public void iExecuteQueryToInnerJoinUsersAndBook_borrowOnId() {
        runQuery("SELECT COUNT(user_id)\n" +
                "FROM (SELECT DISTINCT user_id FROM book_borrow) AS T");
    }

    @Then("verify amount of people who had borrowed books")
    public void verifyAmountOfPeopleWhoHadBorrowedBooks() {
        System.out.println(getFirstRowFirstColumn());
    }

}