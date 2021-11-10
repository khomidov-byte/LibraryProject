package com.libraryCT.step_definitions;

import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.*;
import org.junit.Assert;



public class UserVerifyBookGenreStepDef {


    @When("I execute query to find most popular book genre")
    public void i_execute_query_to_find_most_popular_book_genre() {

        DB_Util.runQuery("SELECT bc.name as BOOK_GENRE,count(bb.book_id) as BORROWED_BOOKS\n" +
                "FROM book_categories bc\n" +
                "    inner join books b on bc.id = b.book_category_id\n" +
                "    inner join book_borrow bb on b.id = bb.book_id\n" +
                "    GROUP BY bc.name\n" +
                "    ORDER BY 2 DESC");


    }
    @Then("verify {string} is the most popular book genre.")
    public void verify_is_the_most_popular_book_genre(String string) {

        String expectedRes = "Action and Adventure";
        String actualRes = DB_Util.getFirstRowFirstColumn();
        System.out.println("expectedRes = " + expectedRes);
        System.out.println("actualRes = " + actualRes);
        Assert.assertEquals(expectedRes,actualRes);

    }
}
