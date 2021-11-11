package com.libraryCT.runner;

import com.libraryCT.utility.DB_Util;

public class ShowBooks {

    public static void main(String[] args) {
        DB_Util.createConnection();
        DB_Util.runQuery("SELECT * FROM users");
        DB_Util.displayAllData();
    }
}
