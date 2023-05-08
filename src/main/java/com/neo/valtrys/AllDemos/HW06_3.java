package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HW06_3 extends BaseClass {
    /*
    --------------------------------
Challenging Task
--------------------------------
Homework 3:
        Open chrome browser
        Go to "https://semantic-ui.com/modules/dropdown.html"
        Scroll down to "Multiple Selection"
        Click on drop down and select "CSS" and "HTML"
        Verify value has been selected
        Deselect 1 of the options from the dropdown
        Quit browser

     */
    public static void main(String[] args) throws InterruptedException {
        setUp();
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.xpath("//h4[text()='Multiple Search Selection']"))).perform();
//        driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']/i")).click();
        WebElement dropDown= driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/select"));
        Select select = new Select(dropDown);
        if (select.isMultiple()){
            select.selectByVisibleText("CSS");
            Thread.sleep(4000);

            select.selectByVisibleText("HTML");
        } else {
            System.out.println("Couldnt Select");
        }

        if (driver.findElement(By.xpath("//a[text()='CSS']")).isEnabled()){
            System.out.println("CSS IS SEEN");
        }else {
            System.out.println("TRY AGAIN");
        }

        if (driver.findElement(By.xpath("//a[text()='HTML']")).isEnabled()){
            System.out.println("HTML IS SEEN");
        }else {
            System.out.println("TRY AGAIN");
        }

        driver.findElement(By.xpath("//a[text()='CSS']/i")).click();
        Thread.sleep(4000);
        tearDown();
    }
}
