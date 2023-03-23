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
            driver.get("https://thebestvape.vn/san-pham-moi");
            WebElement select = driver.findElement(By.cssSelector(".ul_col"));
            select.click();
            WebElement option = driver.findElement(By.cssSelector("a[onclick=\"sortby('created-desc')\"]"));
            option.click();
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            System.out.println("Đã chụp lại hình !");
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            String fileWithPath = "image.png";
            File DestFile = new File(fileWithPath);
            FileHandler.copy(SrcFile,DestFile);
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
