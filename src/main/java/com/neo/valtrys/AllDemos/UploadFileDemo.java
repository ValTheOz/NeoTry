package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.CommonMethods;
import org.openqa.selenium.By;

public class UploadFileDemo extends CommonMethods {
    public static void main(String[] args) {
        setUp();
        click(driver.findElement(By.linkText("File Upload")));
        String filePath = System.getProperty("user.dir") + "/screenShots/HRM?screenshot01.png";
        String filePathComp = System.getProperty("user.dir") + "/users/valperez/Downloads/name";
        driver.findElement(By.id("file-upload")).sendKeys("Elion.txt");
        wait(2);
        driver.findElement(By.id("file-submit")).click();
        tearDown();
    }
}
