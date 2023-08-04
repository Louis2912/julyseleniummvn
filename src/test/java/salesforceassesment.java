import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceassesment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/?ir=1");
//        Thread.sleep(1000);
        SearchContext dom1= driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot();
//        Thread.sleep(2000);
        SearchContext dom2 = dom1.findElement(By.cssSelector("hgf-c360login")).getShadowRoot();
//        Thread.sleep(2000);
//        SearchContext dom3=dom2.findElement(By.cssSelector("hgf-button[data-name='login']")).getShadowRoot();
        dom2.findElement(By.cssSelector("span[slot='start']")).click();
        dom2.findElement(By.cssSelector("a[data-tracking-type='login']")).click();

    }
}
