package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DBBookInfoMatchesUI {

    @Given("I am in the homepage of library app-MA")
    public void iAmInTheHomepageOfLibraryAppMA() {
        LoginPage login = new LoginPage();
        login.librarianLogin();
    }

    @When("I navigate to Books page-MA")
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
