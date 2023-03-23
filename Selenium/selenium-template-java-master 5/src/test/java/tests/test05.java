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
            driver.get("https://thebestvape.vn/");
            WebElement account = driver.findElement(By.cssSelector("div[class='block-account'] span[class='info'] span:nth-child(1)"));
            account.click();
            WebElement email = driver.findElement(By.cssSelector("#customer_email"));
            email.sendKeys("abc123@gmail.com");
            WebElement pass = driver.findElement(By.cssSelector("#customer_password"));
            pass.sendKeys("Hoan12345");
            WebElement clicklogin = driver.findElement(By.cssSelector("input[value='Đăng nhập']"));
            clicklogin.click();
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            System.out.println("Đã chụp lại hình !");
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            String fileWithPath = "image.png";
            File DestFile = new File(fileWithPath);
            FileHandler.copy(SrcFile,DestFile);

            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
