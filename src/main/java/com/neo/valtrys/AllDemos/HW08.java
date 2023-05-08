package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class HW08 extends BaseClass {
    /*Homework 1: Use WebDriverWait
        Verify element is enabled
        Open chrome browser
        Go to "https://the-internet.herokuapp.com/"
        Click on the "Dynamic Controls" link
        Click on enable button
        Enter "Hello" and verify text is entered successfully
        Close the browser

Homework 2: Same as Homework1 -> Use FluentWait
     */
    public static void main(String[] args) {

        setUp();
        driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
        driver.findElement(By.xpath("//form[@id='input-example']//button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//form[@id='input-example']//input")).sendKeys("HELLO");

        tearDown();

    }
}
