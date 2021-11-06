package com.libraryCT.step_definitions;

import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.*;

import java.sql.ResultSet;

public class UserInformationSteDef {

    public ResultSet actualRS;
    public ResultSet expectedRS;

    @Given("Establish the database connection")
    public void establish_the_database_connection() {

    }

    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {

    ResultSet actualRS =  DB_Util.runQuery("SELECT ID FROM users");
    ResultSet expectedRS =  DB_Util.runQuery("SELECT DISTINCT ID FROM users");

    }

    @Then("verify the result set")
    public void verify_the_result_set() {

        assertEquals(actualRS, expectedRS);


    }


}
