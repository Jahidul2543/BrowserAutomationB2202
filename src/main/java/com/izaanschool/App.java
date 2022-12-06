package com.izaanschool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        //System.setProperty( "webdriver.chrome.driver","driver/chromedriver");
        // where is the binary driver file
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://prayersconnect.com/"); // https://the-internet.herokuapp.com/
       String pageTitle = driver.getTitle();

       driver.findElement(By.linkText("Prayer Times")).click();
       System.out.println("CLiked on Prayer Times link");
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div/div[2]/div/div[1]/input")).clear();
       Thread.sleep(200);
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div[2]/div/div[2]/div/div[1]/input")).sendKeys("Newcastle, NSW");
       String ishaPrayerTime = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div/table/tbody/tr[6]/th[2]")).getText();
       System.out.println("Page Title: " + pageTitle);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime-startTime; //
        System.out.println("Execution Time: " + executionTime);

        driver.quit();
    }
}
