package tests;


import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;


@Test
public class test05 {
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try{
            driver.get("https://thebestvape.vn/checkout/thankyou/cc2afddc767f4e38898c77bdbbbe2e08");
            WebElement email = driver.findElement(By.cssSelector("#email"));
            email.sendKeys("abc123@gmail.com");
            WebElement pass = driver.findElement(By.cssSelector("#orderNumber"));
            pass.sendKeys("#56970");
            WebElement clicklogin = driver.findElement(By.cssSelector("button[type='submit']"));
            clicklogin.click();
            WebElement in = driver.findElement(By.cssSelector(".fa.fa-print"));
            in.click();


            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
