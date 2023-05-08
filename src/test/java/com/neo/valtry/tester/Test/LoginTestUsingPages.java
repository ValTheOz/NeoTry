package com.neo.valtry.tester.Test;

import com.neo.valtrys.Pages.LoginPage;
import com.neo.valtrys.utils.CommonMethods;
import com.neo.valtrys.utils.ConfigsReader;

public class LoginTestUsingPages extends CommonMethods {
    public static void main(String[] args) {
        setUp();

        LoginPage loginPage = new LoginPage();
        sendText(loginPage.username, ConfigsReader.getProperties("username"));
        sendText(loginPage.password, ConfigsReader.getProperties("password"));

        loginPage.submitButton.click();
        wait(3);
        tearDown();
    }
}
