package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import com.neo.valtrys.utils.ConfigsReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW08_2 extends BaseClass {/*Homework 3:
        Add Employee
        Open chrome browser
        Go to "https://hrm.neotechacademy.com/"
        Login into the application
        Click on PIM > Add Employee
        Add Employee
        Log out
        Quit the browser
       */

    public static void main(String[] args) throws InterruptedException {
    setUp();
        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(20));
        fluentWait.pollingEvery(Duration.ofSeconds(1));



        driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperties("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperties("password"));
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Add Employee")).click();
        fluentWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("first-name-box"))));

        driver.findElement(By.id("first-name-box")).sendKeys("Val");
        driver.findElement(By.id("middle-name-box")).sendKeys("cal");
        driver.findElement(By.id("last-name-box")).sendKeys("pal");
        driver.findElement(By.id("employeeId")).sendKeys("995");
        WebElement location = driver.findElement(By.id("location"));
        Select locationDropdown = new Select(location);
        locationDropdown.selectByVisibleText("New York Sales Office");
//      Thread.sleep(1000);
        fluentWait.withTimeout(Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Save']"))));
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("account-job"))));
//        Thread.sleep(1000);

        driver.findElement(By.id("account-job")).click();
//        Thread.sleep(1000);
        driver.findElement(By.id("logoutLink")).click();
        tearDown();


    }

}
