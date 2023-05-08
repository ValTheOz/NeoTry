package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HW07_2 extends BaseClass {
    public static void main(String[] args) {
        /*=================   HW_2_Handling Frames =================================

1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
2) Verify on the page header "Not a Friendly Topic" displayed
3) Click on the Inner Frame Check box
4) Choose baby Cat from Animals dropdown
5) Quit the browser
         */

        setUp();
        WebElement pageHeader = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        Assert.assertTrue(pageHeader.isDisplayed());
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3").findElement(By.id("a")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        driver.findElement(By.id("animals")).click();
        driver.findElement(By.xpath("//option[@value='babycat']")).click();

        tearDown();

    }
}
