package org.example.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.stream.ImageInputStream;
import java.time.Duration;


public class LoginPage {
    WebDriver driver;
    public void launchWebsite() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(4000);
    }
    public void enterAEmailAndPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("karthikgowdaaaa");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("67890987");


    }

}





