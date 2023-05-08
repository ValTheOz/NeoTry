package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.CommonMethods;
import com.neo.valtrys.utils.ConfigsReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HW12_2  extends CommonMethods {
    /*Go to https://hrm.neotechacademy.com/
Log in using our custom methods
Go to PIM menu
Add an employee
Go to Employee List
Get the list of the employees (Using tables - tr and td)
Loop to search for the employee you added
When you find the employee - click on it.
Take a screenshot
     */
    public static void main(String[] args) {
        setUp();
        sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperties("username"));
        sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperties("password"));
        click(driver.findElement(By.xpath("//button[@type='submit']")));
        click(driver.findElement(By.xpath("//span[text()='PIM']")));
        click(driver.findElement(By.xpath("//span[text()='Add Employee']")));
        wait(10);
        driver.findElement(By.id("first-name-box")).sendKeys("fransineth");
        driver.findElement(By.id("middle-name-box")).sendKeys("no");
        driver.findElement(By.id("last-name-box")).sendKeys("ok");
        wait(10);
        driver.findElement(By.id("employeeId")).sendKeys("995");
        WebElement location = driver.findElement(By.id("location"));
        Select locationDropdown = new Select(location);
        locationDropdown.selectByVisibleText("New York Sales Office");
        wait(5);
        click(driver.findElement(By.cssSelector("button#modal-save-button")));
        wait(7);

        List<WebElement> employees = driver.findElements(By.xpath("//table[@id='employeeListTable']//tr/td"));
        for (int i = 0; i < employees.size(); i++) {
            String employeeInfo = employees.get(i).getText();
            if (employeeInfo.contains("fransineth")){
                System.out.println(employeeInfo);
                click(driver.findElement(By.xpath("//table[@id='employeeListTable']//tr["+ (i+1)+ "]/td")));
            }
        }

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        try {
            FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE), new File("screenshots/HMRemployyeeshot.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tearDown();
    }
}
