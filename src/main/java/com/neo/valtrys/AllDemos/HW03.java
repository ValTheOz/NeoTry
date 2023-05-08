package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW03 extends BaseClass {
    /*Homework 2:
    Using Css ONLY
    TC 2: Mercury Tours Registration:
        Open chrome browser
        Go to “http://demo.guru99.com/test/newtours/”
        Click on Register Link
        Fill out all required info
        Click Submit
        User successfully registered
     */
    public static void main(String[] args) throws InterruptedException {
        setUp();
        Thread.sleep(5000);
        driver.findElement(By.id("close")).click();
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Val");
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("pal");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("029438034");
        driver.findElement(By.cssSelector("input#userName")).sendKeys("Val@gmail.com");
        driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("efdlqkwdjfbkelfrdj");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("efdlqkwdjfbkelfrdj");
        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("efdlqkwdjfbkelfrdj");
        driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("2346");
        driver.findElement(By.cssSelector("select[name='country']")).sendKeys("United States");
        driver.findElement(By.cssSelector("input[name='submit']")).click();
        tearDown();

    }


}
