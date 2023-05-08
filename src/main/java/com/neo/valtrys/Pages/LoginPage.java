package com.neo.valtrys.Pages;

import com.neo.valtrys.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    public WebElement username= driver.findElement(By.id("txtUsername"));
    public WebElement password= driver.findElement(By.id("textPassword"));
    public WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
}
