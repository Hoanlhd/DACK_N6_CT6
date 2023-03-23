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
            driver.get("https://thebestvape.vn/");
            WebElement account = driver.findElement(By.cssSelector("div[class='block-account'] span[class='info'] span:nth-child(1)"));
            account.click();
            WebElement email = driver.findElement(By.cssSelector("#customer_email"));
            email.sendKeys("abc123@gmail.com");
            WebElement pass = driver.findElement(By.cssSelector("#customer_password"));
            pass.sendKeys("Hoan12345");
            WebElement clicklogin = driver.findElement(By.cssSelector("input[value='Đăng nhập']"));
            clicklogin.click();
            WebElement xemdonhang = driver.findElement(By.cssSelector("body > div:nth-child(3) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(3) > li:nth-child(2) > a:nth-child(1)"));
            xemdonhang.click();


            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
