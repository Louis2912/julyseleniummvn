package Stepsfiles;

import Pageobject.shopshadowpo;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopshadow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shop.polymer-project.org/");
        SearchContext dom1= driver.findElement(By.xpath("//shop-app")).getShadowRoot();
        SearchContext dom2 = dom1.findElement(By.cssSelector("shop-home")).getShadowRoot();
//        driver.switchTo().
        shopshadowpo shadow = new shopshadowpo(driver);
        shadow.setShop();

    }
}
