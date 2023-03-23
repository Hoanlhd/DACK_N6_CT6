package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

@Test

public class test06 {
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try{
            driver.get("https://thebestvape.vn/");
            WebElement account = driver.findElement(By.cssSelector("a[title='SẢN PHẨM MỚI']"));
            account.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
