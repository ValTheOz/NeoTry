package com.neo.valtrys;

import com.neo.valtrys.utils.CommonMethods;
import com.neo.valtrys.utils.ConfigsReader;
import org.openqa.selenium.By;

public class JavaExecutorDemo extends CommonMethods {
    public static void main(String[] args) {
        setUp();
        sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperties("username"));
        sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperties("password"));
        click(driver.findElement(By.xpath("//button[@type='submit']")));
        click(driver.findElement(By.xpath("//span[text()='PIM']")));
        click(driver.findElement(By.xpath("//span[text()='Add Employee']")));
        tearDown();
    }
}
