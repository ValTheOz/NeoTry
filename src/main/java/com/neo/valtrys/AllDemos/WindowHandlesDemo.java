package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlesDemo extends BaseClass {

    public static void main(String[] args) throws InterruptedException {
        setUp();

        System.out.println("the title of the main page is -> " + driver.getTitle());
        String mainPageId = driver.getWindowHandle();
        System.out.println("The main page ID is -> " + mainPageId);
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        Thread.sleep(1000);

        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> it = allWindowHandles.iterator();
        String window1 = it.next();
        String window2 = it.next();

        System.out.println("window1 -> " + window1);
        System.out.println("window2 -> " + window2);

        driver.switchTo().window(window1);
        System.out.println(driver.getTitle());

//        driver.close(); // will close current window
        driver.switchTo().window(window2);


        Thread.sleep(3000);

        tearDown();
    }
}
