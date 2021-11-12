package com.libraryCT.runner;

import com.libraryCT.utility.DB_Util;

public class ShowBooks {

    public static void main(String[] args) {
        DB_Util.createConnection();
        DB_Util.runQuery("SELECT DISTINCT u.id, u.full_name FROM users u" +
                " INNER JOIN book_borrow bb on u.id = bb.user_id" );
        DB_Util.displayAllData();
    }
}
