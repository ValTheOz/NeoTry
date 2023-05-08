package com.neo.valtrys.Pages;

import com.neo.valtrys.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithFactory {
    @FindBy(id = "txtUsername")

    public WebElement username;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//button[@type='']")
    public WebElement passwordError;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement invalidMsg;

    public LoginPageWithFactory() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}

