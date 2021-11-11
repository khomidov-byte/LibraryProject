package com.libraryCT.step_definitions;


import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mostBorrowedGenreStepDefs {
    @When("I execute query to left outer inner join books and book_borrow on Book_Id - MA")
    public void iExecuteQueryToLeftOuterInnerJoinBooksAndBook_borrowOnBook_IdMA() {
        DB_Util.runQuery("SELECT bc.name, COUNT(*)  FROM books b" +
                " INNER JOIN book_categories bc on b.book_category_id = bc.id" +
                " INNER JOIN book_borrow bb on bb.book_id = b.id"+
                " GROUP BY bc.name"+
                " ORDER BY COUNT(*) DESC");
    }

    @Then("verify what is the most popular book genre. - MA")
    public void verifyWhatIsTheMostPopularBookGenreMA() {
        System.out.println(DB_Util.getFirstRowFirstColumn());
    }
}
