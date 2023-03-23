package tests;


import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.*;
import org.testng.annotations.Test;



@Test
public class test05 {
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try{
            driver.get("https://thebestvape.vn/san-pham-moi");
            WebElement select = driver.findElement(By.cssSelector("div[class='product-thumbnail'] a[title='LVE - ORION 2 (40W ) - Pod Kit']"));
            select.click();
            WebElement addtocart = driver.findElement(By.cssSelector("button[class='btn btn_base normal_button btn_add_cart add_to_cart btn-cart'] span"));
            addtocart.click();
            WebElement cart = driver.findElement(By.cssSelector("div[class='col-lg-6 col-6 col-cart-account-main'] a[title='Giỏ hàng']"));
            cart.click();
            WebElement removeitem = driver.findElement(By.cssSelector("form[class='cart ajaxcart cartpage'] a[class='cart__btn-remove remove-item-cart ajaxifyCart--remove']"));
            removeitem.click();
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
