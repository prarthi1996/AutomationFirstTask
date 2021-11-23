package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {

        static WebDriver driver;

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://demo.nopcommerce.com/");
            //Click on register button
            driver.findElement(By.xpath("//a[@href=\"/register?returnUrl=%2F\"]")).click();
            //Click Radio Button
            driver.findElement(By.id("gender-female")).click();
            //type first name
            driver.findElement(By.id("FirstName")).sendKeys("Praerrrt77666hi");
            //type LastName
            driver.findElement(By.id("LastName")).sendKeys("Zalaervddddadiya");
            //type email
            driver.findElement(By.id("Email")).sendKeys("Prarthi.zalavadiyaaa34dd@gmail.com");
            //Password
            driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kashyap2007@");
            //ConfirmPassword
            driver.findElement(By.id("ConfirmPassword")).sendKeys("Kashyap2007@");
            //Click Register Button
            driver.findElement(By.id("register-button")).click();
            //get text= registration completed
            String actualText =driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
            System.out.println(actualText);
            driver.close();

        }

    }
