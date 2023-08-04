import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class salesforce {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/");
        SearchContext dom1= driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dom1.findElement(By.cssSelector("img[alt='mobile menu open']")).click();
        SearchContext dom2 = dom1.findElement(By.cssSelector("hgf-c360login")).getShadowRoot();
        SearchContext dom3 = dom2.findElement(By.cssSelector("hgf-button[data-name='login']")).getShadowRoot();
//        dom3.findElement(By.cssSelector("button[part='button']")).click();
//        Thread.sleep(5000);
        dom2.findElement(By.cssSelector("span[slot='start']")).click();
        dom2.findElement(By.cssSelector("a[data-tracking-type='login']")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://login.salesforce.com/?locale=in");
        driver.quit();

    }
}
