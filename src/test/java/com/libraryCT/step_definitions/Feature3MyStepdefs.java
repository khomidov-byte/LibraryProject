package com.libraryCT.step_definitions;

import com.libraryCT.utility.DB_Util;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Feature3MyStepdefs {

;
    String actual;

    @When("I execute query to find most popular book genre")
    public void iExecuteQueryToFindMostPopularBookGenre() {

        DB_Util.runQuery("select bc.name,count(bb.book_id) as count from book_categories bc\n" +
                             "inner join book_borrow bb\n" +
                             "on book_id = bc.id\n" +
                             "group by bc.name\n" +
                             "order by 2 desc;");
        actual =  DB_Util.getCellValue(1,1);
    }

    @Then("verify {string} is the most popular book genre..")
    public void verifyIsTheMostPopularBookGenre(String string) {


        String expected = "Action and Adventure";
        assertEquals(expected,actual);


    }
}
