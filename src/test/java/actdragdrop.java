import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actdragdrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement capitals = driver.findElement(By.id("box3"));
        WebElement country = driver.findElement(By.id("box103"));
        Actions act = new Actions(driver);
//        act.clickAndHold(capitals).moveToElement(country).release().build().perform();
//        act.dragAndDrop(capitals,country).build().perform();
        act.dragAndDrop(capitals,country).build().perform();
        Thread.sleep(5000);

    }
}
