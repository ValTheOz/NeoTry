package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleDemo2 extends BaseClass {
    //https://demoqa.com/browser-windows

    public static void main(String[] args) throws InterruptedException {
        setUp();

        System.out.println("Main page -> " + driver.getTitle());
        String mainPageId = driver.getWindowHandle();
        System.out.println("Page ID is " + mainPageId);

        Thread.sleep(3000);

        driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Set Size " + allWindowHandles.size());

        tearDown();


    }
}
