package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class test09 {
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
            WebElement click = driver.findElement(By.cssSelector("a[title='SẢN PHẨM MỚI']"));
            click.click();
            WebElement select1 = driver.findElement(By.cssSelector("div[class='product-thumbnail'] a[title='LVE - ORION 2 (40W ) - Pod Kit']"));
            select1.click();
            WebElement addtocart = driver.findElement(By.cssSelector("button[class='btn btn_base normal_button btn_add_cart add_to_cart btn-cart'] span"));
            addtocart.click();
            WebElement cart = driver.findElement(By.cssSelector("div[class='col-lg-6 col-6 col-cart-account-main'] a[title='Giỏ hàng']"));
            cart.click();
            WebElement thanhtoan = driver.findElement(By.cssSelector("body > div:nth-child(3) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)"));
            thanhtoan.click();
            WebElement phone = driver.findElement(By.cssSelector("#billingPhone"));
            phone.sendKeys("0889069138");
            WebElement select = driver.findElement(By.cssSelector("#select2-billingProvince-container"));
            select.click();
            WebElement option1 = driver.findElement(By.cssSelector("input[role='searchbox']"));
            option1.sendKeys("TP Hồ Chí Minh");
            WebElement city = driver.findElement(By.cssSelector("#select2-billingDistrict-container"));
            city.click();
            WebElement paymentMethod = driver.findElement(By.cssSelector("#paymentMethod-251983"));
            paymentMethod.click();
            WebElement dathang = driver.findElement(By.cssSelector("div[class='order-summary__nav field__input-btn-wrapper hide-on-mobile layout-flex--row-reverse'] span[class='spinner-label']"));
            dathang.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
