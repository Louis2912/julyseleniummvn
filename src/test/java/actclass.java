import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class actclass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement clickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act = new Actions(driver);
        act.contextClick(clickbutton).build().perform();
        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        String alert = driver.switchTo().alert().getText();
        Assert.assertEquals(alert,"clicked: copy");
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.quit();

    }
}
