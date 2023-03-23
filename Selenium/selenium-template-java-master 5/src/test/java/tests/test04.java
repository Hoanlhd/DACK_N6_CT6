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
            WebElement register = driver.findElement(By.cssSelector(".btn-link-style.btn-register"));
            register.click();
            WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
            lastName.sendKeys("Trần");
            WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
            firstName.sendKeys("Khải Hoàn");
            WebElement email = driver.findElement(By.cssSelector("#email"));
            email.sendKeys("abc12@gmail.com");
            WebElement phone = driver.findElement(By.cssSelector("input[placeholder='Số điện thoại']"));
            phone.sendKeys("0889069138");
            WebElement pass = driver.findElement(By.cssSelector("#password"));
            pass.sendKeys("Hoan12345");
            WebElement clickregister = driver.findElement(By.cssSelector("#button[value='Đăng ký']"));
            clickregister.click();

            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
