import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        boolean status = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).isDisplayed();
        if (status){
            driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        }
        Actions act = new Actions(driver);
        WebElement electronics = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
        act.moveToElement(electronics).build().perform();
        Thread.sleep(5000);
        WebElement gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
        act.moveToElement(gaming).click().build().perform();
        Thread.sleep(5000);

//        act.moveToElement(electronics).moveToElement(gaming).click().build().perform();

//        driver.quit();

            //_6WOcW9 _2-k99T
            //_1BJVlg _11MZbx
            //(//a[@class='_6WOcW9'])[4]
            //"(//a[@class='_6WOcW9'])[3]"
    }
}
