package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Desktop {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        //click on build on Computers Link Text to verify the title: Build your own computer
        driver.findElement(By.xpath("//div/div[1]/div[2]/h2/a[@href=\"/build-your-own-computer\"]")).click();
        String actualText=driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
        System.out.println(actualText);
        driver.close();
    }
}
