package com.libraryCT.step_definitions;


import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class BorrowedBooks_stepDef {


    public int actualRS;
    public int expectedRS = 6073;


    @Given("Establish the database connections")
    public void establish_the_database_connections() {

        DB_Util.createConnection();

    }

    @When("I execute query to full join books and book_categories on user_id")
    public void iExecuteQueryToFullJoinBooksAndBook_categoriesOnUser_id() {
   DB_Util.runQuery("SELECT * FROM users inner JOIN book_borrow bb on users.id = bb.user_id");
        //System.out.println(DB_Util.getColumnDataAsList("full_name"));
        actualRS = DB_Util.getRowCount();
    }

    @Then("verify the data result set")
    public void verifyTheDataResultSet() {
        assertEquals(actualRS, expectedRS);
    }
}
