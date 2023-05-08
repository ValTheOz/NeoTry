package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HW12 extends CommonMethods {
    //Open chrome browser
    //Go to https://demo.seleniumeasy.com/
    //Click on "Others"
    //Click on "Drag and Drop"
    //Drag items 2, 4 and 1 from "Item to Drag" and drop them under "Drop Here"
    //Close the browser
    public static void main(String[] args) {
        setUp();
        wait(10);
        click(driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[2]/li[4]/a")));
        click(driver.findElement(By.linkText("Drag and Drop")));

        WebElement drag2 = driver.findElement(By.xpath("//div[@id='todrag']/span[2]"));
        WebElement drag4 = driver.findElement(By.xpath("//div[@id='todrag']/span[4]"));
        WebElement drag1 = driver.findElement(By.xpath("//div[@id='todrag']/span[1]"));
        WebElement dropZone = driver.findElement(By.id("mydropzone"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag2, dropZone).perform();
        actions.dragAndDrop(drag4, dropZone).perform();
        actions.dragAndDrop(drag1, dropZone).perform();
        tearDown();
    }
}
