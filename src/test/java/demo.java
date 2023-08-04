import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        WebDriver driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/#");
        driver.findElement(By.id("inputUsername")).sendKeys("Hello@gmail.com");
    }
}
