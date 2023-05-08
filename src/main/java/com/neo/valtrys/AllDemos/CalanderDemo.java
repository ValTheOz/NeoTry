package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class CalanderDemo extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        driver.findElement(By.id("input_departureDate_1")).click();
        String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        while (!month.equals("July")) {
            driver.findElement(By.xpath("//span[text()='Next']")).click();
            month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        }
        List<WebElement> cellsOnCalander = driver.findElements(By.xpath("//table/tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        Iterator<WebElement> iterator = cellsOnCalander.iterator();
        while (iterator.hasNext()) {
            String dayNum = iterator.next().getText();
            if (dayNum.equals("25")) {
                iterator.next().click();
                break;
            }
            Thread.sleep(3000);
        }
        String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        while (!returnMonth.equals("December")) {
            driver.findElement(By.xpath("//span[text()='Next']")).click();
            returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
        }
        List<WebElement> returnCells = driver.findElements(By.xpath("//table/tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        Thread.sleep(3000);
        for (WebElement returnCell : returnCells) {
            String dayText = returnCell.getText();
            if (dayText.equals("5")) {
                returnCell.click();
                Thread.sleep(3000);
                break;
            }
        }

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@value='done']")).click();


        tearDown();
    }
}

