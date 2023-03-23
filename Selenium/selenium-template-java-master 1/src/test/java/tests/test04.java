package tests;


import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class test04{
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try{
            driver.get("https://thebestvape.vn/san-pham-moi");
            WebElement select = driver.findElement(By.cssSelector(".ul_col"));
            select.click();
            WebElement option = driver.findElement(By.cssSelector("a[onclick=\"sortby('created-desc')\"]"));
            option.click();
            System.out.println("Đã chọn hàng mới nhất !");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
