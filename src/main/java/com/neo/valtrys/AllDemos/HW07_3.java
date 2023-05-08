package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;

import java.util.Set;

public class HW07_3 extends BaseClass {
    public static void main(String[] args) {
        /*

================== HW_3 Overall Practice of WebElements and handling Windows, Alerts ======

1) Launch the browser and open the site "https://www.tutorialspoint.com/selenium/selenium_automation_practice"
2) Fill in the all text boxes, Choose your preferred radio button, check box and drop down option
EXCEPT Profile Picture (Dissmiss this Section)
3) Click on the Button and you will see an Alert pops up then click Ok
4) When user clicks on Ok new Window will open then get All window handles and get the size and Quit all of them

         */
        setUp();
        driver.findElement(By.name("firstname")).sendKeys("Val");
        driver.findElement(By.name("lastname")).sendKeys("Pal");
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        driver.findElement(By.xpath("//input[@value='7']")).click();
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("12/1");
        driver.findElement(By.name("profession")).click();
        driver.findElement(By.name("tool")).click();
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[9]/td[2]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[10]/td[2]/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[11]/td[2]/button" )).click();
        driver.switchTo().alert().accept();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());


        tearDown();
    }
}
