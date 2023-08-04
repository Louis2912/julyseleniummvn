import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actresize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        WebElement resizebox = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Actions act=new Actions(driver);
        act.moveToElement(resizebox).dragAndDropBy(resizebox,200,100).build().perform();
    }
}
