package com.neo.valtry.tester;

import com.neo.valtrys.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
