package com.libraryCT.runner;

import com.libraryCT.utility.DB_Util;

public class ShowBooks {

    public static void main(String[] args) {
        DB_Util.createConnection();
        DB_Util.runQuery("SELECT bc.name, COUNT(*)  FROM books b" +
                " INNER JOIN book_categories bc on b.book_category_id = bc.id" +
                " INNER JOIN book_borrow bb on bb.book_id = b.id"+
                " GROUP BY bc.name"+
                " ORDER BY COUNT(*) DESC");
        DB_Util.displayAllData();
    }
}
