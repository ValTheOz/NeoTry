package com.neo.valtrys.AllDemos;

import com.neo.valtrys.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TeskC09 extends BaseClass {

    public static void main(String[] args) {

        setUp();
        WebElement table  = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody"));

        String expected = "Financial Center";
        String actual = table.getText();

        if (actual.equals(expected)){
            System.out.println("verified");
        } else {
            System.out.println("failed");
        }
        System.out.println("``Header data```");
        List<WebElement> headerData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
        for (WebElement data: headerData){
            System.out.println(data.getText() + "-");
        }
        System.out.println();
        System.out.println("``Row data``");
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));

        for (WebElement data : rowData){
            System.out.println(data.getText());
        }

        tearDown();
    }
}
