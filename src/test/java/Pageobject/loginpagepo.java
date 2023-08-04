package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpagepo {

    public WebDriver driver;
    public loginpagepo(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver,this);
    }

    //Identification Part
    @FindBy(how = How.XPATH, using = "//input[@data-test='username']")
    @CacheLookup
    WebElement username;

    @FindBy(how = How.ID, using = "password")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    @CacheLookup
    WebElement loginbutton;


    //Operation Part

    public void setUsername(String usname){
        username.sendKeys(usname);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLoginbutton(){
        loginbutton.click();
    }


}
