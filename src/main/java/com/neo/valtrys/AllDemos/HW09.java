package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class HW09 extends BaseClass {
    /*TC: Update Customer Information

1) Open chrome browser
2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
3) Login to the application
4) Verify customer "Susan McLaren" is present in the table
5) Click on customer details
6) Update customers last name and credit card info
7) Verify updated customers name and credit card number is displayed in table
8) Close browser
     */

    public static void main(String[] args) throws InterruptedException {
        setUp();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        for (int i = 1; i < rowElements.size(); i++) {
            String expected = rowElements.get(i).getText();
            System.out.println(expected);
            if (expected.contains("Susan McLaren")){
                System.out.println("Susan Verified");
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+(i + 1)+"]/td[13]/input")).click();
                break;
            }
        }


        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan Oz");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("45");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
        Thread.sleep(3000);
        tearDown();


    }
}
