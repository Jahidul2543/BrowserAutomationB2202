package com.izaanschool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long startTime = System.currentTimeMillis();
       //System.setProperty( "webdriver.chrome.driver","driver/chromedriver");
        // where is the binary driver file
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

       String pageTitle = driver.getTitle();

        System.out.println("Page Title: " + pageTitle);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime-startTime; //
        System.out.println("Execution Time: " + executionTime);

        driver.quit();
    }
}
