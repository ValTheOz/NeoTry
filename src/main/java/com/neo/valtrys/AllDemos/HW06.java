package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW06 extends BaseClass {

    public static void main(String[] args) {
        /* Homework 1:
        Amazon Department List Verification
        Open chrome browser
        Go to "http://amazon.com/"
        Verify how many department options available.
        Print each department
        Select Computers
        Quit browser
         */
        setUp();
        WebElement options = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select searchDropDownBox = new Select(options);
        System.out.println("How many options " + searchDropDownBox.getOptions().size());
        for (WebElement department : searchDropDownBox.getOptions()) {
            System.out.println(department.getText());
            }
            searchDropDownBox.selectByVisibleText("Computers");
            tearDown();
    }
    }

