package com.libraryCT.step_definitions;

import static com.libraryCT.utility.DB_Util.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.List;

public class UserInformationStorageStepDefs {
    List<String> columnNames;

    @Given("Establish the database connection-MA")
    public void establishTheDatabaseConnectionMA() {
    }

    @When("Execute query to get all IDs from users-MA")
    public void executeQueryToGetAllIDsFromUsersMA() {
    }

    @Then("verify the result set-MA")
    public void verifyTheResultSetMA() {
    }

    @When("Execute query to get all columns-MA")
    public void executeQueryToGetAllColumns() {
        runQuery("SELECT * FROM users");
        columnNames = getAllColumnNamesAsList();
    }

    @Then("verify the below columns are listed in result-MA")
    public void verifyTheBelowColumnsAreListedInResult(List<String> columnNames) {
        assertEquals(columnNames, this.columnNames);
    }


}
