package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

public class HW07 extends BaseClass {
    /*
    ==================  HW_1_Handling Multiple Windows =======================

1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed.Switch to the parent window.
6) Quit all browsers
     */

    public static void main(String[] args) throws InterruptedException {
        setUp();
        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Thread.sleep(5000);
        String childWindowHandle = driver.getWindowHandle();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='emailid']")).click();
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Valpal@gmail.com");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        Thread.sleep(5000);
        driver.switchTo().window(mainWindowHandle);
        driver.switchTo().window(childWindowHandle).close();

        tearDown();
    }
}
