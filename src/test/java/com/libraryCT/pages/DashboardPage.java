package com.libraryCT.pages;

import com.libraryCT.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    // add 3 elements that hold numbers
    // add @FindBy annotation
    @FindBy(id="user_count")
    private WebElement userCountElm ;
    @FindBy (id="book_count")
    private WebElement bookCountElm ;
    @FindBy (id="borrowed_books")
    private WebElement borrowedCountElm ;

    // add constructor
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // add 3 methods for getting the numbers
    public String getUserCountText(){
        return userCountElm.getText() ;
    }
    public String getBookCountText(){
        return bookCountElm.getText();
    }
    public String getBorrowedBookCountText(){
        return borrowedCountElm.getText();
    }


}