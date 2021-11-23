package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class News {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        //Click on News link Text
        driver.findElement(By.xpath("//a[@href=\"/news\"]")).click();
        //Click on details to add comment
        driver.findElement(By.xpath("//div[@class='page-body']/div[1]/div[1]/div[3]/a")).click();
        //adding title to comment section
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Positive feedback");
        //adding comment in comment box
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("The Website is awesome");
        //click on add comment button
        driver.findElement(By.xpath("//button[@class='button-1 news-item-add-comment-button']")).click();
        //get text comments successfully added.
        String actualText=driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(actualText);
        driver.close();



    }
}
