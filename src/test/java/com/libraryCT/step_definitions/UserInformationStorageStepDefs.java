package com.libraryCT.step_definitions;

import static com.libraryCT.utility.DB_Util.*;

import static com.libraryCT.utility.DB_Util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.util.List;

public class UserInformationStorageStepDefs {
     private List<String> columnNames;
     private ResultSet rs;

    @Given("Establish the database connection-MA")
    public void establishTheDatabaseConnectionMA() {
    }

    @When("Execute query to get all IDs from users-MA")
    public void executeQueryToGetAllIDsFromUsersMA() {
         rs = runQuery("SELECT COUNT(*) FROM users GROUP BY id");
    }

    @Then("verify the result set-MA")
    public void verifyTheResultSetMA() {
        for(String count: getColumnDataAsList("count(*)")){
            if(!count.equals("1")){
                fail("Id's are not unique");
            }
        }
        assertTrue(true);
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
