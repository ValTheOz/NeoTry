package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW09_2 extends BaseClass {
    /*TC: Delete Orders

1) Open chrome browser
2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/
WebOrders/login.aspx"
3) Login to the application
4) Click on the checkbox of all orders with product FamilyAlbum
5) Delete Selected orders
6) Verify the orders have been deleted
7) Quit the browser
     */
    public static void main(String[] args) {
        setUp();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        List<WebElement> infoInRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        for (int i = 0; i  < infoInRows.size(); i++) {
            if (infoInRows.get(i).getText().contains("FamilyAlbum")){
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr["+(i+1)+"]/td[1]/input")).click();
            }
        }
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
        List<WebElement> infoInRowsUpdated = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));


        for (int i = 0; i < infoInRowsUpdated.size(); i++) {
            if (infoInRowsUpdated.get(i).getText().contains("FamilyAlbum")){
                System.out.println("Error");
            }
        }
            tearDown();
    }
}
