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
            WebElement select = driver.findElement(By.cssSelector("div[class='product-thumbnail'] a[title='LVE - ORION 2 (40W ) - Pod Kit']"));
            select.click();
            System.out.println("Đã chọn tab LVE - ORION 2 (40W ) - Pod Kit !");
            WebElement vape = driver.findElement(By.xpath("//h1[@class='title-product']"));
            WebElement price = driver.findElement(By.xpath("//span[@class='special-price']//span[1]"));

            System.out.println("Giá của "+ vape.getText() + " là: " + price.getText() );
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
