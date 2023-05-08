package com.neo.valtry.tester.Test;

import com.neo.valtrys.utils.CommonMethods;
import com.neo.valtrys.utils.ConfigsReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends CommonMethods {
    public static void main(String[] args) {
        setUp();

        WebElement username = driver.findElement(By.id("txtUsername"));
        sendText(username, ConfigsReader.getProperties("username"));


        WebElement password = driver.findElement(By.id("txtPassword"));
        sendText(password, ConfigsReader.getProperties("password "));

        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        wait(3);

        WebElement logo = driver.findElement(By.id("ohrm-small-logo"));

        if (logo.isDisplayed()){
            System.out.println("test passed");
        } else {
        System.out.println("test failed");}
tearDown();
    }
}
