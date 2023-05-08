package com.neo.valtrys.utils;

import com.neo.valtrys.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    protected static WebDriver driver;


    public static void setUp(){
        driver = Driver.getDriver();
        driver.get(ConfigsReader.getProperties("url"));
    }

    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
