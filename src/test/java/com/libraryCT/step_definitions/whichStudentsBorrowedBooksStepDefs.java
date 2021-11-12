package com.libraryCT.step_definitions;

import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class whichStudentsBorrowedBooksStepDefs {

    @When("I execute query to full join books and book_categories on user_id-MA")
    public void iExecuteQueryToFullJoinBooksAndBook_categoriesOnUser_idMA() {
        DB_Util.runQuery("SELECT DISTINCT u.id, u.full_name FROM users u" +
                " INNER JOIN book_borrow bb on u.id = bb.user_id");
    }

    @Then("verify the data result set-MA")
    public void verifyTheDataResultSetMA() {
        DB_Util.displayAllData();
    }


    @Given("I am in the homepage of library app-MA")
    public void iAmInTheHomepageOfLibraryAppMA() {
    }

    @When("I navigate to {string} page-MA")
    public void iNavigateToPageMA(String arg0) {
    }

    @And("I open a book called “Harry Potter”-MA")
    public void iOpenABookCalledHarryPotterMA() {
    }

    @When("I established DB connection-MA")
    public void iEstablishedDBConnectionMA() {
    }

    @And("I execute query to get the book information from books table-MA")
    public void iExecuteQueryToGetTheBookInformationFromBooksTableMA() {
    }

    @Then("verify book DB and UI information must match-MA")
    public void verifyBookDBAndUIInformationMustMatchMA() {
    }
}
