package com.neo.valtrys.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class CommonMethods extends BaseClass {

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void clickRadioOrCheckBox(List<WebElement> listElement, String value) {

        String actualValue;

        for (WebElement el : listElement) {
            actualValue = el.getAttribute("value").trim();
            if (actualValue.equals(value) && el.isEnabled()) {
                el.click();
            }
        }
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void selectDropDown(WebElement element, String visibleText) {
        try {
            Select s1 = new Select(element);
            List<WebElement> options = s1.getOptions();

            for (WebElement el : options) {
                if (el.getText().equals(visibleText)) {
                    s1.selectByVisibleText(visibleText);
                    break;
                }
            }
        } catch(UnexpectedTagNameException e) {
            e.printStackTrace();

        }

    }

    public static void selectDropDown(WebElement element, int index){
        try{



        Select select = new Select(element);
        int size = select.getOptions().size();

        if (size > index){
            select.selectByIndex(index);
        }}
        catch (UnexpectedTagNameException e){
            e.printStackTrace();
        }
    }

    public static void dismissAlert(){

        try{
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e){
            e.printStackTrace();
        }
    }

    public static String getAlertText(){
        String alertText = null;
        try {
            Alert alert = driver.switchTo().alert();
            alert.getText();
        } catch (NoAlertPresentException e){
            e.printStackTrace();
        }

        return alertText;
    }

    public static void sendAlertTest(String text){
        try {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys(text);
        }catch (NoAlertPresentException e ){
            e.printStackTrace();
        }
    }

    public static void switchToFrame(int index){
        try{
            driver.switchTo().frame(index);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }

    public static void switchToFrame(WebElement element){
        try{
            driver.switchTo().frame(element);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }
    public static void switchToChildWindow(WebElement element){
        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
       for (String window: windows){
           if (window.equals(mainWindow)){
               driver.switchTo().window(window);
           }
       }
    }

    public static WebDriverWait getWaitObject(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

        return wait;
    }

    public static WebElement waitForClickability(WebElement element){

        return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement waitForVisibility(WebElement element){

        return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }
}
