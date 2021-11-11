package com.libraryCT.step_definitions;


import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mostBorrowedGenreStepDefs {
    @When("I execute query to left outer inner join books and book_borrow on Book_Id - MA")
    public void iExecuteQueryToLeftOuterInnerJoinBooksAndBook_borrowOnBook_IdMA() {
        DB_Util.runQuery("SELECT book_category_id, COUNT(*) " +
                "FROM (SELECT book_category_id FROM books b " +
                "INNER JOIN book_borrow bb on bb.book_id = b.id) AS T " +
                "GROUP BY book_category_id ");
    }

    @Then("verify what is the most popular book genre. - MA")
    public void verifyWhatIsTheMostPopularBookGenreMA() {
        String bookCategoryID = DB_Util.getFirstRowFirstColumn();
        DB_Util.runQuery("SELECT name FROM book_categories " +
                "WHERE id = "+bookCategoryID);
        System.out.println(DB_Util.getFirstRowFirstColumn());
    }
}
