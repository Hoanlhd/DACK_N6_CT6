package tests;


import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class test03 {
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try{
            driver.get("https://thebestvape.vn/san-pham-moi");
            WebElement vape = driver.findElement(By.xpath("//a[normalize-space()='LVE - ORION 2 (40W ) - Pod Kit']"));
            WebElement price = driver.findElement(By.xpath("//div[contains(text(),'1.350.000₫')]"));

            System.out.println("Giá của "+ vape.getText() + " là: " + price.getText() );
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
