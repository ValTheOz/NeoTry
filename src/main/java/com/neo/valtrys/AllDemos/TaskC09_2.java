package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import com.neo.valtrys.utils.ConfigsReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskC09_2 extends BaseClass {
    public static void main(String[] args) {
        setUp();

        driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperties("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperties("password"));
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.linkText("Employee List")).click();
        List<WebElement> rowsData = driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr"));
        String expected ="Linda";
        for (int i = 0; i < rowsData.size(); i++) {
            String rowText = rowsData.get(i).getText();
            System.out.println(rowText);
            if (rowText.contains(expected)){
                driver.findElements(By.xpath("//table[@id='employeeListTable']//td[1]")).get(i).click();
           break;
            }
        }

        //This ^^ or vv
        for (int i = 0; i < rowsData.size(); i++) {
            String rowText = rowsData.get(i).getText();
            System.out.println(rowText);
            if (rowText.contains(expected)){
                int row = i +1;
                driver.findElements(By.xpath("//table[@id='employeeListTable']/tbody/tr[" + row + "]/td[1]"));
                break;
            }}
        tearDown();
    }
}
