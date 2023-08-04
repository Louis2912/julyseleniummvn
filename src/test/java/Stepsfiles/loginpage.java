package Stepsfiles;

import Pageobject.loginpagepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginpagepo login = new loginpagepo(driver);
//        driver.findElement(By.id("sa")).click();
        login.setUsername("standard_user");
        Thread.sleep(5000);
        login.setPassword("secret_sauce");
        Thread.sleep(5000);
        login.clickLoginbutton();
        Thread.sleep(5000);
        driver.quit();

    }
}
