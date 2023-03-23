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
            WebElement select1 = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
            select1.click();
            WebElement duahaulanh = driver.findElement(By.xpath("//a[@class='setCompare btn-views js-compare-product-add pd-compare-product-add']"));
            duahaulanh.click();
            System.out.println("Đã thêm Dưa hấu lạnh vào so sánh");
            WebElement close = driver.findElement(By.cssSelector(".closeSidebar"));
            close.click();
            WebElement spmoi = driver.findElement(By.cssSelector("li[class='nav-item '] a[title='SẢN PHẨM MỚI']"));
            spmoi.click();
            WebElement select2 = driver.findElement(By.cssSelector("div[class='product-thumbnail'] a[title='Yogi Orchards - APPLE STRAWBERRY ICE ( Táo Dâu Tây Lạnh ) - Freebase']"));
            select2.click();
            WebElement daoxoailanh = driver.findElement(By.xpath("//a[@class='setCompare btn-views js-compare-product-add pd-compare-product-add']"));
            daoxoailanh.click();
            System.out.println("Đã thêm Đào xoài lạnh vào so sánh");
            WebElement sosanh = driver.findElement(By.cssSelector("a[title='Bấm vào đây để tới trang so sánh'] span"));
            sosanh.click();

            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
