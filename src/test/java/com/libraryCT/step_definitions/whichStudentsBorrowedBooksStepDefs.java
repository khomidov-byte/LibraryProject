package com.libraryCT.step_definitions;

import com.libraryCT.utility.DB_Util;
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

}
