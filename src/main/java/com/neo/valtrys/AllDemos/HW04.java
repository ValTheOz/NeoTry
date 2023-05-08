package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HW04 extends BaseClass {

    /*
    ===========HW-1==========
Open chrome browser
Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
Enter valid username
Clear username and enter again valid username
Leave password field empty
Click on login button
Verify error message with text "Invalid Login or Password." is displayed.

===========HW-2==========
Radio Button Practice
Open chrome browser
Go to "https://demoqa.com/radio-button"
Verify if all radio buttons are displayed and clickable
Click on all radio buttons
Verify radio buttons has been clicked successfully
Quit browser
     */
    public static void main(String[] args) {
    setUp();
//        "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//    driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
//        WebElement invalidPopUpText = driver.findElement(By.cssSelector("input#ctl00_MainContent_status"));
//        Assert.assertTrue(invalidPopUpText.isDisplayed());

        //#2
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='like']"));
        for (WebElement radioButton: radioButtons) {
                if (radioButton.isEnabled()){
                    System.out.println(radioButton.getAttribute("id") + " button is working");
                } else {
                    System.out.println(radioButton.getAttribute("id") + " button is not working");
                }
        }


    }}
