import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class actslider {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");
        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/slider/colorpicker.html']"));
        driver.switchTo().frame(iframe1);
        WebElement red = driver.findElement(By.xpath("//div[@id='red']/div"));
        WebElement green = driver.findElement(By.xpath("//div[@id='green']/div"));
        WebElement blue = driver.findElement(By.xpath("//div[@id='blue']/div"));
        Actions act = new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        act.moveToElement(red).dragAndDropBy(red,100,0).build().perform();
        Thread.sleep(2000);
        act.moveToElement(green).dragAndDropBy(green,50,0).build().perform();
        Thread.sleep(2000);
        act.moveToElement(blue).dragAndDropBy(blue,200,0).build().perform();
        Thread.sleep(2000);
        String cssvalue = driver.findElement(By.id("swatch")).getCssValue("background-color");
        System.out.println(cssvalue);
        Assert.assertEquals(cssvalue,"rgba(211, 111, 198, 1)");
        WebElement phone = driver.findElement(By.xpath("//div[@class='icon_phone']"));
        act.scrollToElement(phone).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
