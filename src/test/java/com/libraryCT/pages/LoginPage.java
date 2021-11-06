package com.libraryCT.pages;

import com.libraryCT.utility.ConfigReader;
import com.libraryCT.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id="inputEmail")
    private WebElement usernameBox ;

    @FindBy(id="inputPassword")
    private WebElement passwordBox ;

    @FindBy(xpath="//button[.='Sign in']")
    private WebElement loginButton ;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }

    public void goTo(){
//        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        Driver.getDriver().get(ConfigReader.read( "library2.ui.url" ) );
    }

    public void login(String username, String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }


}