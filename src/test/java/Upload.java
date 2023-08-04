import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Upload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("G:\\Batch July\\salesforce.txt");
//        Thread.sleep(5000);
        driver.findElement(By.id("file-submit")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String msg = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals(msg,"File Uploaded!");
        driver.quit();
    }
}
