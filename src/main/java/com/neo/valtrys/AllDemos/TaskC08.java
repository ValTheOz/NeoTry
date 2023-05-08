package com.neo.valtrys.AllDemos;

import com.beust.ah.A;
import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TaskC08 extends BaseClass {
    public static void main(String[] args) {
        setUp();
        driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
        driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='finish']"))));
        WebElement verifyHEader = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        Assert.assertTrue(verifyHEader.isDisplayed());
        tearDown();
    }
}
