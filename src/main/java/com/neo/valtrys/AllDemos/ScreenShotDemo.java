package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.CommonMethods;
import com.neo.valtrys.utils.ConfigsReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo extends CommonMethods {

    public static void main(String[] args) {
        setUp();
        sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperties("username"));
        sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperties("password"));
        click(driver.findElement(By.xpath("//button[@type='submit']")));

        wait(5);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/HRM?screenshot01.png"));
            //        FileUtils.copyFile(ts.getScreenshotAs(OutputType),new File("screenshots/HRM?screenshot01.png") );

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("We did not take a screenShot");
        }

        tearDown();
    }
}
