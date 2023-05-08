package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HW06_2 extends BaseClass {
    /*
Homework 2:
        Alert text verification
        Open chrome browser
        Go to https://demoqa.com/
        Click on "Alerts, Frame & Windows" link
        Click on "Alerts" links on the left side
        Click on button to see Alert
        Verify alert box with text "You clicked a button" is present
        Click on 3rd button in the page
        Verify alert box with text "Do you confirm action?" is present and click "confirm"
        Click on 4 th button in the page and enter your name and click ok.
        Quit browser
     */
    public static void main(String[] args) throws InterruptedException {
        setUp();
        Thread.sleep(15000);
//        driver.findElement(By.id("item-1")).click();
        driver.findElement(By.xpath("//span[text()='Alerts']/..")).click();
                driver.findElement(By.id("alertButton")).click();
                if (driver.switchTo().alert().getText().equals("You clicked a button")){
                    System.out.println("You clicked a button is verified");
                } else {
                    System.out.println("you clicked button is NOT verified");
                }

        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("button#confirmButton")).click();
        if (driver.switchTo().alert().getText().equals("Do you confirm action?")){
            System.out.println("Do you confirm action? is verified");
        }else {
            System.out.println("Do you confirm action? is NOT verified");
        }
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("button#promtButton")).click();
        Thread.sleep(4000);
//        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Val");
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(4000);


        tearDown();
    }
}
