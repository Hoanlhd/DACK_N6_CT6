package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class test07 {
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try{
            driver.get("https://thebestvape.vn/san-pham-moi");
            WebElement select1 = driver.findElement(By.cssSelector("div[class='product-thumbnail'] a[title='LVE - ORION 2 (40W ) - Pod Kit']"));
            select1.click();
            WebElement addyt = driver.findElement(By.xpath("//a[normalize-space()='Yêu thích']"));
            addyt.click();
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
