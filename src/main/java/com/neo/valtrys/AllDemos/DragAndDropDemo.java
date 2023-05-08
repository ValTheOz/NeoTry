package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo extends CommonMethods {
    public static void main(String[] args) {
        setUp();
        switchToFrame(0);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag, drop).perform();
        tearDown();
    }
}
