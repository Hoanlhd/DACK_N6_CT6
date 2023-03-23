package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class test02 {
    public static void main(String[] args) {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        try {
            driver.get("https://thebestvape.vn/");
            String actualTitle = driver.getTitle();
            String expectedTitle = "THE BEST VAPE chuyên kinh doanh các loại vape - thuốc lá điện tử chính hãng";
            if(actualTitle.equalsIgnoreCase(expectedTitle))
                System.out.println("Title Matched");
            else
                System.out.println("Title didn't match");
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //7. Quit browser session
        driver.quit();
    }
}
