package tests;

import enums.Browser;
import factory.BrowserProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class test01 {
    public static void testLaunchBrowser() {
        WebDriver driver = BrowserProvider.createDriver(Browser.CHROME);
        driver.get("http://thebestvape.vn");
        //Debug only
        try {
            Thread.sleep(2000);
        } catch (Exception ignored) {
        }
        driver.close();
        driver.quit();
    }
}
